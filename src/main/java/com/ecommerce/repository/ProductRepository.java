package com.ecommerce.repository;

import com.ecommerce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * ProductRepository interface for database operations on Product collection.
 * Extends MongoRepository to provide CRUD operations and custom queries.
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    /**
     * Find products by category.
     *
     * @param category Product category
     * @return List of products in the specified category
     */
    List<Product> findByCategory(String category);

    /**
     * Find products by name containing a specific string (case-insensitive).
     *
     * @param name Product name or part of name
     * @return List of products matching the name
     */
    List<Product> findByNameContainingIgnoreCase(String name);

    /**
     * Find products with stock quantity greater than zero.
     *
     * @return List of products in stock
     */
    List<Product> findByStockQuantityGreaterThan(int quantity);

    /**
     * Find product by exact name.
     *
     * @param name Product name
     * @return Optional containing the product if found
     */
    Optional<Product> findByName(String name);
}
