package com.ecommerce.util;

import org.springframework.stereotype.Component;

/**
 * IdGenerator utility class for generating unique IDs for entities.
 * Generates IDs in the format: P001, U001, O001, etc.
 * Note: With Spring Data MongoDB, we rely on MongoDB auto-generation for actual IDs,
 * but this can be used for custom ID generation if needed.
 */
@Component
public class IdGenerator {

    /**
     * Generate the next product ID based on count.
     * Format: P001, P002, P003, etc.
     *
     * @param count Current count of products
     * @return Next product ID
     */
    public static String generateProductId(long count) {
        return String.format("P%03d", count + 1);
    }

    /**
     * Generate the next user ID based on count.
     * Format: U001, U002, U003, etc.
     *
     * @param count Current count of users
     * @return Next user ID
     */
    public static String generateUserId(long count) {
        return String.format("U%03d", count + 1);
    }

    /**
     * Generate the next order ID based on count.
     * Format: O001, O002, O003, etc.
     *
     * @param count Current count of orders
     * @return Next order ID
     */
    public static String generateOrderId(long count) {
        return String.format("O%03d", count + 1);
    }

    /**
     * Extract the numeric part from an ID.
     * Example: "P001" -> 1, "U123" -> 123
     *
     * @param id ID string
     * @return Numeric part of the ID
     */
    public static int getIdNumber(String id) {
        if (id == null || id.length() < 2) {
            return 0;
        }
        try {
            return Integer.parseInt(id.substring(1));
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
