package com.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * User entity representing a registered user in the e-commerce system.
 * Each user has a unique ID, name, email, password, and address.
 */
@Document(collection = "users")
public class User {
    @Id
    private String id;       // User ID (e.g., "U001")
    private String name;     // User's full name
    
    @Indexed(unique = true)
    private String email;    // User's email address (unique)
    private String password; // User's password
    private String address;  // User's shipping address

    /**
     * Default constructor for User.
     */
    public User() {
    }

    /**
     * Parameterized constructor for User.
     *
     * @param id       User ID
     * @param name     User's full name
     * @param email    User's email address
     * @param password User's password
     * @param address  User's shipping address
     */
    public User(String id, String name, String email, String password, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("User ID: %s | Name: %s | Email: %s | Address: %s",
                id, name, email, address);
    }
}
