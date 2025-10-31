package com.ecommerce.service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.util.IdGenerator;
import com.ecommerce.util.InputValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * ProductService class for handling product-related business logic.
 * Manages CRUD operations for products with validation.
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * Add a new product to the database.
     *
     * @param product Product to add
     * @return Saved product with generated ID
     * @throws IllegalArgumentException if validation fails
     */
    public Product addProduct(Product product) {
        // Validate product data
        if (!InputValidator.isNotEmpty(product.getName())) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (!InputValidator.isValidPrice(product.getPrice())) {
            throw new IllegalArgumentException("Product price must be greater than 0");
        }
        if (!InputValidator.isValidStock(product.getStockQuantity())) {
            throw new IllegalArgumentException("Stock quantity cannot be negative");
        }

        // Generate custom ID
        long count = productRepository.count();
        product.setId(IdGenerator.generateProductId(count));

        // Save and return product
        return productRepository.save(product);
    }

    /**
     * Get all products from the database.
     *
     * @return List of all products
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * Get product by ID.
     *
     * @param id Product ID
     * @return Optional containing the product if found
     */
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    /**
     * Get products by category.
     *
     * @param category Product category
     * @return List of products in the category
     */
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    /**
     * Search products by name.
     *
     * @param name Product name or part of name
     * @return List of matching products
     */
    public List<Product> searchProductsByName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }

    /**
     * Get products in stock (stock quantity > 0).
     *
     * @return List of products in stock
     */
    public List<Product> getProductsInStock() {
        return productRepository.findByStockQuantityGreaterThan(0);
    }

    /**
     * Update an existing product.
     *
     * @param id             Product ID
     * @param updatedProduct Updated product data
     * @return Updated product
     * @throws IllegalArgumentException if product not found or validation fails
     */
    public Product updateProduct(String id, Product updatedProduct) {
        Optional<Product> existingProduct = productRepository.findById(id);
        
        if (existingProduct.isEmpty()) {
            throw new IllegalArgumentException("Product with ID " + id + " not found");
        }

        // Validate updated data
        if (!InputValidator.isNotEmpty(updatedProduct.getName())) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (!InputValidator.isValidPrice(updatedProduct.getPrice())) {
            throw new IllegalArgumentException("Product price must be greater than 0");
        }
        if (!InputValidator.isValidStock(updatedProduct.getStockQuantity())) {
            throw new IllegalArgumentException("Stock quantity cannot be negative");
        }

        // Update product
        Product product = existingProduct.get();
        product.setName(updatedProduct.getName());
        product.setCategory(updatedProduct.getCategory());
        product.setDescription(updatedProduct.getDescription());
        product.setPrice(updatedProduct.getPrice());
        product.setStockQuantity(updatedProduct.getStockQuantity());

        return productRepository.save(product);
    }

    /**
     * Delete a product by ID.
     *
     * @param id Product ID
     * @return true if deleted, false if not found
     */
    public boolean deleteProduct(String id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }

    /**
     * Update stock quantity for a product.
     *
     * @param productId Product ID
     * @param quantity  Quantity to add (positive) or subtract (negative)
     * @return Updated product
     * @throws IllegalArgumentException if product not found or insufficient stock
     */
    public Product updateStock(String productId, int quantity) {
        Optional<Product> productOpt = productRepository.findById(productId);
        
        if (productOpt.isEmpty()) {
            throw new IllegalArgumentException("Product not found");
        }

        Product product = productOpt.get();
        int newStock = product.getStockQuantity() + quantity;

        if (newStock < 0) {
            throw new IllegalArgumentException("Insufficient stock");
        }

        product.setStockQuantity(newStock);
        return productRepository.save(product);
    }

    /**
     * Check if product has sufficient stock.
     *
     * @param productId Product ID
     * @param quantity  Required quantity
     * @return true if sufficient stock available
     */
    public boolean hasStock(String productId, int quantity) {
        Optional<Product> product = productRepository.findById(productId);
        return product.isPresent() && product.get().getStockQuantity() >= quantity;
    }
}
