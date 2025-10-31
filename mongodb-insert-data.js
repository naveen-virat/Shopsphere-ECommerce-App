// MongoDB Script to Insert Sample ShopSphere Data
// Run this script with: mongosh shopsphere_db mongodb-insert-data.js

// ============================================================================
// 1. INSERT PRODUCTS
// ============================================================================

db.products.insertMany([
  // Electronics Category
  {
    "_id": "P001",
    "name": "Apple MacBook Pro 16\" M3 Max",
    "category": "Electronics",
    "description": "16-inch MacBook Pro with M3 Max chip, 36GB RAM, 1TB SSD. Features Liquid Retina XDR display with ProMotion technology.",
    "price": 3499.99,
    "stockQuantity": 15,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P002",
    "name": "iPhone 15 Pro Max 256GB",
    "category": "Electronics",
    "description": "iPhone 15 Pro Max with A17 Pro chip, titanium design, 48MP camera system, and USB-C. Available in Natural Titanium.",
    "price": 1199.99,
    "stockQuantity": 25,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P003",
    "name": "Sony WH-1000XM5 Headphones",
    "category": "Electronics",
    "description": "Premium wireless noise-canceling headphones with industry-leading ANC, 30-hour battery life, and superior sound quality.",
    "price": 399.99,
    "stockQuantity": 40,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P004",
    "name": "Samsung 65\" OLED 4K Smart TV",
    "category": "Electronics",
    "description": "65-inch OLED 4K Smart TV with Quantum HDR, Dolby Atmos, and AI-powered upscaling. Perfect for home entertainment.",
    "price": 2299.99,
    "stockQuantity": 12,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P005",
    "name": "Dell XPS 15 Laptop",
    "category": "Electronics",
    "description": "15.6-inch laptop with Intel Core i7-13700H, 32GB RAM, 1TB SSD, NVIDIA RTX 4060. Ideal for professionals.",
    "price": 2199.99,
    "stockQuantity": 18,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P006",
    "name": "iPad Pro 12.9\" M2 Wi-Fi",
    "category": "Electronics",
    "description": "12.9-inch iPad Pro with M2 chip, 256GB storage, Liquid Retina XDR display, and Apple Pencil support.",
    "price": 1099.99,
    "stockQuantity": 22,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P007",
    "name": "Canon EOS R6 Mark II Camera",
    "category": "Electronics",
    "description": "24.2MP full-frame mirrorless camera with 4K 60p video, in-body stabilization, and advanced autofocus system.",
    "price": 2499.99,
    "stockQuantity": 8,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P008",
    "name": "PlayStation 5 Digital Edition",
    "category": "Electronics",
    "description": "Next-gen gaming console with 825GB SSD, 4K gaming support, and DualSense wireless controller.",
    "price": 449.99,
    "stockQuantity": 30,
    "_class": "com.ecommerce.model.Product"
  },

  // Clothing Category
  {
    "_id": "P009",
    "name": "Levi's 501 Original Jeans",
    "category": "Clothing",
    "description": "Classic straight-fit jeans in premium denim. Timeless American style with button fly. Available in multiple washes.",
    "price": 89.99,
    "stockQuantity": 100,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P010",
    "name": "Nike Air Max 90 Sneakers",
    "category": "Clothing",
    "description": "Iconic running shoes with visible Air cushioning, premium leather and textile upper. Classic comfort and style.",
    "price": 129.99,
    "stockQuantity": 75,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P011",
    "name": "Patagonia Down Sweater Jacket",
    "category": "Clothing",
    "description": "Lightweight, windproof, and warm 800-fill-power down jacket. Ethically sourced and highly compressible.",
    "price": 229.99,
    "stockQuantity": 45,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P012",
    "name": "Ralph Lauren Polo Shirt",
    "category": "Clothing",
    "description": "Classic fit polo shirt in soft cotton mesh. Features signature embroidered pony logo.",
    "price": 89.99,
    "stockQuantity": 120,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P013",
    "name": "The North Face Backpack 28L",
    "category": "Clothing",
    "description": "Durable outdoor backpack with laptop sleeve, multiple compartments, and comfortable shoulder straps.",
    "price": 99.99,
    "stockQuantity": 60,
    "_class": "com.ecommerce.model.Product"
  },

  // Books Category
  {
    "_id": "P014",
    "name": "Atomic Habits by James Clear",
    "category": "Books",
    "description": "Bestselling self-help book about building good habits and breaking bad ones. Over 15 million copies sold worldwide.",
    "price": 27.99,
    "stockQuantity": 200,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P015",
    "name": "Clean Code by Robert C. Martin",
    "category": "Books",
    "description": "Essential guide for software developers on writing clean, maintainable code. A must-read for programmers.",
    "price": 44.99,
    "stockQuantity": 85,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P016",
    "name": "Designing Data-Intensive Applications",
    "category": "Books",
    "description": "Comprehensive guide to building scalable, reliable, and maintainable systems. By Martin Kleppmann.",
    "price": 59.99,
    "stockQuantity": 50,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P017",
    "name": "The Pragmatic Programmer",
    "category": "Books",
    "description": "Classic programming book covering essential techniques and best practices for software development.",
    "price": 49.99,
    "stockQuantity": 65,
    "_class": "com.ecommerce.model.Product"
  },

  // Home Appliances Category
  {
    "_id": "P018",
    "name": "Dyson V15 Detect Cordless Vacuum",
    "category": "Home Appliances",
    "description": "Advanced cordless vacuum with laser detection technology, LCD screen, and 60-minute runtime.",
    "price": 649.99,
    "stockQuantity": 20,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P019",
    "name": "KitchenAid Stand Mixer 5-Quart",
    "category": "Home Appliances",
    "description": "Professional-grade stand mixer with 10 speeds, tilt-head design, and multiple attachments included.",
    "price": 449.99,
    "stockQuantity": 35,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P020",
    "name": "Nespresso Vertuo Plus Coffee Maker",
    "category": "Home Appliances",
    "description": "Single-serve coffee and espresso machine with centrifusion technology. Brews 5 cup sizes.",
    "price": 179.99,
    "stockQuantity": 55,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P021",
    "name": "iRobot Roomba j7+ Robot Vacuum",
    "category": "Home Appliances",
    "description": "Smart robot vacuum with AI obstacle avoidance, self-emptying base, and app control.",
    "price": 799.99,
    "stockQuantity": 15,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P022",
    "name": "Instant Pot Duo 8-Quart",
    "category": "Home Appliances",
    "description": "7-in-1 multi-cooker: pressure cooker, slow cooker, rice cooker, steamer, sauté, yogurt maker, and warmer.",
    "price": 129.99,
    "stockQuantity": 70,
    "_class": "com.ecommerce.model.Product"
  },

  // Sports & Fitness Category
  {
    "_id": "P023",
    "name": "Peloton Bike+ Indoor Cycling",
    "category": "Sports & Fitness",
    "description": "Premium indoor cycling bike with rotating HD touchscreen, auto-resistance, and live classes.",
    "price": 2495.00,
    "stockQuantity": 10,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P024",
    "name": "Bowflex SelectTech Dumbbells",
    "category": "Sports & Fitness",
    "description": "Adjustable dumbbells replacing 15 sets of weights. Adjust from 5 to 52.5 lbs with a turn of dial.",
    "price": 349.99,
    "stockQuantity": 25,
    "_class": "com.ecommerce.model.Product"
  },
  {
    "_id": "P025",
    "name": "Fitbit Charge 6 Fitness Tracker",
    "category": "Sports & Fitness",
    "description": "Advanced fitness tracker with heart rate monitoring, GPS, sleep tracking, and 7-day battery life.",
    "price": 159.99,
    "stockQuantity": 90,
    "_class": "com.ecommerce.model.Product"
  }
]);

