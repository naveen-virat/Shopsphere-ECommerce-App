package com.ecommerce.controller;

import com.ecommerce.model.Cart;
import com.ecommerce.service.CartService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * REST API Controller for Shopping Cart Management.
 */
@RestController
@RequestMapping("/api/cart")
@Tag(name = "Shopping Cart", description = "Shopping cart management APIs - add, remove, and update cart items")
public class CartController {

    @Autowired
    private CartService cartService;

    @Operation(summary = "Get user's cart", description = "Retrieve the shopping cart for a specific user")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Cart retrieved successfully"),
        @ApiResponse(responseCode = "404", description = "Cart not found")
    })
    @GetMapping("/{userId}")
    public ResponseEntity<Cart> getUserCart(
            @Parameter(description = "User ID", example = "U001") 
            @PathVariable String userId) {
        Cart cart = cartService.getOrCreateCart(userId);
        return ResponseEntity.ok(cart);
    }

    @Operation(summary = "Add item to cart", description = "Add a product to the user's shopping cart")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Item added successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid request or insufficient stock")
    })
    @PostMapping("/{userId}/items")
    public ResponseEntity<?> addToCart(
            @Parameter(description = "User ID") 
            @PathVariable String userId,
            @RequestBody Map<String, Object> request) {
        try {
            String productId = (String) request.get("productId");
            Integer quantity = (Integer) request.get("quantity");
            
            if (quantity == null) {
                quantity = 1;
            }
            
            Cart cart = cartService.addToCart(userId, productId, quantity);
            return ResponseEntity.ok(cart);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @Operation(summary = "Remove item from cart", description = "Remove a product from the user's shopping cart")
    @ApiResponse(responseCode = "200", description = "Item removed successfully")
    @DeleteMapping("/{userId}/items/{productId}")
    public ResponseEntity<Cart> removeFromCart(
            @Parameter(description = "User ID") 
            @PathVariable String userId,
            @Parameter(description = "Product ID") 
            @PathVariable String productId) {
        Cart cart = cartService.removeFromCart(userId, productId);
        return ResponseEntity.ok(cart);
    }

    @Operation(summary = "Update item quantity", description = "Update the quantity of a product in the cart")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Quantity updated successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid quantity or insufficient stock")
    })
    @PatchMapping("/{userId}/items/{productId}")
    public ResponseEntity<?> updateQuantity(
            @Parameter(description = "User ID") 
            @PathVariable String userId,
            @Parameter(description = "Product ID") 
            @PathVariable String productId,
            @Parameter(description = "New quantity") 
            @RequestParam int quantity) {
        try {
            Cart cart = cartService.updateQuantity(userId, productId, quantity);
            return ResponseEntity.ok(cart);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @Operation(summary = "Clear cart", description = "Remove all items from the user's shopping cart")
    @ApiResponse(responseCode = "204", description = "Cart cleared successfully")
    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> clearCart(
            @Parameter(description = "User ID") 
            @PathVariable String userId) {
        cartService.clearCart(userId);
        return ResponseEntity.noContent().build();
    }
}
