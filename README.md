# 🛍️ ShopSphere - Your Shopping Universe# E-Commerce CLI Application with Spring Boot & MongoDB



A comprehensive e-commerce platform with **CLI Interface** and **REST API**, built with **Spring Boot** and **MongoDB**. Features complete product management, shopping cart, order processing, and Swagger API documentation.A complete command-line interface (CLI) based e-commerce application built with **Spring Boot** and **MongoDB**. This project demonstrates CRUD operations, user management, shopping cart functionality, and order processing.



------



## 📋 Table of Contents## 📋 Table of Contents



- [Features](#-features)- [Features](#features)

- [Technologies](#-technologies)- [Technologies Used](#technologies-used)

- [Prerequisites](#-prerequisites)- [Project Structure](#project-structure)

- [Quick Start](#-quick-start)- [Prerequisites](#prerequisites)

- [Project Structure](#-project-structure)- [Installation & Setup](#installation--setup)

- [CLI Usage](#-cli-usage)- [Running the Application](#running-the-application)

- [REST API & Swagger](#-rest-api--swagger)- [Application Features](#application-features)

- [Database Schema](#-database-schema)- [Sample Output](#sample-output)

- [Configuration](#-configuration)- [Database Schema](#database-schema)

- [Troubleshooting](#-troubleshooting)- [API Overview](#api-overview)



------



## ✨ Features## ✨ Features



### 🏪 Product Management### 1. **Product Management**

- Complete CRUD operations for products- Add, view, update, and delete products

- Search by name (case-insensitive)- Search products by name or category

- Filter by category (Electronics, Clothing, Books, Home Appliances, Sports & Fitness)- Stock management with validation

- Real-time stock management- Product categories: Electronics, Clothing, Books, Home Appliances, Accessories

- Price validation

### 2. **User Management**

### 👤 User Management- User registration with email validation

- User registration with email validation- User login with password authentication

- Secure login authentication- Profile viewing

- Email uniqueness constraint- Email uniqueness constraint

- Profile management

- Address tracking### 3. **Shopping Cart**

- Add products to cart

### 🛒 Shopping Cart- Update item quantities

- Add/remove products- Remove items from cart

- Update quantities with stock validation- View cart with total calculation

- Real-time total calculation- Clear cart

- Persistent cart storage- Stock validation before adding to cart

- Clear cart functionality

### 4. **Order Management**

### 📦 Order Management- Place orders from cart

- Place orders from cart- Simulated payment processing

- Automated stock reduction- View order history

- Payment processing simulation- Order details with itemized list

- Order history tracking- Automatic stock reduction after order placement

- Payment status (PAID, PENDING, FAILED)- Payment status tracking (PAID, PENDING, FAILED)

- Order cancellation

### 5. **Input Validation**

### 🔌 Dual Interface- Email format validation

- **CLI**: Interactive command-line interface for terminal users- Price validation (must be positive)

- **REST API**: Full RESTful API with Swagger documentation for integrations- Quantity validation

- **Shared Database**: Both interfaces work with the same MongoDB instance- Password strength validation (minimum 6 characters)

- Stock availability checking

---

---

## 🛠 Technologies

## 🛠 Technologies Used

| Technology | Version | Purpose |

|------------|---------|---------|- **Java 17** - Programming language

| **Java** | 17 | Programming language |- **Spring Boot 3.1.5** - Application framework

| **Spring Boot** | 3.1.5 | Application framework |- **Spring Data MongoDB** - Database integration

| **Spring Data MongoDB** | - | MongoDB integration |- **MongoDB** - NoSQL database

| **MongoDB** | 8.0+ | NoSQL database |- **Maven** - Dependency management

| **Maven** | 3.6+ | Build & dependency management |- **Lombok** (optional) - Reduce boilerplate code

| **Springdoc OpenAPI** | 2.2.0 | Swagger/API documentation |

| **Lombok** | - | Boilerplate reduction |---



### Architecture## 📁 Project Structure

- **Repository Pattern**: Data access layer

- **Service Layer**: Business logic```

- **Controller Layer**: REST API endpointsecommerce-mongodb-cli/

- **CLI Layer**: Interactive terminal interface├── src/

- **MongoDB Collections**: products, users, carts, orders│   └── main/

│       ├── java/com/ecommerce/

---│       │   ├── model/

│       │   │   ├── Product.java

## 📦 Prerequisites│       │   │   ├── User.java

│       │   │   ├── Cart.java

✅ **Java 17+** installed  │       │   │   ├── CartItem.java

✅ **Maven 3.6+** installed  │       │   │   ├── Order.java

✅ **MongoDB 8.0+** running on `localhost:27017`│       │   │   └── OrderItem.java

│       │   ├── repository/

### Verify Installation│       │   │   ├── ProductRepository.java

│       │   │   ├── UserRepository.java

**Java:**│       │   │   ├── CartRepository.java

```bash│       │   │   └── OrderRepository.java

java -version│       │   ├── service/

# Expected: java version "17.x.x" or higher│       │   │   ├── ProductService.java

```│       │   │   ├── UserService.java

│       │   │   ├── CartService.java

**Maven:**│       │   │   └── OrderService.java

```bash│       │   ├── util/

mvn -version│       │   │   ├── IdGenerator.java

# Expected: Apache Maven 3.6.x or higher│       │   │   └── InputValidator.java

```│       │   ├── ECommerceApplication.java

│       │   └── ECommerceCLI.java

**MongoDB:**│       └── resources/

```bash│           └── application.properties

mongosh --eval "db.version()"└── pom.xml

# Expected: 8.0.10 or higher```

```

---

### Start MongoDB (Windows)

## ⚙️ Prerequisites

**Option A - Windows Service:**

```cmdBefore running this application, ensure you have the following installed:

net start MongoDB

```1. **Java Development Kit (JDK) 17 or higher**

   - Download from: https://www.oracle.com/java/technologies/downloads/

**Option B - Manual:**   - Verify installation: `java -version`

```cmd

"C:\Program Files\MongoDB\Server\8.0\bin\mongod.exe" --dbpath="C:\data\db"2. **Apache Maven 3.6+**

```   - Download from: https://maven.apache.org/download.cgi

   - Verify installation: `mvn -version`

**Option C - Docker:**

```bash3. **MongoDB 4.0 or higher**

docker run -d -p 27017:27017 --name mongodb mongo:latest   - Download from: https://www.mongodb.com/try/download/community

```   - Or use Docker: `docker run -d -p 27017:27017 --name mongodb mongo:latest`

   - Ensure MongoDB is running on `localhost:27017`

---

4. **Git** (optional, for cloning)

## 🚀 Quick Start   - Download from: https://git-scm.com/downloads



### 1. Clone/Navigate to Project---

```bash

cd "c:\Users\bnave\MyPractice\Java Project\ecommerce-mongodb-cli"## 🚀 Installation & Setup

```

### Step 1: Verify MongoDB is Running

### 2. Build the Project

```bash```bash

mvn clean install# Start MongoDB service (if not running)

```# Windows:

net start MongoDB

### 3. Setup MongoDB Data

Run the automated setup script to populate sample data:# macOS/Linux:

```bashsudo systemctl start mongod

mongodb-quick-setup.bat

```# Or using Docker:

docker start mongodb

Or manually:```

```bash

mongosh shopsphere_db mongodb-insert-data.jsVerify MongoDB is accessible:

``````bash

mongosh

This will insert:# or

- ✅ 25 products across 5 categoriesmongo

- ✅ 8 users with login credentials```

- ✅ 3 active shopping carts

- ✅ 6 historical orders### Step 2: Navigate to Project Directory



### 4. Run the Application```bash

```bashcd "c:\Users\bnave\MyPractice\Java Project\ecommerce-mongodb-cli"

mvn spring-boot:run```

```

### Step 3: Install Dependencies

The application starts:

- **CLI Interface**: Interactive terminal menu```bash

- **REST API Server**: http://localhost:8080mvn clean install

- **Swagger UI**: http://localhost:8080/swagger-ui.html```



---This will download all required dependencies from Maven Central.



## 📁 Project Structure### Step 4: Configure Database (Optional)



```Edit `src/main/resources/application.properties` if you need custom MongoDB settings:

ecommerce-mongodb-cli/

├── src/main/java/com/ecommerce/```properties

│   ├── ECommerceApplication.java      # Main Spring Boot entry pointspring.data.mongodb.host=localhost

│   ├── ECommerceCLI.java              # CLI interface implementationspring.data.mongodb.port=27017

│   ├── config/spring.data.mongodb.database=ecommerce_db

│   │   └── SwaggerConfig.java         # Swagger/OpenAPI configuration```

│   ├── controller/                    # REST API Controllers

│   │   ├── ProductController.java     # Product API endpoints---

│   │   ├── UserController.java        # User/Auth API endpoints

│   │   ├── CartController.java        # Shopping cart API endpoints## ▶️ Running the Application

│   │   └── OrderController.java       # Order API endpoints

│   ├── model/                         # Domain models### Using Maven:

│   │   ├── Product.java               # Product entity

│   │   ├── User.java                  # User entity```bash

│   │   ├── Cart.java                  # Cart entitymvn spring-boot:run

│   │   ├── CartItem.java              # Cart item```

│   │   ├── Order.java                 # Order entity

│   │   └── OrderItem.java             # Order item### Using Java (after building):

│   ├── repository/                    # Data access layer

│   │   ├── ProductRepository.java     # Product database operations```bash

│   │   ├── UserRepository.java        # User database operationsmvn clean package

│   │   ├── CartRepository.java        # Cart database operationsjava -jar target/ecommerce-mongodb-cli-1.0.0.jar

│   │   └── OrderRepository.java       # Order database operations```

│   ├── service/                       # Business logic layer

│   │   ├── ProductService.java        # Product service### From IDE:

│   │   ├── UserService.java           # User service- Open project in IntelliJ IDEA or Eclipse

│   │   ├── CartService.java           # Cart service- Run `ECommerceApplication.java` main class

│   │   └── OrderService.java          # Order service

│   └── util/                          # Utility classes---

│       ├── InputValidator.java        # Email, price, quantity validation

│       └── IdGenerator.java           # Custom ID generation (P001, U001, O001)## 📱 Application Features

├── src/main/resources/

│   └── application.properties         # Application configuration### Main Menu Flow

├── mongodb-insert-data.js             # MongoDB data insertion script

├── mongodb-quick-setup.bat            # Windows setup automation```

├── pom.xml                            # Maven dependencies1. Login/Registration Menu

├── README.md                          # This file   ├── Login

└── MONGODB_GUIDE.md                   # MongoDB setup & data guide   ├── Register

```   ├── Browse Products (Guest)

   └── Exit

---

2. Main Menu (After Login)

## 🖥 CLI Usage   ├── Product Catalog

   │   ├── View All Products

### Starting CLI   │   ├── Search Products by Name

When you run `mvn spring-boot:run`, the CLI automatically starts in your terminal.   │   ├── View Products by Category

   │   └── Add Product to Cart

### Main Menu Options   ├── Shopping Cart

   │   ├── View Cart

```   │   ├── Update Item Quantity

==================================================   │   ├── Remove Item from Cart

           WELCOME TO SHOPSPHERE - YOUR SHOPPING UNIVERSE   │   ├── Clear Cart

==================================================   │   └── Proceed to Checkout

   ├── Orders

1. Login   │   ├── View All My Orders

2. Register   │   └── View Order Details

3. Exit   ├── My Profile

   ├── Logout

[After Login]   └── Exit

1. Browse Products```

2. Search Products

3. View Shopping Cart---

4. Checkout

5. My Orders## 📊 Sample Output

6. Logout

```### Registration



### Sample Login Credentials```

```--- USER REGISTRATION ---

Email: john.smith@email.comFull Name: John Doe

Password: password123Email: john.doe@email.com

```Password (min 6 characters): password123

Address: 123 Main Street, New York, NY

### CLI Features

✓ Registration successful!

**Product Catalog:**Your User ID: U001

- Browse all products with paginationYou can now login with your credentials.

- View by category```

- Search by name

- See real-time stock availability### Login



**Shopping Cart:**```

- Add items with quantity selection--- USER LOGIN ---

- Update quantitiesEmail: john.doe@email.com

- Remove itemsPassword: password123

- View total price

- Clear entire cart✓ Login successful! Welcome, John Doe!

```

**Checkout:**

- Review order summary### Viewing Products

- Confirm purchase

- Automatic stock reduction```

- Order confirmation with ID======================================================================

AVAILABLE PRODUCTS

**Order History:**======================================================================

- View all past orders

- See order detailsID: P001 | Name: Laptop | Category: Electronics | Price: $999.99 | Stock: 10

- Payment status trackingDescription: High-performance laptop with 16GB RAM

- Total amount per order----------------------------------------------------------------------



---ID: P002 | Name: Smartphone | Category: Electronics | Price: $699.99 | Stock: 15

Description: Latest 5G smartphone with 128GB storage

## 🔌 REST API & Swagger----------------------------------------------------------------------



### Access Swagger UIID: P003 | Name: Headphones | Category: Electronics | Price: $199.99 | Stock: 20

```Description: Wireless noise-canceling headphones

http://localhost:8080/swagger-ui.html----------------------------------------------------------------------

``````



### API Base URL### Adding to Cart

```

http://localhost:8080/api```

```Enter Product ID: P001

Enter Quantity: 1

### API Endpoints Summary

✓ Product added to cart successfully!

#### 📦 Products (`/api/products`)Cart Total: $999.99

| Method | Endpoint | Description |```

|--------|----------|-------------|

| GET | `/api/products` | Get all products |### Viewing Cart

| GET | `/api/products/{id}` | Get product by ID |

| GET | `/api/products/search?query=laptop` | Search products |```

| GET | `/api/products/category/{category}` | Filter by category |Shopping Cart for User: U001

| POST | `/api/products` | Add new product |======================================================================

| PUT | `/api/products/{id}` | Update product |1. Product: Laptop (ID: P001) | Price: $999.99 | Qty: 1 | Subtotal: $999.99

| DELETE | `/api/products/{id}` | Delete product |2. Product: Headphones (ID: P003) | Price: $199.99 | Qty: 2 | Subtotal: $399.98

| PATCH | `/api/products/{id}/stock?quantity=100` | Update stock |======================================================================

Total Amount: $1399.97

#### 👤 Users (`/api/users`)```

| Method | Endpoint | Description |

|--------|----------|-------------|### Placing Order

| GET | `/api/users` | Get all users |

| GET | `/api/users/{id}` | Get user by ID |```

| POST | `/api/users/register` | Register new user |Proceed with checkout? (yes/no): yes

| POST | `/api/users/login` | User login |

| PUT | `/api/users/{id}` | Update user |======================================================================

| DELETE | `/api/users/{id}` | Delete user |✓ ORDER PLACED SUCCESSFULLY!

======================================================================

#### 🛒 Shopping Cart (`/api/cart`)Order ID: O001

| Method | Endpoint | Description |Total Amount: $1399.97

|--------|----------|-------------|

| GET | `/api/cart/{userId}` | Get user's cart |Simulating payment...

| POST | `/api/cart/{userId}/items` | Add item to cart |Payment successful? (yes/no): yes

| DELETE | `/api/cart/{userId}/items/{productId}` | Remove item |

| PATCH | `/api/cart/{userId}/items/{productId}?quantity=2` | Update quantity |✓ PAYMENT SUCCESSFUL!

| DELETE | `/api/cart/{userId}` | Clear cart |Payment Status: PAID



#### 📦 Orders (`/api/orders`)Your order has been confirmed and will be shipped soon.

| Method | Endpoint | Description |```

|--------|----------|-------------|

| GET | `/api/orders` | Get all orders |### Viewing Orders

| GET | `/api/orders/{id}` | Get order by ID |

| GET | `/api/orders/user/{userId}` | Get user's orders |```

| GET | `/api/orders/status/{status}` | Filter by status |======================================================================

| POST | `/api/orders` | Place new order |YOUR ORDERS

| POST | `/api/orders/{orderId}/payment` | Process payment |======================================================================

| DELETE | `/api/orders/{orderId}` | Cancel order |

Order ID: O001

### Sample API RequestsOrder Date: 2025-10-31 14:30:45

Payment Status: PAID

**Get All Products:**Items:

```bash    Laptop (ID: P001) - Qty: 1 x $999.99 = $999.99

curl http://localhost:8080/api/products    Headphones (ID: P003) - Qty: 2 x $199.99 = $399.98

```Total Amount: $1399.97

----------------------------------------------------------------------

**User Login:**```

```bash

curl -X POST http://localhost:8080/api/users/login \---

  -H "Content-Type: application/json" \

  -d '{"email":"john.smith@email.com","password":"password123"}'## 🗄 Database Schema

```

### Collections

**Add to Cart:**

```bash#### 1. **products**

curl -X POST http://localhost:8080/api/cart/U001/items \```json

  -H "Content-Type: application/json" \{

  -d '{"productId":"P001","quantity":2}'  "_id": "P001",

```  "name": "Laptop",

  "category": "Electronics",

**Place Order:**  "description": "High-performance laptop with 16GB RAM",

```bash  "price": 999.99,

curl -X POST http://localhost:8080/api/orders \  "stockQuantity": 10

  -H "Content-Type: application/json" \}

  -d '{"userId":"U001"}'```

```

#### 2. **users**

### Swagger Interactive Testing```json

{

1. Navigate to http://localhost:8080/swagger-ui.html  "_id": "U001",

2. Select an endpoint (e.g., "Products")  "name": "John Doe",

3. Click **"Try it out"**  "email": "john.doe@email.com",

4. Fill in parameters  "password": "password123",

5. Click **"Execute"**  "address": "123 Main Street, New York, NY"

6. View response with status code and data}

```

---

#### 3. **carts**

## 💾 Database Schema```json

{

### Collections  "_id": ObjectId("..."),

  "userId": "U001",

#### 1. **products**  "items": [

```json    {

{      "productId": "P001",

  "_id": "P001",      "productName": "Laptop",

  "name": "Apple MacBook Pro 16\" M3 Max",      "price": 999.99,

  "category": "Electronics",      "quantity": 1

  "description": "16-inch MacBook Pro with M3 Max chip...",    }

  "price": 3499.99,  ],

  "stockQuantity": 15,  "totalAmount": 999.99

  "_class": "com.ecommerce.model.Product"}

}```

```

#### 4. **orders**

**Indexes:**```json

- `category` (non-unique){

- Custom ID format: P001, P002, etc.  "_id": "O001",

  "userId": "U001",

#### 2. **users**  "items": [

```json    {

{      "productId": "P001",

  "_id": "U001",      "productName": "Laptop",

  "name": "John Smith",      "price": 999.99,

  "email": "john.smith@email.com",      "quantity": 1

  "password": "password123",    }

  "address": "123 Main Street, New York, NY 10001",  ],

  "_class": "com.ecommerce.model.User"  "orderDate": "2025-10-31T14:30:45",

}  "totalAmount": 999.99,

```  "paymentStatus": "PAID"

}

**Indexes:**```

- `email` (unique)

- Custom ID format: U001, U002, etc.---



#### 3. **carts**## 🔧 API Overview

```json

{### Service Layer Methods

  "_id": "auto-generated",

  "userId": "U001",#### **ProductService**

  "items": [- `addProduct(Product)` - Add new product

    {- `getAllProducts()` - Get all products

      "productId": "P001",- `getProductById(id)` - Get product by ID

      "productName": "Apple MacBook Pro 16\" M3 Max",- `getProductsByCategory(category)` - Filter by category

      "price": 3499.99,- `searchProductsByName(name)` - Search products

      "quantity": 1- `updateProduct(id, Product)` - Update product

    }- `deleteProduct(id)` - Delete product

  ],- `updateStock(productId, quantity)` - Update stock

  "totalAmount": 3499.99,- `hasStock(productId, quantity)` - Check stock availability

  "_class": "com.ecommerce.model.Cart"

}#### **UserService**

```- `registerUser(User)` - Register new user

- `loginUser(email, password)` - Authenticate user

**Indexes:**- `getUserById(id)` - Get user by ID

- `userId` (unique)- `getUserByEmail(email)` - Get user by email

- `updateUser(id, User)` - Update user info

#### 4. **orders**- `deleteUser(id)` - Delete user

```json

{#### **CartService**

  "_id": "O001",- `getOrCreateCart(userId)` - Get or create cart

  "userId": "U001",- `addToCart(userId, productId, quantity)` - Add item

  "items": [- `removeFromCart(userId, productId)` - Remove item

    {- `updateQuantity(userId, productId, quantity)` - Update quantity

      "productId": "P001",- `viewCart(userId)` - View cart

      "productName": "Apple MacBook Pro 16\" M3 Max",- `clearCart(userId)` - Clear all items

      "price": 3499.99,- `isCartEmpty(userId)` - Check if empty

      "quantity": 1

    }#### **OrderService**

  ],- `placeOrder(userId)` - Place order from cart

  "orderDate": "2025-10-28T10:30:00",- `processPayment(orderId, success)` - Process payment

  "totalAmount": 3499.99,- `getUserOrders(userId)` - Get user's orders

  "paymentStatus": "PAID",- `getOrderById(orderId)` - Get order details

  "_class": "com.ecommerce.model.Order"- `cancelOrder(orderId)` - Cancel order

}

```---



**Indexes:**## 🧪 Testing

- `userId` (non-unique)

- Custom ID format: O001, O002, etc.### Manual Testing Steps



### Sample Data Overview1. **Start the application**

2. **Register a new user**

| Collection | Documents | Details |3. **Login with credentials**

|------------|-----------|---------|4. **Browse products**

| products | 25 | Electronics (8), Clothing (5), Books (4), Home Appliances (5), Sports (3) |5. **Add items to cart**

| users | 8 | All with unique emails and login credentials |6. **View cart**

| carts | 3 | Active shopping carts with items |7. **Checkout and place order**

| orders | 6 | Mix of PAID and PENDING orders |8. **View order history**



---### Sample Test Data



## ⚙ ConfigurationThe application automatically initializes with 8 sample products across different categories when first run.



### Application Properties---

File: `src/main/resources/application.properties`

## 📝 Notes

```properties

# MongoDB Configuration for ShopSphere1. **Password Security**: In production, use Spring Security with password hashing (BCrypt)

spring.data.mongodb.host=localhost2. **ID Generation**: Custom IDs (P001, U001, O001) are used for readability

spring.data.mongodb.port=270173. **Error Handling**: All services include input validation and error messages

spring.data.mongodb.database=shopsphere_db4. **Stock Management**: Stock is automatically reduced when orders are placed

5. **Cart Persistence**: Carts are saved to database and persist across sessions

# Application Configuration

spring.application.name=ShopSphere---



# Server Configuration## 🤝 Contributing

server.port=8080

Feel free to fork this project and submit pull requests for improvements!

# Swagger/OpenAPI Configuration

springdoc.api-docs.path=/api-docs---

springdoc.swagger-ui.path=/swagger-ui.html

springdoc.swagger-ui.enabled=true## 📄 License



# Logging ConfigurationThis project is open-source and available for educational purposes.

logging.level.org.springframework.data.mongodb=INFO

logging.level.com.ecommerce=DEBUG---

```

## 👨‍💻 Author

### Custom Configuration

Created as a demonstration of Spring Boot + MongoDB CLI application.

**Change Server Port:**

```properties---

server.port=8081

```## 📞 Support



**Change Database Name:**For issues or questions, please create an issue in the repository.

```properties

spring.data.mongodb.database=my_shop_db---

```

## 🔄 Future Enhancements

**Change MongoDB Host:**

```properties- Add Spring Security for authentication

spring.data.mongodb.host=192.168.1.100- Implement password hashing

spring.data.mongodb.port=27017- Add email notifications for orders

```- Implement payment gateway integration

- Add REST API endpoints

---- Create web interface using Thymeleaf or React

- Add unit and integration tests

## 🔧 Troubleshooting- Implement order tracking

- Add product reviews and ratings

### Issue: MongoDB Connection Failed- Implement admin dashboard

**Error:** `MongoSocketOpenException: Exception opening socket`

---

**Solutions:**

1. Check if MongoDB is running:**Happy Coding! 🎉**

   ```bash
   mongosh --eval "db.version()"
   ```
2. Start MongoDB service:
   ```cmd
   net start MongoDB
   ```
3. Verify port 27017 is not blocked by firewall

### Issue: Port 8080 Already in Use
**Error:** `Web server failed to start. Port 8080 was already in use`

**Solution:** Change port in `application.properties`:
```properties
server.port=8081
```

### Issue: Build Failure
**Error:** `[ERROR] Failed to execute goal`

**Solutions:**
1. Clean Maven cache:
   ```bash
   mvn clean
   ```
2. Delete `target` folder and rebuild:
   ```bash
   mvn clean install
   ```
3. Check Java version:
   ```bash
   java -version
   ```

### Issue: Swagger UI Not Loading
**Error:** 404 Not Found on Swagger page

**Solutions:**
1. Ensure application is running
2. Check correct URL: http://localhost:8080/swagger-ui.html (note `.html`)
3. Verify `springdoc` dependency in `pom.xml`

### Issue: Duplicate Email Registration
**Error:** `Email already registered`

**Solution:** This is expected behavior. Each email can only be registered once.

### Issue: Insufficient Stock
**Error:** `Insufficient stock. Available: X`

**Solution:** Check product stock with:
```bash
curl http://localhost:8080/api/products/P001
```

### Database Reset

To clear all data and start fresh:
```bash
mongosh shopsphere_db --eval "db.dropDatabase()"
mongosh shopsphere_db mongodb-insert-data.js
```

---

## 📚 Additional Resources

- **MongoDB Guide**: See `MONGODB_GUIDE.md` for detailed database setup and data information
- **Swagger Documentation**: http://localhost:8080/swagger-ui.html (when app is running)
- **OpenAPI Spec**: http://localhost:8080/api-docs (JSON format)

---

## 🎯 Next Steps

1. ✅ **Start Application**: `mvn spring-boot:run`
2. ✅ **Use CLI**: Login with `john.smith@email.com` / `password123`
3. ✅ **Test API**: Open http://localhost:8080/swagger-ui.html
4. ✅ **Browse Products**: Try searching and filtering
5. ✅ **Place Order**: Add items to cart and checkout
6. ✅ **Integrate**: Use REST API in your own applications

---

## 📄 License

This project is for educational purposes.

---

**Built with ❤️ using Spring Boot & MongoDB**

**Enjoy shopping with ShopSphere! 🛍️**
