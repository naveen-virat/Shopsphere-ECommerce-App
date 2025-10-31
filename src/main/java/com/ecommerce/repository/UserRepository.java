package com.ecommerce.repository;

import com.ecommerce.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * UserRepository interface for database operations on User collection.
 * Extends MongoRepository to provide CRUD operations and custom queries.
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

    /**
     * Find user by email address.
     *
     * @param email User's email address
     * @return Optional containing the user if found
     */
    Optional<User> findByEmail(String email);

    /**
     * Check if a user exists with the given email.
     *
     * @param email User's email address
     * @return true if user exists, false otherwise
     */
    boolean existsByEmail(String email);

    /**
     * Find user by email and password (for login).
     *
     * @param email    User's email address
     * @param password User's password
     * @return Optional containing the user if credentials are valid
     */
    Optional<User> findByEmailAndPassword(String email, String password);
}
