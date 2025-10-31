package com.ecommerce.service;

import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Order;
import com.ecommerce.model.OrderItem;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.util.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * OrderService class for handling order operations.
 * Manages order placement, viewing, and payment processing.
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;

    /**
     * Place an order from user's cart.
     *
     * @param userId User ID
     * @return Created order
     * @throws IllegalArgumentException if cart is empty or validation fails
     */
    public Order placeOrder(String userId) {
        // Get user's cart
        Optional<Cart> cartOpt = cartService.viewCart(userId);
        
        if (cartOpt.isEmpty() || cartOpt.get().getItems().isEmpty()) {
            throw new IllegalArgumentException("Cart is empty. Add items before placing order.");
        }

        Cart cart = cartOpt.get();

        // Validate stock for all items
        for (CartItem cartItem : cart.getItems()) {
            if (!productService.hasStock(cartItem.getProductId(), cartItem.getQuantity())) {
                throw new IllegalArgumentException("Insufficient stock for product: " + cartItem.getProductName());
            }
        }

        // Create order
        Order order = new Order();
        
        // Generate custom ID
        long count = orderRepository.count();
        order.setId(IdGenerator.generateOrderId(count));
        
        order.setUserId(userId);
        order.setOrderDate(LocalDateTime.now());
        order.setTotalAmount(cart.getTotalAmount());
        order.setPaymentStatus("PENDING");

        // Convert cart items to order items
        List<OrderItem> orderItems = new ArrayList<>();
        for (CartItem cartItem : cart.getItems()) {
            OrderItem orderItem = new OrderItem(
                cartItem.getProductId(),
                cartItem.getProductName(),
                cartItem.getPrice(),
                cartItem.getQuantity()
            );
            orderItems.add(orderItem);
        }
        order.setItems(orderItems);

        // Save order
        Order savedOrder = orderRepository.save(order);

        // Reduce stock for each product
        for (CartItem cartItem : cart.getItems()) {
            productService.updateStock(cartItem.getProductId(), -cartItem.getQuantity());
        }

        // Clear cart after successful order
        cartService.clearCart(userId);

        return savedOrder;
    }

    /**
     * Simulate payment processing for an order.
     *
     * @param orderId Order ID
     * @param success Whether payment is successful
     * @return Updated order
     * @throws IllegalArgumentException if order not found
     */
    public Order processPayment(String orderId, boolean success) {
        Optional<Order> orderOpt = orderRepository.findById(orderId);
        
        if (orderOpt.isEmpty()) {
            throw new IllegalArgumentException("Order not found");
        }

        Order order = orderOpt.get();
        
        if (success) {
            order.setPaymentStatus("PAID");
        } else {
            order.setPaymentStatus("FAILED");
        }

        return orderRepository.save(order);
    }

    /**
     * Get all orders for a user.
     *
     * @param userId User ID
     * @return List of user's orders
     */
    public List<Order> getUserOrders(String userId) {
        return orderRepository.findByUserId(userId);
    }

    /**
     * Get order by ID.
     *
     * @param orderId Order ID
     * @return Optional containing the order if found
     */
    public Optional<Order> getOrderById(String orderId) {
        return orderRepository.findById(orderId);
    }

    /**
     * Get all orders.
     *
     * @return List of all orders
     */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    /**
     * Get orders by payment status.
     *
     * @param status Payment status
     * @return List of orders with the specified status
     */
    public List<Order> getOrdersByStatus(String status) {
        return orderRepository.findByPaymentStatus(status);
    }

    /**
     * Cancel an order (only if payment is pending).
     *
     * @param orderId Order ID
     * @return true if cancelled, false otherwise
     * @throws IllegalArgumentException if order not found or already paid
     */
    public boolean cancelOrder(String orderId) {
        Optional<Order> orderOpt = orderRepository.findById(orderId);
        
        if (orderOpt.isEmpty()) {
            throw new IllegalArgumentException("Order not found");
        }

        Order order = orderOpt.get();
        
        if ("PAID".equals(order.getPaymentStatus())) {
            throw new IllegalArgumentException("Cannot cancel a paid order");
        }

        // Restore stock
        for (OrderItem item : order.getItems()) {
            productService.updateStock(item.getProductId(), item.getQuantity());
        }

        // Delete order
        orderRepository.deleteById(orderId);
        return true;
    }

    /**
     * Get order count for a user.
     *
     * @param userId User ID
     * @return Number of orders
     */
    public long getUserOrderCount(String userId) {
        return orderRepository.countByUserId(userId);
    }
}
