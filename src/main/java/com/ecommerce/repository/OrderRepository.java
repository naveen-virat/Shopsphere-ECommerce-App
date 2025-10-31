package com.ecommerce.repository;

import com.ecommerce.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * OrderRepository interface for database operations on Order collection.
 * Extends MongoRepository to provide CRUD operations and custom queries.
 */
@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

    /**
     * Find all orders by user ID.
     *
     * @param userId User's ID
     * @return List of orders placed by the user
     */
    List<Order> findByUserId(String userId);

    /**
     * Find orders by payment status.
     *
     * @param paymentStatus Payment status
     * @return List of orders with the specified payment status
     */
    List<Order> findByPaymentStatus(String paymentStatus);

    /**
     * Find orders by user ID and payment status.
     *
     * @param userId        User's ID
     * @param paymentStatus Payment status
     * @return List of orders matching the criteria
     */
    List<Order> findByUserIdAndPaymentStatus(String userId, String paymentStatus);

    /**
     * Count orders by user ID.
     *
     * @param userId User's ID
     * @return Number of orders placed by the user
     */
    long countByUserId(String userId);
}