print("✓ Inserted 25 products successfully!");

// ============================================================================
// 2. INSERT SAMPLE USERS
// ============================================================================

db.users.insertMany([
  {
    "_id": "U001",
    "name": "John Smith",
    "email": "john.smith@email.com",
    "password": "password123",
    "address": "123 Main Street, New York, NY 10001",
    "_class": "com.ecommerce.model.User"
  },
  {
    "_id": "U002",
    "name": "Sarah Johnson",
    "email": "sarah.johnson@email.com",
    "password": "secure456",
    "address": "456 Oak Avenue, Los Angeles, CA 90012",
    "_class": "com.ecommerce.model.User"
  },
  {
    "_id": "U003",
    "name": "Michael Brown",
    "email": "michael.brown@email.com",
    "password": "mypass789",
    "address": "789 Pine Road, Chicago, IL 60601",
    "_class": "com.ecommerce.model.User"
  },
  {
    "_id": "U004",
    "name": "Emily Davis",
    "email": "emily.davis@email.com",
    "password": "emily2024",
    "address": "321 Elm Street, Houston, TX 77001",
    "_class": "com.ecommerce.model.User"
  },
  {
    "_id": "U005",
    "name": "David Wilson",
    "email": "david.wilson@email.com",
    "password": "david123",
    "address": "654 Maple Drive, Phoenix, AZ 85001",
    "_class": "com.ecommerce.model.User"
  },
  {
    "_id": "U006",
    "name": "Jessica Martinez",
    "email": "jessica.martinez@email.com",
    "password": "jess456",
    "address": "987 Cedar Lane, Philadelphia, PA 19019",
    "_class": "com.ecommerce.model.User"
  },
  {
    "_id": "U007",
    "name": "Robert Taylor",
    "email": "robert.taylor@email.com",
    "password": "robert789",
    "address": "147 Birch Court, San Antonio, TX 78201",
    "_class": "com.ecommerce.model.User"
  },
  {
    "_id": "U008",
    "name": "Amanda Anderson",
    "email": "amanda.anderson@email.com",
    "password": "amanda2024",
    "address": "258 Willow Way, San Diego, CA 92101",
    "_class": "com.ecommerce.model.User"
  }
]);

