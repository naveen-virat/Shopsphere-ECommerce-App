package com.ecommerce.controller;

import com.ecommerce.model.Order;
import com.ecommerce.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * REST API Controller for Order Management.
 */
@RestController
@RequestMapping("/api/orders")
@Tag(name = "Orders", description = "Order management APIs - place orders, view history, and manage order status")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Operation(summary = "Get all orders", description = "Retrieve all orders in the system")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved order list")
    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    @Operation(summary = "Get order by ID", description = "Retrieve a specific order by its unique identifier")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Order found"),
        @ApiResponse(responseCode = "404", description = "Order not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(
            @Parameter(description = "Order ID", example = "O001") 
            @PathVariable String id) {
        Optional<Order> order = orderService.getOrderById(id);
        return order.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Get user's orders", description = "Retrieve all orders for a specific user")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved user's order history")
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Order>> getUserOrders(
            @Parameter(description = "User ID", example = "U001") 
            @PathVariable String userId) {
        return ResponseEntity.ok(orderService.getUserOrders(userId));
    }

    @Operation(summary = "Place new order", description = "Create a new order from the user's shopping cart")
    @ApiResponses({
        @ApiResponse(responseCode = "201", description = "Order placed successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid order data or empty cart")
    })
    @PostMapping
    public ResponseEntity<?> placeOrder(@RequestBody Map<String, String> request) {
        try {
            String userId = request.get("userId");
            Order order = orderService.placeOrder(userId);
            return ResponseEntity.status(HttpStatus.CREATED).body(order);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @Operation(summary = "Process payment", description = "Process payment for an order")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Payment processed successfully"),
        @ApiResponse(responseCode = "404", description = "Order not found")
    })
    @PostMapping("/{orderId}/payment")
    public ResponseEntity<?> processPayment(
            @Parameter(description = "Order ID") 
            @PathVariable String orderId) {
        try {
            Order paidOrder = orderService.processPayment(orderId, true);
            return ResponseEntity.ok(paidOrder);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                               .body(Map.of("error", e.getMessage()));
        }
    }

    @Operation(summary = "Cancel order", description = "Cancel an existing order")
    @ApiResponses({
        @ApiResponse(responseCode = "204", description = "Order cancelled successfully"),
        @ApiResponse(responseCode = "404", description = "Order not found")
    })
    @DeleteMapping("/{orderId}")
    public ResponseEntity<?> cancelOrder(
            @Parameter(description = "Order ID") 
            @PathVariable String orderId) {
        try {
            orderService.cancelOrder(orderId);
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                               .body(Map.of("error", e.getMessage()));
        }
    }

    @Operation(summary = "Get orders by payment status", description = "Filter orders by payment status")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved filtered orders")
    @GetMapping("/status/{status}")
    public ResponseEntity<List<Order>> getOrdersByStatus(
            @Parameter(description = "Payment status (PENDING or PAID)", example = "PAID") 
            @PathVariable String status) {
        return ResponseEntity.ok(orderService.getOrdersByStatus(status));
    }
}
