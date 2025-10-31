# 💾 MongoDB Setup & Data Guide

Complete guide for setting up MongoDB and populating ShopSphere database with sample data.

---

## 📋 Table of Contents

- [Database Overview](#-database-overview)
- [Quick Setup](#-quick-setup)
- [Manual Setup](#-manual-setup)
- [Sample Data Details](#-sample-data-details)
- [MongoDB Commands](#-mongodb-commands)
- [Data Verification](#-data-verification)
- [Database Management](#-database-management)

---

## 🗄 Database Overview

**Database Name:** `shopsphere_db`

**Collections:**
- `products` - Product catalog (25 items)
- `users` - Registered users (8 accounts)
- `carts` - Shopping carts (3 active carts)
- `orders` - Order history (6 orders)

**Total Sample Documents:** 42

---

## 🚀 Quick Setup

### Automated Setup (Recommended)

Run the batch file to automatically populate all data:

```cmd
mongodb-quick-setup.bat
```

This script will:
1. ✅ Verify MongoDB connection
2. ✅ Insert 25 products
3. ✅ Insert 8 users
4. ✅ Insert 3 shopping carts
5. ✅ Insert 6 orders
6. ✅ Create necessary indexes
7. ✅ Display verification summary

---

## 🛠 Manual Setup

### Step 1: Ensure MongoDB is Running

```bash
mongosh --eval "db.version()"
```

Expected output: `8.0.10` or higher

### Step 2: Run the Data Script

```bash
mongosh shopsphere_db mongodb-insert-data.js
```

### Step 3: Verify Data Insertion

```bash
mongosh shopsphere_db --eval "db.products.countDocuments()"
```

---

## 📦 Sample Data Details

### 🛍️ Products (25 Items)

#### Electronics (8 products) - Total Value: $13,747.93
| ID | Product | Price | Stock |
|----|---------|-------|-------|
| P001 | Apple MacBook Pro 16" M3 Max | $3,499.99 | 15 |
| P002 | iPhone 15 Pro Max 256GB | $1,199.99 | 25 |
| P003 | Sony WH-1000XM5 Headphones | $399.99 | 40 |
| P004 | Samsung 65" OLED 4K Smart TV | $2,299.99 | 8 |
| P005 | Dell XPS 15 Laptop | $2,199.99 | 12 |
| P006 | iPad Pro 12.9" M2 Wi-Fi | $1,099.99 | 20 |
| P007 | Canon EOS R6 Mark II Camera | $2,499.99 | 10 |
| P008 | PlayStation 5 Digital Edition | $449.99 | 18 |

#### Clothing (5 products) - Total Value: $638.95
| ID | Product | Price | Stock |
|----|---------|-------|-------|
| P009 | Levi's 501 Original Jeans | $89.99 | 30 |
| P010 | Nike Air Max 90 Sneakers | $129.99 | 25 |
| P011 | Patagonia Down Sweater Jacket | $229.99 | 15 |
| P012 | Ralph Lauren Polo Shirt | $89.99 | 35 |
| P013 | The North Face Backpack 28L | $99.99 | 20 |

#### Books (4 products) - Total Value: $181.96
| ID | Product | Price | Stock |
|----|---------|-------|-------|
| P014 | Atomic Habits by James Clear | $27.99 | 50 |
| P015 | Clean Code by Robert C. Martin | $44.99 | 40 |
| P016 | Designing Data-Intensive Applications | $59.99 | 25 |
| P017 | The Pragmatic Programmer | $49.99 | 30 |

#### Home Appliances (5 products) - Total Value: $2,208.95
| ID | Product | Price | Stock |
|----|---------|-------|-------|
| P018 | Dyson V15 Detect Cordless Vacuum | $649.99 | 10 |
| P019 | KitchenAid Stand Mixer 5-Quart | $449.99 | 15 |
| P020 | Nespresso Vertuo Plus Coffee Maker | $179.99 | 22 |
| P021 | iRobot Roomba j7+ Robot Vacuum | $799.99 | 8 |
| P022 | Instant Pot Duo 8-Quart | $129.99 | 28 |

#### Sports & Fitness (3 products) - Total Value: $3,189.99
| ID | Product | Price | Stock |
|----|---------|-------|-------|
| P023 | Peloton Bike+ Indoor Cycling | $2,495.00 | 6 |
| P024 | Bowflex SelectTech Dumbbells | $349.99 | 12 |
| P025 | Garmin Forerunner 955 GPS Watch | $499.99 | 18 |

**Total Catalog Value:** $19,967.78

---

### 👥 Users (8 Accounts)

| ID | Name | Email | Password | Location |
|----|------|-------|----------|----------|
| U001 | John Smith | john.smith@email.com | password123 | New York, NY |
| U002 | Sarah Johnson | sarah.johnson@email.com | password123 | Los Angeles, CA |
| U003 | Michael Brown | michael.brown@email.com | password123 | Chicago, IL |
| U004 | Emily Davis | emily.davis@email.com | password123 | Houston, TX |
| U005 | David Wilson | david.wilson@email.com | password123 | Phoenix, AZ |
| U006 | Jessica Martinez | jessica.martinez@email.com | password123 | Philadelphia, PA |
| U007 | James Anderson | james.anderson@email.com | password123 | San Antonio, TX |
| U008 | Maria Garcia | maria.garcia@email.com | password123 | San Diego, CA |

**All passwords:** `password123` (for testing purposes only)

---

### 🛒 Shopping Carts (3 Active Carts)

#### Cart 1 - User: Sarah Johnson (U002)
| Product | Price | Qty | Subtotal |
|---------|-------|-----|----------|
| Dell XPS 15 Laptop | $2,199.99 | 1 | $2,199.99 |
| Sony WH-1000XM5 Headphones | $399.99 | 1 | $399.99 |
| **Total** | | | **$2,599.98** |

#### Cart 2 - User: Michael Brown (U003)
| Product | Price | Qty | Subtotal |
|---------|-------|-----|----------|
| iPhone 15 Pro Max 256GB | $1,199.99 | 1 | $1,199.99 |
| Nike Air Max 90 Sneakers | $129.99 | 1 | $129.99 |
| **Total** | | | **$1,329.98** |

#### Cart 3 - User: Emily Davis (U004)
| Product | Price | Qty | Subtotal |
|---------|-------|-----|----------|
| KitchenAid Stand Mixer 5-Quart | $449.99 | 1 | $449.99 |
| Nespresso Vertuo Plus Coffee Maker | $179.99 | 2 | $359.98 |
| **Total** | | | **$809.97** |

**Total Cart Value:** $4,739.93

---

### 📦 Orders (6 Historical Orders)

#### Order O001 - PAID
- **Customer:** John Smith (U001)
- **Date:** October 28, 2025, 10:30 AM
- **Status:** PAID
- **Items:**
  - Apple MacBook Pro 16" M3 Max - $3,499.99 × 1
- **Total:** $3,499.99

#### Order O002 - PAID
- **Customer:** Sarah Johnson (U002)
- **Date:** October 29, 2025, 2:15 PM
- **Status:** PAID
- **Items:**
  - iPhone 15 Pro Max 256GB - $1,199.99 × 1
  - iPad Pro 12.9" M2 - $1,099.99 × 1
- **Total:** $2,299.98

#### Order O003 - PENDING
- **Customer:** Michael Brown (U003)
- **Date:** October 29, 2025, 4:45 PM
- **Status:** PENDING
- **Items:**
  - Samsung 65" OLED 4K Smart TV - $2,299.99 × 1
- **Total:** $2,299.99

#### Order O004 - PAID
- **Customer:** Emily Davis (U004)
- **Date:** October 30, 2025, 11:20 AM
- **Status:** PAID
- **Items:**
  - Dyson V15 Detect Vacuum - $649.99 × 1
  - iRobot Roomba j7+ - $799.99 × 1
- **Total:** $1,449.98

#### Order O005 - PENDING
- **Customer:** David Wilson (U005)
- **Date:** October 30, 2025, 3:30 PM
- **Status:** PENDING
- **Items:**
  - Peloton Bike+ - $2,495.00 × 1
- **Total:** $2,495.00

#### Order O006 - PAID
- **Customer:** Jessica Martinez (U006)
- **Date:** October 31, 2025, 9:00 AM
- **Status:** PAID
- **Items:**
  - Clean Code Book - $44.99 × 2
  - Designing Data-Intensive Apps - $59.99 × 1
  - The Pragmatic Programmer - $49.99 × 1
- **Total:** $199.96

**Order Statistics:**
- Total Orders: 6
- PAID Orders: 4 ($7,449.91)
- PENDING Orders: 2 ($4,794.99)
- Average Order Value: $2,040.82

---

## 💻 MongoDB Commands

### View All Collections
```bash
mongosh shopsphere_db --eval "db.getCollectionNames()"
```

### Count Documents in Each Collection
```bash
mongosh shopsphere_db --eval "printjson({
  products: db.products.countDocuments(),
  users: db.users.countDocuments(),
  carts: db.carts.countDocuments(),
  orders: db.orders.countDocuments()
})"
```

### View Sample Products
```bash
mongosh shopsphere_db --eval "db.products.find().limit(3).pretty()"
```

### View All Users
```bash
mongosh shopsphere_db --eval "db.users.find({}, {password: 0}).pretty()"
```

### View Electronics Products
```bash
mongosh shopsphere_db --eval "db.products.find({category: 'Electronics'}).pretty()"
```

### View PAID Orders
```bash
mongosh shopsphere_db --eval "db.orders.find({paymentStatus: 'PAID'}).pretty()"
```

### View Specific User's Cart
```bash
mongosh shopsphere_db --eval "db.carts.findOne({userId: 'U002'})"
```

### Search Products by Name
```bash
mongosh shopsphere_db --eval "db.products.find({name: /laptop/i}).pretty()"
```

---

## ✅ Data Verification

### Verify Complete Setup

Run this comprehensive verification script:

```bash
mongosh shopsphere_db --eval "
  print('📊 ShopSphere Database Summary');
  print('================================');
  print('Products:', db.products.countDocuments());
  print('Users:', db.users.countDocuments());
  print('Carts:', db.carts.countDocuments());
  print('Orders:', db.orders.countDocuments());
  print('');
  print('📦 Sample Products:');
  db.products.find().limit(3).forEach(function(p) {
    print(p._id + ': ' + p.name + ' - $' + p.price);
  });
  print('');
  print('💰 Order Statistics:');
  var paidOrders = db.orders.countDocuments({paymentStatus: 'PAID'});
  var pendingOrders = db.orders.countDocuments({paymentStatus: 'PENDING'});
  print('PAID:', paidOrders);
  print('PENDING:', pendingOrders);
"
```

### Expected Output
```
📊 ShopSphere Database Summary
================================
Products: 25
Users: 8
Carts: 3
Orders: 6

📦 Sample Products:
P001: Apple MacBook Pro 16" M3 Max - $3499.99
P002: iPhone 15 Pro Max 256GB - $1199.99
P003: Sony WH-1000XM5 Headphones - $399.99

💰 Order Statistics:
PAID: 4
PENDING: 2
```

---

## 🗂 Database Management

### Backup Database

```bash
mongodump --db shopsphere_db --out ./backup
```

### Restore Database

```bash
mongorestore --db shopsphere_db ./backup/shopsphere_db
```

### Clear All Data

**Warning:** This will delete all data!

```bash
mongosh shopsphere_db --eval "
  db.products.deleteMany({});
  db.users.deleteMany({});
  db.carts.deleteMany({});
  db.orders.deleteMany({});
  print('All data cleared!');
"
```

### Reset Database (Clear + Repopulate)

```bash
mongosh shopsphere_db --eval "db.dropDatabase()"
mongosh shopsphere_db mongodb-insert-data.js
```

### Drop Entire Database

```bash
mongosh shopsphere_db --eval "db.dropDatabase()"
```

### View Collection Indexes

```bash
mongosh shopsphere_db --eval "db.products.getIndexes()"
mongosh shopsphere_db --eval "db.users.getIndexes()"
```

---

## 🔍 Query Examples

### Find Products Under $100
```bash
mongosh shopsphere_db --eval "db.products.find({price: {\$lt: 100}}).pretty()"
```

### Find Products with Low Stock
```bash
mongosh shopsphere_db --eval "db.products.find({stockQuantity: {\$lt: 10}}).pretty()"
```

### Find User by Email
```bash
mongosh shopsphere_db --eval "db.users.findOne({email: 'john.smith@email.com'})"
```

### Calculate Total Revenue from PAID Orders
```bash
mongosh shopsphere_db --eval "
  var total = 0;
  db.orders.find({paymentStatus: 'PAID'}).forEach(function(order) {
    total += order.totalAmount;
  });
  print('Total Revenue: $' + total.toFixed(2));
"
```

### Count Products by Category
```bash
mongosh shopsphere_db --eval "db.products.aggregate([
  {\$group: {_id: '\$category', count: {\$sum: 1}}},
  {\$sort: {count: -1}}
])"
```

### Find Most Expensive Products
```bash
mongosh shopsphere_db --eval "db.products.find().sort({price: -1}).limit(5).pretty()"
```

---

## 🔧 Troubleshooting

### Issue: Script Fails with "use shopsphere_db not allowed"
**Solution:** Pass database name as argument:
```bash
mongosh shopsphere_db mongodb-insert-data.js
```

### Issue: Duplicate Key Error (E11000)
**Solution:** Clear existing data first:
```bash
mongosh shopsphere_db --eval "
  db.products.deleteMany({});
  db.users.deleteMany({});
  db.carts.deleteMany({});
  db.orders.deleteMany({});
"
```
Then run the script again.

### Issue: Cannot Connect to MongoDB
**Solution:** Start MongoDB service:
```cmd
net start MongoDB
```

### Issue: Database Name Mismatch
If you see `ecommerce_db` in error messages but need `shopsphere_db`, update `application.properties`:
```properties
spring.data.mongodb.database=shopsphere_db
```

---

## 📊 Data Insights

### Product Distribution
- Electronics: 32% (8 products)
- Clothing: 20% (5 products)
- Books: 16% (4 products)
- Home Appliances: 20% (5 products)
- Sports & Fitness: 12% (3 products)

### Price Ranges
- Under $100: 8 products
- $100-$500: 9 products
- $500-$1000: 3 products
- Over $1000: 5 products

### Stock Levels
- High Stock (>25): 8 products
- Medium Stock (15-25): 10 products
- Low Stock (<15): 7 products

### User Distribution
- East Coast: 3 users
- West Coast: 2 users
- Central: 2 users
- South: 1 user

---

## 🎯 Next Steps

1. ✅ **Verify Data**: Run verification commands above
2. ✅ **Test Queries**: Try the query examples
3. ✅ **Start Application**: `mvn spring-boot:run`
4. ✅ **Login**: Use any user credentials from the table above
5. ✅ **Explore**: Browse products, add to cart, place orders

---

**MongoDB database ready! 🚀**

For application usage, see the main **README.md** file.