print("✓ Inserted 8 users successfully!");

// ============================================================================
// 3. INSERT SAMPLE SHOPPING CARTS
// ============================================================================

db.carts.insertMany([
  {
    "userId": "U001",
    "items": [
      {
        "productId": "P002",
        "productName": "iPhone 15 Pro Max 256GB",
        "price": 1199.99,
        "quantity": 1
      },
      {
        "productId": "P003",
        "productName": "Sony WH-1000XM5 Headphones",
        "price": 399.99,
        "quantity": 1
      }
    ],
    "totalAmount": 1599.98,
    "_class": "com.ecommerce.model.Cart"
  },
  {
    "userId": "U002",
    "items": [
      {
        "productId": "P009",
        "productName": "Levi's 501 Original Jeans",
        "price": 89.99,
        "quantity": 2
      },
      {
        "productId": "P010",
        "productName": "Nike Air Max 90 Sneakers",
        "price": 129.99,
        "quantity": 1
      }
    ],
    "totalAmount": 309.97,
    "_class": "com.ecommerce.model.Cart"
  },
  {
    "userId": "U003",
    "items": [
      {
        "productId": "P014",
        "productName": "Atomic Habits by James Clear",
        "price": 27.99,
        "quantity": 3
      },
      {
        "productId": "P015",
        "productName": "Clean Code by Robert C. Martin",
        "price": 44.99,
        "quantity": 1
      }
    ],
    "totalAmount": 128.96,
    "_class": "com.ecommerce.model.Cart"
  }
]);

print("✓ Inserted 3 shopping carts successfully!");

// ============================================================================
// 4. INSERT SAMPLE ORDERS
// ============================================================================

