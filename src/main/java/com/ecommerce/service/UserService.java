package com.ecommerce.service;

import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.util.IdGenerator;
import com.ecommerce.util.InputValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * UserService class for handling user-related business logic.
 * Manages user registration, login, and CRUD operations with validation.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Register a new user.
     *
     * @param user User to register
     * @return Registered user with generated ID
     * @throws IllegalArgumentException if validation fails or email already exists
     */
    public User registerUser(User user) {
        // Validate user data
        if (!InputValidator.isNotEmpty(user.getName())) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (!InputValidator.isValidEmail(user.getEmail())) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (!InputValidator.isValidPassword(user.getPassword())) {
            throw new IllegalArgumentException("Password must be at least 6 characters");
        }

        // Check if email already exists
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("Email already registered");
        }

        // Generate custom ID
        long count = userRepository.count();
        user.setId(IdGenerator.generateUserId(count));

        // Save and return user
        return userRepository.save(user);
    }

    /**
     * Login user with email and password.
     *
     * @param email    User's email
     * @param password User's password
     * @return Optional containing the user if credentials are valid
     */
    public Optional<User> loginUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    /**
     * Get user by ID.
     *
     * @param id User ID
     * @return Optional containing the user if found
     */
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    /**
     * Get user by email.
     *
     * @param email User's email
     * @return Optional containing the user if found
     */
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    /**
     * Get all users.
     *
     * @return List of all users
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Update user information.
     *
     * @param id          User ID
     * @param updatedUser Updated user data
     * @return Updated user
     * @throws IllegalArgumentException if user not found or validation fails
     */
    public User updateUser(String id, User updatedUser) {
        Optional<User> existingUser = userRepository.findById(id);
        
        if (existingUser.isEmpty()) {
            throw new IllegalArgumentException("User with ID " + id + " not found");
        }

        // Validate updated data
        if (!InputValidator.isNotEmpty(updatedUser.getName())) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (InputValidator.isNotEmpty(updatedUser.getPassword()) 
            && !InputValidator.isValidPassword(updatedUser.getPassword())) {
            throw new IllegalArgumentException("Password must be at least 6 characters");
        }

        // Update user
        User user = existingUser.get();
        user.setName(updatedUser.getName());
        user.setAddress(updatedUser.getAddress());
        
        // Update password only if provided
        if (InputValidator.isNotEmpty(updatedUser.getPassword())) {
            user.setPassword(updatedUser.getPassword());
        }

        return userRepository.save(user);
    }

    /**
     * Delete a user by ID.
     *
     * @param id User ID
     * @return true if deleted, false if not found
     */
    public boolean deleteUser(String id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    /**
     * Check if email exists in database.
     *
     * @param email Email to check
     * @return true if email exists, false otherwise
     */
    public boolean emailExists(String email) {
        return userRepository.existsByEmail(email);
    }
}
