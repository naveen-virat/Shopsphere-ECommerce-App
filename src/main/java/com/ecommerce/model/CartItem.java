package com.ecommerce.model;

/**
 * CartItem entity representing a single item in the shopping cart.
 * Contains product ID, product name, price, and quantity.
 */
public class CartItem {
    private String productId;   // Product ID
    private String productName; // Product name (for display purposes)
    private double price;       // Product price
    private int quantity;       // Quantity of this product in cart

    /**
     * Default constructor for CartItem.
     */
    public CartItem() {
    }

    /**
     * Parameterized constructor for CartItem.
     *
     * @param productId   Product ID
     * @param productName Product name
     * @param price       Product price
     * @param quantity    Quantity
     */
    public CartItem(String productId, String productName, double price, int quantity) {
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
     * Calculate the subtotal for this cart item.
     *
     * @return Subtotal (price * quantity)
     */
    public double getSubtotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("Product: %s (ID: %s) | Price: $%.2f | Qty: %d | Subtotal: $%.2f",
                productName, productId, price, quantity, getSubtotal());
    }
}
