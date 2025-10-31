package com.ecommerce;

import com.ecommerce.model.*;
import com.ecommerce.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * CLI (Command Line Interface) for ShopSphere Application.
 * Implements CommandLineRunner to run after Spring Boot application starts.
 * Provides text-based menu system for all shopping operations.
 */
@Component
public class ECommerceCLI implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderService orderService;

    private Scanner scanner;
    private User currentUser;

    @Override
    public void run(String... args) {
        scanner = new Scanner(System.in);
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("           WELCOME TO SHOPSPHERE - YOUR SHOPPING UNIVERSE");
        System.out.println("=".repeat(70));

        // Main application loop
        boolean running = true;
        while (running) {
            if (currentUser == null) {
                running = showLoginMenu();
            } else {
                running = showMainMenu();
            }
        }

        scanner.close();
        System.out.println("\nThank you for shopping with ShopSphere. Goodbye!");
    }

    /**
     * Show login/registration menu.
     *
     * @return true to continue, false to exit
     */
    private boolean showLoginMenu() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("LOGIN / REGISTRATION MENU");
        System.out.println("=".repeat(70));
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Browse Products (Guest)");
        System.out.println("4. Exit");
        System.out.print("\nEnter your choice: ");

        int choice = getIntInput();

        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 3:
                browseProducts();
                break;
            case 4:
                return false;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        return true;
    }

    /**
     * Show main menu after login.
     *
     * @return true to continue, false to exit
     */
    private boolean showMainMenu() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("MAIN MENU - Welcome, " + currentUser.getName() + "!");
        System.out.println("=".repeat(70));
        System.out.println("1. Product Catalog");
        System.out.println("2. Shopping Cart");
        System.out.println("3. Orders");
        System.out.println("4. My Profile");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
        System.out.print("\nEnter your choice: ");

        int choice = getIntInput();

        switch (choice) {
            case 1:
                productCatalogMenu();
                break;
            case 2:
                shoppingCartMenu();
                break;
            case 3:
                ordersMenu();
                break;
            case 4:
                viewProfile();
                break;
            case 5:
                logout();
                break;
            case 6:
                return false;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        return true;
    }

    /**
     * Login functionality.
     */
    private void login() {
        System.out.println("\n--- USER LOGIN ---");
        System.out.print("Email: ");
        String email = scanner.nextLine().trim();
        System.out.print("Password: ");
        String password = scanner.nextLine().trim();

        Optional<User> userOpt = userService.loginUser(email, password);

        if (userOpt.isPresent()) {
            currentUser = userOpt.get();
            System.out.println("\n✓ Login successful! Welcome, " + currentUser.getName() + "!");
        } else {
            System.out.println("\n✗ Login failed! Invalid email or password.");
        }
    }

    /**
     * Registration functionality.
     */
    private void register() {
        System.out.println("\n--- USER REGISTRATION ---");
        System.out.print("Full Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Email: ");
        String email = scanner.nextLine().trim();
        System.out.print("Password (min 6 characters): ");
        String password = scanner.nextLine().trim();
        System.out.print("Address: ");
        String address = scanner.nextLine().trim();

        try {
            User user = new User(null, name, email, password, address);
            User registeredUser = userService.registerUser(user);
            System.out.println("\n✓ Registration successful!");
            System.out.println("Your User ID: " + registeredUser.getId());
            System.out.println("You can now login with your credentials.");
        } catch (IllegalArgumentException e) {
            System.out.println("\n✗ Registration failed: " + e.getMessage());
        }
    }

    /**
     * Logout functionality.
     */
    private void logout() {
        System.out.println("\n✓ Logged out successfully!");
        currentUser = null;
    }

    /**
     * View user profile.
     */
    private void viewProfile() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("MY PROFILE");
        System.out.println("=".repeat(70));
        System.out.println(currentUser.toString());
        
        long orderCount = orderService.getUserOrderCount(currentUser.getId());
        System.out.println("Total Orders: " + orderCount);
    }

    /**
     * Product catalog menu.
     */
    private void productCatalogMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n" + "=".repeat(70));
            System.out.println("PRODUCT CATALOG");
            System.out.println("=".repeat(70));
            System.out.println("1. View All Products");
            System.out.println("2. Search Products by Name");
            System.out.println("3. View Products by Category");
            System.out.println("4. Add Product to Cart");
            System.out.println("5. Back to Main Menu");
            System.out.print("\nEnter your choice: ");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    viewAllProducts();
                    break;
                case 2:
                    searchProducts();
                    break;
                case 3:
                    viewProductsByCategory();
                    break;
                case 4:
                    addProductToCart();
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    /**
     * Browse products (for guest users).
     */
    private void browseProducts() {
        viewAllProducts();
        System.out.println("\nPlease login or register to add products to cart.");
    }

    /**
     * View all products.
     */
    private void viewAllProducts() {
        List<Product> products = productService.getAllProducts();
        displayProducts(products);
    }

    /**
     * Search products by name.
     */
    private void searchProducts() {
        System.out.print("\nEnter product name to search: ");
        String name = scanner.nextLine().trim();
        
        List<Product> products = productService.searchProductsByName(name);
        
        if (products.isEmpty()) {
            System.out.println("\nNo products found matching: " + name);
        } else {
            displayProducts(products);
        }
    }

    /**
     * View products by category.
     */
    private void viewProductsByCategory() {
        System.out.print("\nEnter category: ");
        String category = scanner.nextLine().trim();
        
        List<Product> products = productService.getProductsByCategory(category);
        
        if (products.isEmpty()) {
            System.out.println("\nNo products found in category: " + category);
        } else {
            displayProducts(products);
        }
    }

    /**
     * Display list of products.
     */
    private void displayProducts(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("\nNo products available.");
            return;
        }

        System.out.println("\n" + "=".repeat(70));
        System.out.println("AVAILABLE PRODUCTS");
        System.out.println("=".repeat(70));
        
        for (Product product : products) {
            System.out.println("\n" + product.toString());
            System.out.println("-".repeat(70));
        }
    }

    /**
     * Add product to cart.
     */
    private void addProductToCart() {
        System.out.print("\nEnter Product ID: ");
        String productId = scanner.nextLine().trim();
        System.out.print("Enter Quantity: ");
        int quantity = getIntInput();

        try {
            Cart cart = cartService.addToCart(currentUser.getId(), productId, quantity);
            System.out.println("\n✓ Product added to cart successfully!");
            System.out.println("Cart Total: $" + String.format("%.2f", cart.getTotalAmount()));
        } catch (IllegalArgumentException e) {
            System.out.println("\n✗ Error: " + e.getMessage());
        }
    }

    /**
     * Shopping cart menu.
     */
    private void shoppingCartMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n" + "=".repeat(70));
            System.out.println("SHOPPING CART");
            System.out.println("=".repeat(70));
            System.out.println("1. View Cart");
            System.out.println("2. Update Item Quantity");
            System.out.println("3. Remove Item from Cart");
            System.out.println("4. Clear Cart");
            System.out.println("5. Proceed to Checkout");
            System.out.println("6. Back to Main Menu");
            System.out.print("\nEnter your choice: ");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    viewCart();
                    break;
                case 2:
                    updateCartItemQuantity();
                    break;
                case 3:
                    removeFromCart();
                    break;
                case 4:
                    clearCart();
                    break;
                case 5:
                    checkout();
                    break;
                case 6:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    /**
     * View cart contents.
     */
    private void viewCart() {
        Optional<Cart> cartOpt = cartService.viewCart(currentUser.getId());
        
        if (cartOpt.isEmpty() || cartOpt.get().getItems().isEmpty()) {
            System.out.println("\nYour cart is empty.");
        } else {
            System.out.println("\n" + cartOpt.get().toString());
        }
    }

    /**
     * Update cart item quantity.
     */
    private void updateCartItemQuantity() {
        System.out.print("\nEnter Product ID: ");
        String productId = scanner.nextLine().trim();
        System.out.print("Enter New Quantity: ");
        int quantity = getIntInput();

        try {
            Cart cart = cartService.updateQuantity(currentUser.getId(), productId, quantity);
            System.out.println("\n✓ Quantity updated successfully!");
            System.out.println("Cart Total: $" + String.format("%.2f", cart.getTotalAmount()));
        } catch (IllegalArgumentException e) {
            System.out.println("\n✗ Error: " + e.getMessage());
        }
    }

    /**
     * Remove item from cart.
     */
    private void removeFromCart() {
        System.out.print("\nEnter Product ID to remove: ");
        String productId = scanner.nextLine().trim();

        try {
            Cart cart = cartService.removeFromCart(currentUser.getId(), productId);
            System.out.println("\n✓ Product removed from cart successfully!");
            System.out.println("Cart Total: $" + String.format("%.2f", cart.getTotalAmount()));
        } catch (IllegalArgumentException e) {
            System.out.println("\n✗ Error: " + e.getMessage());
        }
    }

    /**
     * Clear entire cart.
     */
    private void clearCart() {
        System.out.print("\nAre you sure you want to clear your cart? (yes/no): ");
        String confirm = scanner.nextLine().trim().toLowerCase();

        if (confirm.equals("yes") || confirm.equals("y")) {
            cartService.clearCart(currentUser.getId());
            System.out.println("\n✓ Cart cleared successfully!");
        } else {
            System.out.println("\nCart not cleared.");
        }
    }

    /**
     * Checkout and place order.
     */
    private void checkout() {
        try {
            // View cart first
            Optional<Cart> cartOpt = cartService.viewCart(currentUser.getId());
            
            if (cartOpt.isEmpty() || cartOpt.get().getItems().isEmpty()) {
                System.out.println("\nYour cart is empty. Add items before checkout.");
                return;
            }

            Cart cart = cartOpt.get();
            System.out.println("\n" + cart.toString());

            System.out.print("\nProceed with checkout? (yes/no): ");
            String confirm = scanner.nextLine().trim().toLowerCase();

            if (!confirm.equals("yes") && !confirm.equals("y")) {
                System.out.println("\nCheckout cancelled.");
                return;
            }

            // Place order
            Order order = orderService.placeOrder(currentUser.getId());
            
            System.out.println("\n" + "=".repeat(70));
            System.out.println("✓ ORDER PLACED SUCCESSFULLY!");
            System.out.println("=".repeat(70));
            System.out.println("Order ID: " + order.getId());
            System.out.println("Total Amount: $" + String.format("%.2f", order.getTotalAmount()));
            System.out.println("\nSimulating payment...");

            // Simulate payment
            System.out.print("Payment successful? (yes/no): ");
            String paymentSuccess = scanner.nextLine().trim().toLowerCase();
            
            boolean success = paymentSuccess.equals("yes") || paymentSuccess.equals("y");
            orderService.processPayment(order.getId(), success);

            if (success) {
                System.out.println("\n✓ PAYMENT SUCCESSFUL!");
                System.out.println("Payment Status: PAID");
                System.out.println("\nYour order has been confirmed and will be shipped soon.");
            } else {
                System.out.println("\n✗ PAYMENT FAILED!");
                System.out.println("Payment Status: FAILED");
                System.out.println("\nPlease try again or contact support.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("\n✗ Checkout failed: " + e.getMessage());
        }
    }

    /**
     * Orders menu.
     */
    private void ordersMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n" + "=".repeat(70));
            System.out.println("ORDERS");
            System.out.println("=".repeat(70));
            System.out.println("1. View All My Orders");
            System.out.println("2. View Order Details");
            System.out.println("3. Back to Main Menu");
            System.out.print("\nEnter your choice: ");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    viewAllOrders();
                    break;
                case 2:
                    viewOrderDetails();
                    break;
                case 3:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    /**
     * View all orders for current user.
     */
    private void viewAllOrders() {
        List<Order> orders = orderService.getUserOrders(currentUser.getId());

        if (orders.isEmpty()) {
            System.out.println("\nYou have no orders yet.");
            return;
        }

        System.out.println("\n" + "=".repeat(70));
        System.out.println("YOUR ORDERS");
        System.out.println("=".repeat(70));

        for (Order order : orders) {
            System.out.println("\n" + order.toString());
            System.out.println("-".repeat(70));
        }
    }

    /**
     * View specific order details.
     */
    private void viewOrderDetails() {
        System.out.print("\nEnter Order ID: ");
        String orderId = scanner.nextLine().trim();

        Optional<Order> orderOpt = orderService.getOrderById(orderId);

        if (orderOpt.isEmpty()) {
            System.out.println("\nOrder not found.");
            return;
        }

        Order order = orderOpt.get();
        
        if (!order.getUserId().equals(currentUser.getId())) {
            System.out.println("\nAccess denied. This order doesn't belong to you.");
            return;
        }

        System.out.println("\n" + "=".repeat(70));
        System.out.println("ORDER DETAILS");
        System.out.println("=".repeat(70));
        System.out.println("\n" + order.toString());
    }

    /**
     * Get integer input with error handling.
     *
     * @return Integer input from user
     */
    private int getIntInput() {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
}
