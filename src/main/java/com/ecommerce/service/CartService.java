package com.ecommerce.service;

import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Product;
import com.ecommerce.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * CartService class for handling shopping cart operations.
 * Manages adding, removing, and viewing cart items.
 */
@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductService productService;

    /**
     * Get or create cart for a user.
     *
     * @param userId User ID
     * @return User's cart
     */
    public Cart getOrCreateCart(String userId) {
        Optional<Cart> cartOpt = cartRepository.findByUserId(userId);
        
        if (cartOpt.isPresent()) {
            return cartOpt.get();
        } else {
            // Create new cart
            Cart cart = new Cart(userId);
            return cartRepository.save(cart);
        }
    }

    /**
     * Add product to cart.
     *
     * @param userId    User ID
     * @param productId Product ID
     * @param quantity  Quantity to add
     * @return Updated cart
     * @throws IllegalArgumentException if product not found or insufficient stock
     */
    public Cart addToCart(String userId, String productId, int quantity) {
        // Validate product exists and has stock
        Optional<Product> productOpt = productService.getProductById(productId);
        
        if (productOpt.isEmpty()) {
            throw new IllegalArgumentException("Product not found");
        }

        Product product = productOpt.get();

        if (!productService.hasStock(productId, quantity)) {
            throw new IllegalArgumentException("Insufficient stock. Available: " + product.getStockQuantity());
        }

        // Get or create cart
        Cart cart = getOrCreateCart(userId);

        // Create cart item
        CartItem cartItem = new CartItem(
            product.getId(),
            product.getName(),
            product.getPrice(),
            quantity
        );

        // Add item to cart
        cart.addItem(cartItem);

        // Save and return cart
        return cartRepository.save(cart);
    }

    /**
     * Remove product from cart.
     *
     * @param userId    User ID
     * @param productId Product ID
     * @return Updated cart
     * @throws IllegalArgumentException if cart not found
     */
    public Cart removeFromCart(String userId, String productId) {
        Optional<Cart> cartOpt = cartRepository.findByUserId(userId);
        
        if (cartOpt.isEmpty()) {
            throw new IllegalArgumentException("Cart not found");
        }

        Cart cart = cartOpt.get();
        
        if (!cart.removeItem(productId)) {
            throw new IllegalArgumentException("Product not found in cart");
        }

        return cartRepository.save(cart);
    }

    /**
     * Update item quantity in cart.
     *
     * @param userId    User ID
     * @param productId Product ID
     * @param quantity  New quantity
     * @return Updated cart
     * @throws IllegalArgumentException if validation fails
     */
    public Cart updateQuantity(String userId, String productId, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }

        // Check stock availability
        if (!productService.hasStock(productId, quantity)) {
            Optional<Product> productOpt = productService.getProductById(productId);
            int available = productOpt.map(Product::getStockQuantity).orElse(0);
            throw new IllegalArgumentException("Insufficient stock. Available: " + available);
        }

        Optional<Cart> cartOpt = cartRepository.findByUserId(userId);
        
        if (cartOpt.isEmpty()) {
            throw new IllegalArgumentException("Cart not found");
        }

        Cart cart = cartOpt.get();

        // Find and update item
        boolean found = false;
        for (CartItem item : cart.getItems()) {
            if (item.getProductId().equals(productId)) {
                item.setQuantity(quantity);
                found = true;
                break;
            }
        }

        if (!found) {
            throw new IllegalArgumentException("Product not found in cart");
        }

        cart.calculateTotal();
        return cartRepository.save(cart);
    }

    /**
     * View cart for a user.
     *
     * @param userId User ID
     * @return User's cart
     */
    public Optional<Cart> viewCart(String userId) {
        return cartRepository.findByUserId(userId);
    }

    /**
     * Clear all items from cart.
     *
     * @param userId User ID
     */
    public void clearCart(String userId) {
        Optional<Cart> cartOpt = cartRepository.findByUserId(userId);
        
        if (cartOpt.isPresent()) {
            Cart cart = cartOpt.get();
            cart.clearCart();
            cartRepository.save(cart);
        }
    }

    /**
     * Delete cart for a user.
     *
     * @param userId User ID
     */
    public void deleteCart(String userId) {
        cartRepository.deleteByUserId(userId);
    }

    /**
     * Check if cart is empty.
     *
     * @param userId User ID
     * @return true if cart is empty or doesn't exist
     */
    public boolean isCartEmpty(String userId) {
        Optional<Cart> cartOpt = cartRepository.findByUserId(userId);
        return cartOpt.isEmpty() || cartOpt.get().getItems().isEmpty();
    }
}
