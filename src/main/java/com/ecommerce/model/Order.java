package com.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Order entity representing a customer order.
 * Contains order ID, user ID, list of ordered products, order date, total amount, and payment status.
 */
@Document(collection = "orders")
public class Order {
    @Id
    private String id;                  // Order ID (e.g., "O001")
    private String userId;              // User ID who placed the order
    private List<OrderItem> items;      // List of ordered products
    private LocalDateTime orderDate;    // Date and time when order was placed
    private double totalAmount;         // Total order amount
    private String paymentStatus;       // Payment status (e.g., "PAID", "PENDING", "FAILED")

    /**
     * Default constructor for Order.
     */
    public Order() {
        this.items = new ArrayList<>();
        this.orderDate = LocalDateTime.now();
        this.paymentStatus = "PENDING";
    }

    /**
     * Parameterized constructor for Order.
     *
     * @param id            Order ID
     * @param userId        User ID
     * @param items         List of order items
     * @param totalAmount   Total amount
     * @param paymentStatus Payment status
     */
    public Order(String id, String userId, List<OrderItem> items, double totalAmount, String paymentStatus) {
        this.id = id;
        this.userId = userId;
        this.items = items;
        this.orderDate = LocalDateTime.now();
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(id).append("\n");
        sb.append("Order Date: ").append(orderDate.format(formatter)).append("\n");
        sb.append("Payment Status: ").append(paymentStatus).append("\n");
        sb.append("Items:\n");
        
        for (OrderItem item : items) {
            sb.append(item.toString()).append("\n");
        }
        
        sb.append(String.format("Total Amount: $%.2f\n", totalAmount));
        
        return sb.toString();
    }
}
