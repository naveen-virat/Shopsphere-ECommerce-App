package com.ecommerce.repository;

import com.ecommerce.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * CartRepository interface for database operations on Cart collection.
 * Extends MongoRepository to provide CRUD operations and custom queries.
 */
@Repository
public interface CartRepository extends MongoRepository<Cart, String> {

    /**
     * Find cart by user ID.
     *
     * @param userId User's ID
     * @return Optional containing the cart if found
     */
    Optional<Cart> findByUserId(String userId);

    /**
     * Delete cart by user ID.
     *
     * @param userId User's ID
     */
    void deleteByUserId(String userId);

    /**
     * Check if cart exists for a user.
     *
     * @param userId User's ID
     * @return true if cart exists, false otherwise
     */
    boolean existsByUserId(String userId);
}
