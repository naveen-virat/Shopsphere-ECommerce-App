package com.ecommerce.util;

import java.util.regex.Pattern;

/**
 * InputValidator utility class for validating user inputs.
 * Provides methods to validate email, price, quantity, and other inputs.
 */
public class InputValidator {

    // Email validation pattern
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
    );

    /**
     * Validate email format.
     *
     * @param email Email address to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email.trim()).matches();
    }

    /**
     * Validate price value.
     * Price must be a positive number.
     *
     * @param price Price to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidPrice(double price) {
        return price > 0;
    }

    /**
     * Validate quantity value.
     * Quantity must be a positive integer.
     *
     * @param quantity Quantity to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidQuantity(int quantity) {
        return quantity > 0;
    }

    /**
     * Validate stock quantity value.
     * Stock quantity must be non-negative.
     *
     * @param stock Stock quantity to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidStock(int stock) {
        return stock >= 0;
    }

    /**
     * Validate if a string is not empty.
     *
     * @param str String to validate
     * @return true if not empty, false otherwise
     */
    public static boolean isNotEmpty(String str) {
        return str != null && !str.trim().isEmpty();
    }

    /**
     * Validate password strength.
     * Password must be at least 6 characters long.
     *
     * @param password Password to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidPassword(String password) {
        return password != null && password.length() >= 6;
    }

    /**
     * Sanitize string input by trimming whitespace.
     *
     * @param input Input string
     * @return Sanitized string
     */
    public static String sanitize(String input) {
        return input == null ? "" : input.trim();
    }
}