db.orders.insertMany([
  {
    "_id": "O001",
    "userId": "U001",
    "items": [
      {
        "productId": "P001",
        "productName": "Apple MacBook Pro 16\" M3 Max",
        "price": 3499.99,
        "quantity": 1
      },
      {
        "productId": "P006",
        "productName": "iPad Pro 12.9\" M2 Wi-Fi",
        "price": 1099.99,
        "quantity": 1
      }
    ],
    "orderDate": ISODate("2025-10-28T10:30:00Z"),
    "totalAmount": 4599.98,
    "paymentStatus": "PAID",
    "_class": "com.ecommerce.model.Order"
  },
  {
    "_id": "O002",
    "userId": "U002",
    "items": [
      {
        "productId": "P011",
        "productName": "Patagonia Down Sweater Jacket",
        "price": 229.99,
        "quantity": 2
      }
    ],
    "orderDate": ISODate("2025-10-29T14:15:00Z"),
    "totalAmount": 459.98,
    "paymentStatus": "PAID",
    "_class": "com.ecommerce.model.Order"
  },
  {
    "_id": "O003",
    "userId": "U003",
    "items": [
      {
        "productId": "P008",
        "productName": "PlayStation 5 Digital Edition",
        "price": 449.99,
        "quantity": 1
      },
      {
        "productId": "P003",
        "productName": "Sony WH-1000XM5 Headphones",
        "price": 399.99,
        "quantity": 1
      }
    ],
    "orderDate": ISODate("2025-10-30T09:45:00Z"),
    "totalAmount": 849.98,
    "paymentStatus": "PAID",
    "_class": "com.ecommerce.model.Order"
  },
  {
    "_id": "O004",
    "userId": "U004",
    "items": [
      {
        "productId": "P020",
        "productName": "Nespresso Vertuo Plus Coffee Maker",
        "price": 179.99,
        "quantity": 1
      },
      {
        "productId": "P022",
        "productName": "Instant Pot Duo 8-Quart",
        "price": 129.99,
        "quantity": 1
      }
    ],
    "orderDate": ISODate("2025-10-30T16:20:00Z"),
    "totalAmount": 309.98,
    "paymentStatus": "PAID",
    "_class": "com.ecommerce.model.Order"
  },
  {
    "_id": "O005",
    "userId": "U005",
    "items": [
      {
        "productId": "P023",
        "productName": "Peloton Bike+ Indoor Cycling",
        "price": 2495.00,
        "quantity": 1
      }
    ],
    "orderDate": ISODate("2025-10-31T08:00:00Z"),
    "totalAmount": 2495.00,
    "paymentStatus": "PENDING",
    "_class": "com.ecommerce.model.Order"
  },
  {
    "_id": "O006",
    "userId": "U001",
    "items": [
      {
        "productId": "P014",
        "productName": "Atomic Habits by James Clear",
        "price": 27.99,
        "quantity": 5
      },
      {
        "productId": "P015",
        "productName": "Clean Code by Robert C. Martin",
        "price": 44.99,
        "quantity": 2
      },
      {
        "productId": "P016",
        "productName": "Designing Data-Intensive Applications",
        "price": 59.99,
        "quantity": 1
      }
    ],
    "orderDate": ISODate("2025-10-31T11:30:00Z"),
    "totalAmount": 289.92,
    "paymentStatus": "PAID",
    "_class": "com.ecommerce.model.Order"
  }
]);

print("✓ Inserted 6 orders successfully!");

// ============================================================================
// 5. VERIFY DATA INSERTION
// ============================================================================

print("\n========================================");
print("DATA INSERTION SUMMARY");
print("========================================");
print("Products: " + db.products.countDocuments());
print("Users: " + db.users.countDocuments());
print("Carts: " + db.carts.countDocuments());
print("Orders: " + db.orders.countDocuments());
print("========================================");

// ============================================================================
// 6. CREATE INDEXES FOR BETTER PERFORMANCE
// ============================================================================

db.users.createIndex({ "email": 1 }, { unique: true });
db.products.createIndex({ "category": 1 });
db.products.createIndex({ "name": "text" });
db.carts.createIndex({ "userId": 1 }, { unique: true });
db.orders.createIndex({ "userId": 1 });
db.orders.createIndex({ "paymentStatus": 1 });

print("\n✓ Indexes created successfully!");
print("\n========================================");
print("SAMPLE QUERIES");
print("========================================");

// Sample queries to verify data
print("\n1. Count products by category:");
db.products.aggregate([
  { $group: { _id: "$category", count: { $sum: 1 } } }
]).forEach(printjson);

print("\n2. Total revenue from paid orders:");
var revenue = db.orders.aggregate([
  { $match: { paymentStatus: "PAID" } },
  { $group: { _id: null, total: { $sum: "$totalAmount" } } }
]).toArray();
print("Total Revenue: $" + revenue[0].total.toFixed(2));

print("\n✓ Script completed successfully!");
print("Your MongoDB database is now populated with realistic e-commerce data!");
