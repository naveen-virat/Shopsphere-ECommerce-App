package com.ecommerce.model;

/**
 * OrderItem entity representing a single item in an order.
 * Contains product ID, product name, price, and quantity.
 */
public class OrderItem {
    private String productId;   // Product ID
    private String productName; // Product name
    private double price;       // Product price at the time of order
    private int quantity;       // Quantity ordered

    /**
     * Default constructor for OrderItem.
     */
    public OrderItem() {
    }

    /**
     * Parameterized constructor for OrderItem.
     *
     * @param productId   Product ID
     * @param productName Product name
     * @param price       Product price
     * @param quantity    Quantity
     */
    public OrderItem(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Calculate the subtotal for this order item.
     *
     * @return Subtotal (price * quantity)
     */
    public double getSubtotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("    %s (ID: %s) - Qty: %d x $%.2f = $%.2f",
                productName, productId, quantity, price, getSubtotal());
    }
}
