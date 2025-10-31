package com.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Product entity representing a product in the e-commerce system.
 * Each product has a unique ID, name, category, description, price, and stock quantity.
 */
@Document(collection = "products")
public class Product {
    @Id
    private String id;           // Product ID (e.g., "P001")
    private String name;         // Product name
    private String category;     // Product category (e.g., Electronics, Clothing)
    private String description;  // Product description
    private double price;        // Product price
    private int stockQuantity;   // Available stock quantity

    /**
     * Default constructor for Product.
     */
    public Product() {
    }

    /**
     * Parameterized constructor for Product.
     *
     * @param id            Product ID
     * @param name          Product name
     * @param category      Product category
     * @param description   Product description
     * @param price         Product price
     * @param stockQuantity Available stock quantity
     */
    public Product(String id, String name, String category, String description, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Category: %s | Price: $%.2f | Stock: %d\nDescription: %s",
                id, name, category, price, stockQuantity, description);
    }
}
