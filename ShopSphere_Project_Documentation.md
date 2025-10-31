# SHOPSPHERE - E-COMMERCE APPLICATION

# TABLE OF CONTENTS

## CHAPTER 1: GETTING STARTED WITH JAVA
* Introduction to Java Development
* Installing Java
* What is Java?
* Key Features of Java

## CHAPTER 2: JAVA FUNDAMENTALS
* Variables and Data Types
* Taking User Input
* Operators in Java
* Conditional Statements
* Loops (Iterators)
* Arrays
* Strings
* Methods in Java
* Exception Handling

## CHAPTER 3: OBJECT-ORIENTED PROGRAMMING
* Classes and Objects
* Constructors
* Getters and Setters
* Inheritance
* Polymorphism
* Abstract Classes and Methods
* Interfaces

## CHAPTER 4: PROJECT OVERVIEW
* Introduction
* Project Features
* Technologies Used
* System Architecture
* Prerequisites

## CHAPTER 5: PROJECT STRUCTURE AND DESIGN
* Project Structure
* Database Schema Design
* Model Classes
* Repository Layer
* Service Layer
* Controller Layer

## CHAPTER 6: IMPLEMENTATION
* Application Setup
* Configuration Files
* Core Modules Implementation
* Product Management Module
* User Management Module
* Shopping Cart Module
* Order Management Module

## CHAPTER 7: FUNCTIONALITY AND FEATURES
* CLI Interface
* REST API Endpoints
* Swagger Documentation
* Data Validation
* Error Handling

## CHAPTER 8: TESTING AND DEPLOYMENT
* Running the Application
* Testing Procedures
* Sample Inputs and Outputs
* Troubleshooting

## CHAPTER 9: CONCLUSION AND FUTURE SCOPE
* Conclusion
* Lessons Learned
* Future Enhancements
* References

---

# WEEKLY OVERVIEW OF INTERNSHIP ACTIVITIES

## WEEK - 1: Java Environment Setup and Core Fundamentals

| DAY | DATE | TOPIC/CONCEPT COVERED |
|-----|------|----------------------|
| Saturday | 05/7/25 | Windows Setup and Introduction to Java |
| Monday | 07/7/25 | Linux Setup and Your First Java App |
| Tuesday | 08/7/25 | Variables and Data Types |
| Wednesday | 09/7/25 | Taking User Input and Operators |
| Thursday | 10/7/25 | Conditionals and Overview |
| Friday | 11/7/25 | Iterators and Arrays |

## WEEK - 2: Intermediate Java and OOP Concepts

| DAY | DATE | TOPIC/CONCEPT COVERED |
|-----|------|----------------------|
| Saturday | 12/7/25 | Strings |
| Monday | 14/7/25 | Methods |
| Tuesday | 15/7/25 | Exception Handling and Overview |
| Wednesday | 16/7/25 | Classes and Objects |
| Thursday | 17/7/25 | Constructors, Getter and Setter |
| Friday | 18/7/25 | Inheritance |

## WEEK - 3: Advanced OOP, Collections, and File I/O

| DAY | DATE | TOPIC/CONCEPT COVERED |
|-----|------|----------------------|
| Saturday | 19/7/25 | Polymorphism |
| Monday | 21/7/25 | Abstract keyword |
| Tuesday | 22/7/25 | Interface |
| Wednesday | 23/7/25 | Static Keyword |
| Thursday | 24/7/25 | Collections |
| Friday | 25/7/25 | File Handling |

## WEEK - 4: Introduction to Spring Boot and MongoDB

| DAY | DATE | TOPIC/CONCEPT COVERED |
|-----|------|----------------------|
| Saturday | 26/7/25 | Introduction to Spring Boot Framework |
| Monday | 28/7/25 | Spring Boot Project Structure |
| Tuesday | 29/7/25 | MongoDB Database Setup |
| Wednesday | 30/7/25 | Spring Data MongoDB Integration |
| Thursday | 31/7/25 | REST API Development |
| Friday | 01/8/25 | Swagger API Documentation |

---

# MONTH 2 (02 Aug – 05 Sep 2025) – PROJECT PHASE

## Project Title: ShopSphere - E-Commerce Application with Spring Boot & MongoDB

### Activities:
* Requirement Analysis and System Design
* Database Schema Design (MongoDB Collections)
* Implementation of Product Management Module
* Implementation of User Management Module
* Implementation of Shopping Cart Module
* Implementation of Order Processing Module
* CRUD Operations Integration with REST APIs
* Swagger API Documentation Setup
* CLI Interface Development
* Testing and Debugging
* Report Preparation & Documentation

---

# CHAPTER 1: GETTING STARTED WITH JAVA

## Introduction to Java Development

The Java Development Kit (JDK) is software used for Java programming, along with the Java Virtual Machine (JVM) and the Java Runtime Environment (JRE). The JDK includes the compiler and class libraries, allowing developers to create Java programs executable by the JVM and JRE.

### Prerequisites

* A system running Windows 10 or higher
* A network connection
* Administrator privileges

### Installing Java on Windows

Before installing the Java Development Kit, check if a Java version is already installed on Windows:

```bash
java -version
```

The command outputs the Java version on your system. If Java isn't installed, the output is a message stating that Java isn't recognized as an internal or external command.

### Download Java for Windows

1. Using your preferred web browser, navigate to the Oracle Java Downloads page
2. On the Downloads page, click the x64 Installer download link under the Windows category
3. At the time of writing this documentation, Java version 17 is the latest long-term support Java version
4. Wait for the download to complete

### Install Java

After downloading the installation file, proceed with installing Java on your Windows system:

**Step 1:** Run the Downloaded File
* Double-click the downloaded file to start the installation

**Step 2:** Configure the Installation Wizard
* Click Next to proceed to the next step
* Choose the destination folder for the Java installation files or stick to the default path
* Click Next to proceed
* Wait for the wizard to finish the installation process until the Successfully Installed message appears
* Click Close to exit the wizard

## What is Java?

Java is one of the most popular and widely used programming languages in the world. It was developed by James Gosling and his team at Sun Microsystems in 1995, and later acquired by Oracle Corporation. Java is an object-oriented, platform-independent, and secure programming language used for developing a wide range of applications — from desktop and mobile apps to web-based and enterprise solutions.

### Key Features of Java

**1. Simple and Easy to Learn**
Java's syntax is clean and straightforward, making it easy for beginners to learn and understand. It removes many complex features of other languages like pointers and multiple inheritance.

**2. Object-Oriented Programming (OOP)**
Everything in Java is treated as an object. This promotes code reusability, flexibility, and easy maintenance through concepts like classes, objects, inheritance, polymorphism, abstraction, and encapsulation.

**3. Platform Independent**
One of Java's most important features is its "Write Once, Run Anywhere" (WORA) capability. Java programs are compiled into bytecode, which can run on any machine that has the Java Virtual Machine (JVM).

**4. Robust and Secure**
Java provides strong memory management, exception handling, and security features such as runtime checking and access control to ensure safe execution of code.

**5. Multithreaded**
Java supports multithreading, allowing multiple parts of a program to run simultaneously. This improves performance, especially in applications like gaming or animations.

**6. High Performance**
Java's performance is enhanced by its Just-In-Time (JIT) compiler, which converts bytecode into native machine code at runtime.

**7. Distributed and Network-Centric**
Java is designed for networked environments, making it suitable for building distributed applications that can communicate over networks easily.

**8. Rich API and Libraries**
Java offers a vast collection of built-in classes and methods that simplify development — including libraries for data structures, networking, GUI development, and database connectivity.

---

# CHAPTER 2: JAVA FUNDAMENTALS

## Variables and Data Types

### What are Variables?

A variable is a container that holds data that can be changed during the execution of a program. In Java, every variable must be declared with a data type.

### Data Types in Java

Java has two categories of data types:

**Primitive Data Types:**
* **byte** - 8-bit integer (-128 to 127)
* **short** - 16-bit integer (-32,768 to 32,767)
* **int** - 32-bit integer (-2³¹ to 2³¹-1)
* **long** - 64-bit integer (-2⁶³ to 2⁶³-1)
* **float** - 32-bit floating point
* **double** - 64-bit floating point
* **char** - 16-bit Unicode character
* **boolean** - true or false

**Reference Data Types:**
* String, Arrays, Classes, Interfaces

### Example Code for Variables and Data Types

```java
// Example program to demonstrate variables in Java
public class VariablesExample {
    public static void main(String[] args) {
        
        // Declaring and initializing variables
        int age = 21;                  // Integer variable
        double salary = 55000.75;      // Floating-point variable
        char grade = 'A';              // Character variable
        boolean isJavaFun = true;      // Boolean variable
        String name = "Lavanya";       // String variable
        
        // Displaying the values of variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);
    }
}
```

## Taking User Input

Java provides the `Scanner` class to read user input from the console.

### Example Code for User Input

```java
package com.internshala.javaapp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int population;
        float populationDensity;
        double GDP;
        char currency; // '$'
        boolean isSecular;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your country name: ");
        name = scanner.nextLine();
        
        System.out.println("Enter population: ");
        population = scanner.nextInt();
        
        System.out.println("Enter currency symbol: ");
        currency = scanner.next().charAt(0);
        
        System.out.println("Your country name is: " + name);
        System.out.println("The population of the country is: " + population);
        System.out.println("The currency symbol is: " + currency);
        
        scanner.close();
    }
}
```

## Operators in Java

Operators are symbols that perform operations on variables and values.

### Types of Operators

**1. Arithmetic Operators**
* `+` Addition
* `-` Subtraction
* `*` Multiplication
* `/` Division
* `%` Modulus (remainder)

**2. Relational Operators**
* `==` Equal to
* `!=` Not equal to
* `>` Greater than
* `<` Less than
* `>=` Greater than or equal to
* `<=` Less than or equal to

**3. Logical Operators**
* `&&` Logical AND
* `||` Logical OR
* `!` Logical NOT

**4. Assignment Operators**
* `=` Simple assignment
* `+=` Add and assign
* `-=` Subtract and assign
* `*=` Multiply and assign
* `/=` Divide and assign

**5. Increment/Decrement Operators**
* `++` Increment by 1
* `--` Decrement by 1

## Conditional Statements

Conditional statements allow you to execute different code based on different conditions.

### If-Else Statement

```java
public class ConditionalExample {
    public static void main(String[] args) {
        int age = 18;
        
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
```

### Switch Statement

```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

## Loops (Iterators)

Loops are used to execute a block of code repeatedly.

### For Loop

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}
```

### While Loop

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++;
        }
    }
}
```

### Do-While Loop

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Count: " + i);
            i++;
        } while (i <= 5);
    }
}
```

## Arrays

An array is a container object that holds a fixed number of values of a single type.

### Example Program for 1D Array

```java
package com.internshala.javaapp;

public class Main {
    public static void main(String[] args) {
        
        // WAP to print all numbers in array along with sum of all elements
        
        // Index  0   1   2   3
        int[] myFirstArray = { 20, 19, 48, 7 };
        int sum = 0;
        
        for (int i = 0; i < myFirstArray.length; i++) {
            sum += myFirstArray[i];
            System.out.println(myFirstArray[i]);
        }
        System.out.println("Sum of firstArray: " + sum);
        
        // Second way to declare an Array
        float[] mySecondArray = new float[3];
        mySecondArray[0] = 34.2f;
        mySecondArray[1] = 4.6f;
        mySecondArray[2] = 78.11f;
        
        float sumOfNumbers = 0;
        for (float num: mySecondArray) {  // For Each Loop
            sumOfNumbers += num;
            System.out.println(num);
        }
        System.out.println("Sum of secondArray: " + sumOfNumbers);
    }
}
```

## Strings

A String is a sequence of characters. In Java, strings are objects.

### Example Code for String

```java
package com.internshala.javaapp;

public class Main {
    public static void main(String[] args) {
        // String Handling
        // Index  0  1  2  3  4  5  6  --> length of 7
        char[] myArray = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };
        
        // Using Literals to create String
        String firstString = "Welcome";   // S1
        String secondString = "Welcome";  // S1
        
        // Using new keyword
        String thirdString = new String("Welcome");  // S2
        
        System.out.println(firstString == secondString);
        // Compare Two Objects .. true .. S1 == S1
        
        System.out.println(firstString == thirdString);
        // Compare Two Objects .. false
        
        System.out.println(firstString.equals(thirdString));
        // Compare two values .. true "Welcome" == "Welcome"
        
        System.out.println(myArray.length);        // 7
        System.out.println(firstString.length());  // 7
        System.out.println(firstString.charAt(6)); // e
        System.out.println(firstString.toUpperCase());  // WELCOME
        System.out.println(firstString.toLowerCase());  // welcome
        System.out.println(firstString.contains("come"));  // true
        System.out.println(firstString + " to Internshala");
        // Welcome to Internshala
        System.out.println(firstString.concat(" to Internshala"));
        // Welcome to Internshala
    }
}
```

## Methods in Java

A method is a block of code or collection of statements that performs a specific task. It provides code reusability.

### What is a Method?

A method is a way to perform some task. It is used to achieve the reusability of code. We write a method once and use it many times.

### Method Signature

Every method has a method signature that includes:
* Access Specifier (public, private, protected, default)
* Return Type (void, int, String, etc.)
* Method Name
* Parameter List

### Access Specifiers

* **Public:** The method is accessible by all classes
* **Private:** The method is accessible only in the class in which it is defined
* **Protected:** The method is accessible within the same package or subclasses in a different package
* **Default:** Visible only from the same package

### Types of Methods

**1. Predefined Methods**

Methods that are already defined in Java class libraries.

```java
public class Demo {
    public static void main(String[] args) {
        // using the max() method of Math class
        System.out.print("The maximum number is: " + Math.max(9, 7));
    }
}
```

**2. User-defined Methods**

Methods written by the user or programmer.

```java
public class EvenOddExample {
    // User defined method
    public static void findEvenOdd(int num) {
        // Method body
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
    
    public static void main(String[] args) {
        findEvenOdd(10);  // Calling the method
        findEvenOdd(15);
    }
}
```

## Exception Handling

Exception Handling in Java is a powerful mechanism to handle runtime errors so that the normal flow of the application can be maintained.

### What is an Exception?

An exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

### Advantage of Exception Handling

The core advantage of exception handling is to maintain the normal flow of the application. Without exception handling, if an exception occurs, the rest of the code will not be executed.

### Example of Exception Handling

```java
public class JavaExceptionExample {
    public static void main(String args[]) {
        try {
            // Code that may raise exception
            int data = 100 / 0;
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
        // Rest code of the program
        System.out.println("rest of the code...");
    }
}
```

---

# CHAPTER 3: OBJECT-ORIENTED PROGRAMMING

## Classes and Objects

### What is a Class?

A class in Java is a blueprint or template that defines the structure and behavior (data and methods) of objects. It represents a group of related variables (called fields) and functions (called methods) that operate on those variables.

**In simple words:** A class is like a "design" or "plan," and an object is the "real thing" built from that design.

### Example of Class

```java
class Car {
    // Fields
    String brand;
    String color;
    int speed;
    
    // Method
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}
```

### What is an Object?

An object is an instance of a class — it is created in memory when you use the `new` keyword. Each object has its own copy of the class's variables and can use its methods.

### Example of Object

```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car();
        
        // Assigning values
        myCar.brand = "Tesla";
        myCar.color = "Red";
        myCar.speed = 120;
        
        // Calling method
        myCar.displayDetails();
    }
}
```

## Constructors

A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.

### Example of Constructor

```java
// Create a Main class
public class Main {
    int x;  // Create a class attribute
    
    // Create a class constructor for the Main class
    public Main() {
        x = 5;  // Set the initial value for the class attribute x
    }
    
    public static void main(String[] args) {
        Main myObj = new Main();  // Create an object (calls the constructor)
        System.out.println(myObj.x);  // Print the value of x
    }
}
// Outputs 5
```

## Getters and Setters

The get method returns the variable value, and the set method sets the value.

### Example of Getter and Setter

```java
public class Person {
    private String name;  // private = restricted access
    
    // Getter
    public String getName() {
        return name;
    }
    
    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
```

## Inheritance in Java

Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).

### Terms Used in Inheritance

* **Class:** A template or blueprint from which objects are created
* **Sub Class/Child Class:** A class which inherits another class
* **Super Class/Parent Class:** The class from where a subclass inherits features
* **Reusability:** Mechanism to reuse fields and methods of existing class

### Syntax of Java Inheritance

```java
class Subclass-name extends Superclass-name {
    // methods and fields
}
```

The `extends` keyword indicates that you are making a new class that derives from an existing class.

## Polymorphism

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

### Example of Polymorphism

```java
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
```

## Abstract Classes and Methods

Data abstraction is the process of hiding certain details and showing only essential information to the user.

### The Abstract Keyword

* **Abstract class:** A restricted class that cannot be used to create objects (must be inherited)
* **Abstract method:** Can only be used in an abstract class, and it does not have a body

### Example of Abstract Class

```java
abstract class Animal {
    public abstract void animalSound();
    
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Animal myObj = new Animal(); // will generate an error
```

## Interfaces

An interface is a completely "abstract class" that is used to group related methods with empty bodies.

### Example of Interface Declaration

```java
// Interface
interface Animal {
    public void animalSound();  // interface method (does not have a body)
    public void run();          // interface method (does not have a body)
}
```

### Implementing an Interface

To access the interface methods, the interface must be "implemented" by another class with the `implements` keyword.

```java
// Interface
interface Animal {
    public void animalSound();
    public void sleep();
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
```

---

# CHAPTER 4: PROJECT OVERVIEW

## Introduction

ShopSphere is a modern, full-featured e-commerce application that provides both a Command Line Interface (CLI) and RESTful API capabilities. Built using Spring Boot 3.1.5 and MongoDB, this project demonstrates enterprise-level application development practices suitable for real-world deployment.

The application addresses the common requirements of online shopping platforms by implementing user authentication, product catalog management, shopping cart functionality, and complete order processing workflows. By leveraging the Spring Boot ecosystem and MongoDB's flexible document-based storage, ShopSphere provides a scalable foundation for e-commerce operations.

This project showcases modern software development practices including:

* Model-View-Controller (MVC) architecture
* RESTful API design principles
* NoSQL database integration
* Automated API documentation with Swagger
* Input validation and error handling
* Separation of concerns through layered architecture

## Project Features

### 1. Product Management

* Complete CRUD operations (Create, Read, Update, Delete)
* Product categorization (Electronics, Clothing, Books, Home Appliances, Sports & Fitness)
* Advanced search by name (case-insensitive)
* Category-based filtering
* Real-time stock management
* Price validation and constraints
* Product availability tracking

### 2. User Management

* User registration with comprehensive validation
* Email uniqueness constraint
* Secure login authentication
* User profile management
* Address tracking for delivery
* User role management

### 3. Shopping Cart

* Add products with quantity selection
* Remove items from cart
* Update item quantities
* Real-time price calculation
* Stock validation before adding items
* Persistent cart storage
* Clear cart functionality
* Cart summary with total amount

### 4. Order Management

* Place orders from shopping cart
* Automated stock reduction
* Order history tracking
* Itemized order details
* Payment status tracking (PAID, PENDING, FAILED)
* Simulated payment processing
* Order confirmation

### 5. REST API & Swagger Documentation

* Comprehensive RESTful API endpoints
* Interactive Swagger UI for API testing
* Automatic API documentation generation
* Request/Response examples
* HTTP status code handling

### 6. Command Line Interface

* Interactive menu-driven CLI
* User-friendly navigation
* Real-time data display
* Input validation
* Error handling and messages

## Technologies Used

### 1. Backend Framework

**Spring Boot 3.1.5**
* Spring Boot Starter Web
* Spring Boot Starter Data MongoDB
* Spring Boot Auto-configuration

### 2. Database

**MongoDB (NoSQL Database)**
* Flexible document-based storage
* Embedded MongoDB support
* MongoDB Java Driver

### 3. API Documentation

**Springdoc OpenAPI 2.2.0**
* Swagger UI
* OpenAPI 3.0 Specification
* Interactive API Documentation

### 4. Build Tool

**Apache Maven**
* Dependency management
* Build automation
* Project lifecycle management

### 5. Java Version

**Java 17 (LTS)**
* Modern language features
* Enhanced performance
* Long-term support

### 6. Additional Libraries

**Lombok (Optional)**
* Reduces boilerplate code
* Auto-generates getters/setters
* Builder pattern support

## System Architecture

ShopSphere follows a layered architecture pattern:

### 1. Presentation Layer

* CLI Interface (ECommerceCLI.java)
* REST Controllers (Controller package)
  * ProductController
  * UserController
  * CartController
  * OrderController

### 2. Service Layer

* Business logic implementation
* Service classes (Service package)
  * ProductService
  * UserService
  * CartService
  * OrderService

### 3. Repository Layer

* Data access layer
* MongoDB repositories (Repository package)
  * ProductRepository
  * UserRepository
  * CartRepository
  * OrderRepository

### 4. Model Layer

* Domain entities (Model package)
  * Product
  * User
  * Cart & CartItem
  * Order & OrderItem

### 5. Utility Layer

* Helper classes (Util package)
  * IdGenerator
  * InputValidator

### 6. Configuration Layer

* Application configuration
  * SwaggerConfig
  * application.properties

## Prerequisites

### Software Requirements:

* Java Development Kit (JDK) 17 or higher
* MongoDB Server 4.0 or higher
* Apache Maven 3.6 or higher
* Code Editor/IDE (IntelliJ IDEA, Eclipse, or VS Code)
* Windows 10/11, macOS, or Linux operating system
* Git (for version control)
* Postman (optional, for API testing)

### Hardware Requirements:

* Processor: Intel i3 or higher / AMD equivalent
* RAM: 8 GB or more (recommended)
* Storage: 500 MB free disk space
* Internet connection for downloading dependencies

### Knowledge Prerequisites:

* Core Java programming concepts
* Object-Oriented Programming (OOP)
* Basic understanding of databases
* Spring Boot framework basics
* RESTful API concepts
* Maven build tool
* Command line operations

---

# CHAPTER 5: PROJECT STRUCTURE AND DESIGN

## Project Structure

```
Shopsphere-ECommerce-App/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── ecommerce/
│       │           ├── ECommerceApplication.java          # Main application entry point
│       │           ├── ECommerceCLI.java                  # CLI interface
│       │           │
│       │           ├── config/
│       │           │   └── SwaggerConfig.java             # Swagger configuration
│       │           │
│       │           ├── controller/                        # REST API Controllers
│       │           │   ├── CartController.java
│       │           │   ├── OrderController.java
│       │           │   ├── ProductController.java
│       │           │   └── UserController.java
│       │           │
│       │           ├── model/                             # Domain models
│       │           │   ├── Cart.java
│       │           │   ├── CartItem.java
│       │           │   ├── Order.java
│       │           │   ├── OrderItem.java
│       │           │   ├── Product.java
│       │           │   └── User.java
│       │           │
│       │           ├── repository/                        # Data access layer
│       │           │   ├── CartRepository.java
│       │           │   ├── OrderRepository.java
│       │           │   ├── ProductRepository.java
│       │           │   └── UserRepository.java
│       │           │
│       │           ├── service/                           # Business logic layer
│       │           │   ├── CartService.java
│       │           │   ├── OrderService.java
│       │           │   ├── ProductService.java
│       │           │   └── UserService.java
│       │           │
│       │           └── util/                              # Utility classes
│       │               ├── IdGenerator.java
│       │               └── InputValidator.java
│       │
│       └── resources/
│           └── application.properties                     # Application configuration
│
├── pom.xml                                                # Maven configuration
├── README.md                                              # Project documentation
├── MONGODB_GUIDE.md                                       # MongoDB setup guide
├── mongodb-insert-data.js                                 # Sample data script
└── mongodb-quick-setup.bat                                # Quick setup script
```

## Database Schema Design

ShopSphere uses MongoDB with four main collections:

### 1. Products Collection

```json
{
  "_id": ObjectId,
  "productId": "P001",
  "name": "Laptop",
  "description": "High-performance laptop",
  "price": 899.99,
  "category": "Electronics",
  "stock": 50
}
```

### 2. Users Collection

```json
{
  "_id": ObjectId,
  "userId": "U001",
  "username": "john_doe",
  "email": "john@example.com",
  "password": "hashed_password",
  "address": "123 Main St, City"
}
```

### 3. Carts Collection

```json
{
  "_id": ObjectId,
  "cartId": "CART001",
  "userId": "U001",
  "items": [
    {
      "productId": "P001",
      "productName": "Laptop",
      "quantity": 1,
      "price": 899.99,
      "subtotal": 899.99
    }
  ],
  "totalAmount": 899.99
}
```

### 4. Orders Collection

```json
{
  "_id": ObjectId,
  "orderId": "ORD001",
  "userId": "U001",
  "items": [
    {
      "productId": "P001",
      "productName": "Laptop",
      "quantity": 1,
      "price": 899.99,
      "subtotal": 899.99
    }
  ],
  "totalAmount": 899.99,
  "orderDate": "2025-10-31T10:30:00",
  "paymentStatus": "PAID"
}
```

## Model Classes

### 1. Product.java

* Represents product entities
* Fields: productId, name, description, price, category, stock
* Annotations: @Document, @Id, validation annotations

### 2. User.java

* Represents user entities
* Fields: userId, username, email, password, address
* Includes email validation

### 3. Cart.java & CartItem.java

* Cart represents shopping cart
* CartItem represents individual items in cart
* Automatic total calculation

### 4. Order.java & OrderItem.java

* Order represents customer orders
* OrderItem represents items in orders
* Includes payment status and order date

## Repository Layer

Repositories extend MongoRepository interface:

### 1. ProductRepository

* Custom query methods for product search
* Category filtering
* Name-based search (case-insensitive)

### 2. UserRepository

* Find user by email
* Find user by username
* Email uniqueness validation

### 3. CartRepository

* Find cart by userId
* Cart persistence

### 4. OrderRepository

* Find orders by userId
* Order history retrieval

## Service Layer

Service classes contain business logic:

### 1. ProductService

* Add/Update/Delete products
* Search and filter products
* Stock management
* Validation logic

### 2. UserService

* User registration
* Login authentication
* Profile management
* Email validation

### 3. CartService

* Add items to cart
* Update quantities
* Remove items
* Calculate totals
* Stock validation

### 4. OrderService

* Place orders
* Process payments
* Update stock
* Order history

## Controller Layer

REST API endpoints:

### 1. ProductController

* GET /api/products - List all products
* GET /api/products/{id} - Get product by ID
* POST /api/products - Add new product
* PUT /api/products/{id} - Update product
* DELETE /api/products/{id} - Delete product
* GET /api/products/search - Search products

### 2. UserController

* POST /api/users/register - Register user
* POST /api/users/login - Login user
* GET /api/users/{id} - Get user profile

### 3. CartController

* GET /api/cart/{userId} - Get user's cart
* POST /api/cart/add - Add item to cart
* PUT /api/cart/update - Update cart item
* DELETE /api/cart/remove - Remove item
* DELETE /api/cart/clear - Clear cart

### 4. OrderController

* POST /api/orders/place - Place order
* GET /api/orders/{userId} - Get order history
* GET /api/orders/details/{orderId} - Get order details

---

# CHAPTER 6: IMPLEMENTATION

## Application Setup

### Step 1: MongoDB Installation and Setup

#### 1. Download MongoDB Community Server

* Visit: https://www.mongodb.com/try/download/community
* Select your operating system
* Download and install

#### 2. Start MongoDB Service

**Windows:**
* MongoDB should start automatically as a service
* Or use: `net start MongoDB`

**Linux/Mac:**
* `sudo systemctl start mongod`
* Or: `brew services start mongodb-community`

#### 3. Verify MongoDB is running:

* Open command prompt/terminal
* Type: `mongo`
* You should see MongoDB shell

#### 4. Create Database (Optional - Auto-created on first use):

* `use shopsphere_db`

### Step 2: Java Development Kit (JDK) Installation

#### 1. Download JDK 17

* Visit: https://www.oracle.com/java/technologies/downloads/
* Download JDK 17 for your OS
* Install following wizard instructions

#### 2. Set Environment Variables:

**Windows:**
* JAVA_HOME = C:\Program Files\Java\jdk-17
* Add to PATH: %JAVA_HOME%\bin

**Linux/Mac:**
* Add to ~/.bashrc or ~/.zshrc:
  * `export JAVA_HOME=/path/to/jdk-17`
  * `export PATH=$JAVA_HOME/bin:$PATH`

#### 3. Verify Installation:

* `java -version`
* Should show Java version 17

### Step 3: Apache Maven Installation

#### 1. Download Maven

* Visit: https://maven.apache.org/download.cgi
* Download Binary zip archive

#### 2. Extract and Setup:

* Extract to C:\Program Files\Apache\maven (Windows)
* Or /usr/local/maven (Linux/Mac)

#### 3. Set Environment Variables:

* MAVEN_HOME = path to maven directory
* Add to PATH: %MAVEN_HOME%\bin

#### 4. Verify:

* `mvn -version`

### Step 4: Clone/Download Project

#### 1. Using Git:

```bash
git clone <repository-url>
cd Shopsphere-ECommerce-App
```

#### 2. Or download ZIP and extract

### Step 5: Build the Project

#### 1. Navigate to project directory:

```bash
cd Shopsphere-ECommerce-App
```

#### 2. Build using Maven:

```bash
mvn clean install
```

#### 3. Wait for dependencies to download

## Configuration Files

### 1. application.properties

```properties
# MongoDB Configuration
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=shopsphere_db

# Application Configuration
spring.application.name=ShopSphere

# Server Configuration
server.port=8080

# Swagger/OpenAPI Configuration
springdoc.api-docs.path=/api-docs
springdoc.swagger-ui.path=/swagger-ui.html
springdoc.swagger-ui.enabled=true

# Logging Configuration
logging.level.org.springframework.data.mongodb=INFO
logging.level.com.ecommerce=DEBUG
```

### 2. pom.xml (Key Dependencies)

```xml
<dependencies>
    <!-- Spring Boot Starter for MongoDB -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-mongodb</artifactId>
    </dependency>

    <!-- Spring Boot Web Starter for REST API -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Springdoc OpenAPI (Swagger) -->
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.2.0</version>
    </dependency>
</dependencies>
```

## Core Modules Implementation

### 1. Main Application Class

```java
@SpringBootApplication
public class ECommerceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ECommerceApplication.class, args);
    }
}
```

### 2. Swagger Configuration

```java
@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "ShopSphere E-Commerce API",
        version = "1.0",
        description = "REST API for E-Commerce Application"
    )
)
public class SwaggerConfig {
    // Swagger auto-configuration
}
```

## Product Management Module

### 1. Product Model

```java
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String productId;
    private String name;
    private String description;
    private double price;
    private String category;
    private int stock;
    
    // Constructors, getters, setters
}
```

### 2. Product Repository

```java
public interface ProductRepository extends MongoRepository<Product, String> {
    Optional<Product> findByProductId(String productId);
    List<Product> findByNameContainingIgnoreCase(String name);
    List<Product> findByCategory(String category);
}
```

### 3. Product Service

```java
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public Product addProduct(Product product) {
        // Generate product ID
        // Validate product data
        // Save and return
    }
    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    public Optional<Product> getProductById(String id) {
        return productRepository.findByProductId(id);
    }
    
    public Product updateProduct(String id, Product product) {
        // Find existing product
        // Update fields
        // Save and return
    }
    
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
    
    public List<Product> searchProducts(String keyword) {
        return productRepository.findByNameContainingIgnoreCase(keyword);
    }
}
```

### 4. Product Controller

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
    
    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.addProduct(product));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(
        @PathVariable String id, 
        @RequestBody Product product) {
        return ResponseEntity.ok(productService.updateProduct(id, product));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
```

## User Management Module

Similar structure to Product Management:

* User model with validation
* UserRepository for data access
* UserService for business logic
* UserController for REST endpoints

**Key Features:**

* Email validation and uniqueness
* Password handling (can be enhanced with encryption)
* User registration and login
* Profile management

## Shopping Cart Module

### 1. Cart & CartItem Models

```java
@Document(collection = "carts")
public class Cart {
    @Id
    private String id;
    private String cartId;
    private String userId;
    private List<CartItem> items;
    private double totalAmount;
    
    // Auto-calculate total
    public void calculateTotal() {
        this.totalAmount = items.stream()
            .mapToDouble(CartItem::getSubtotal)
            .sum();
    }
}

public class CartItem {
    private String productId;
    private String productName;
    private int quantity;
    private double price;
    private double subtotal;
}
```

### 2. Cart Service

```java
@Service
public class CartService {
    public Cart addToCart(String userId, String productId, int quantity) {
        // Find or create cart
        // Check product stock
        // Add item or update quantity
        // Calculate total
        // Save and return
    }
    
    public Cart removeFromCart(String userId, String productId) {
        // Find cart
        // Remove item
        // Recalculate total
        // Save and return
    }
    
    public Cart getCart(String userId) {
        return cartRepository.findByUserId(userId)
            .orElse(new Cart());
    }
    
    public void clearCart(String userId) {
        // Find and delete cart
    }
}
```

## Order Management Module

### 1. Order & OrderItem Models

```java
@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String orderId;
    private String userId;
    private List<OrderItem> items;
    private double totalAmount;
    private LocalDateTime orderDate;
    private String paymentStatus; // PAID, PENDING, FAILED
}
```

### 2. Order Service

```java
@Service
public class OrderService {
    public Order placeOrder(String userId) {
        // Get user's cart
        // Validate cart not empty
        // Check stock availability
        // Create order from cart
        // Simulate payment processing
        // Update product stock
        // Clear cart
        // Save and return order
    }
    
    public List<Order> getOrderHistory(String userId) {
        return orderRepository.findByUserId(userId);
    }
}
```

---

# CHAPTER 7: FUNCTIONALITY AND FEATURES

## CLI Interface

The CLI provides an interactive menu-driven interface:

### Main Menu:

1. Product Management
2. User Management
3. Shopping Cart
4. Order Management
5. Exit

### Product Management Submenu:

1. View All Products
2. Search Products
3. Filter by Category
4. Add Product (Admin)
5. Update Product (Admin)
6. Delete Product (Admin)
7. Back to Main Menu

### User Management Submenu:

1. Register New User
2. Login
3. View Profile
4. Update Profile
5. Back to Main Menu

### Shopping Cart Submenu:

1. View Cart
2. Add Product to Cart
3. Update Quantity
4. Remove Item
5. Clear Cart
6. Proceed to Checkout
7. Back to Main Menu

### Order Management Submenu:

1. View Order History
2. View Order Details
3. Back to Main Menu

## REST API Endpoints

### Product APIs:

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/products | Get all products |
| GET | /api/products/{id} | Get product by ID |
| GET | /api/products/search?name= | Search products |
| GET | /api/products/category/{cat} | Filter by category |
| POST | /api/products | Add new product |
| PUT | /api/products/{id} | Update product |
| DELETE | /api/products/{id} | Delete product |

#### Request Body Example (POST /api/products):

```json
{
  "name": "Wireless Mouse",
  "description": "Ergonomic wireless mouse",
  "price": 29.99,
  "category": "Electronics",
  "stock": 100
}
```

#### Response Example:

```json
{
  "productId": "P001",
  "name": "Wireless Mouse",
  "description": "Ergonomic wireless mouse",
  "price": 29.99,
  "category": "Electronics",
  "stock": 100
}
```

### User APIs:

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/users/register | Register new user |
| POST | /api/users/login | User login |
| GET | /api/users/{id} | Get user profile |
| PUT | /api/users/{id} | Update profile |

#### Request Body Example (POST /api/users/register):

```json
{
  "username": "john_doe",
  "email": "john@example.com",
  "password": "password123",
  "address": "123 Main St, City"
}
```

### Cart APIs:

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/cart/{userId} | Get user's cart |
| POST | /api/cart/add | Add item to cart |
| PUT | /api/cart/update | Update item quantity |
| DELETE | /api/cart/remove | Remove item |
| DELETE | /api/cart/clear/{userId} | Clear cart |

#### Request Body Example (POST /api/cart/add):

```json
{
  "userId": "U001",
  "productId": "P001",
  "quantity": 2
}
```

### Order APIs:

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/orders/place | Place order |
| GET | /api/orders/{userId} | Get order history |
| GET | /api/orders/details/{orderId} | Get order details |

#### Request Body Example (POST /api/orders/place):

```json
{
  "userId": "U001"
}
```

#### Response Example:

```json
{
  "orderId": "ORD001",
  "userId": "U001",
  "items": [
    {
      "productId": "P001",
      "productName": "Wireless Mouse",
      "quantity": 2,
      "price": 29.99,
      "subtotal": 59.98
    }
  ],
  "totalAmount": 59.98,
  "orderDate": "2025-10-31T10:30:00",
  "paymentStatus": "PAID"
}
```

## Swagger Documentation

**Access Swagger UI:** http://localhost:8080/swagger-ui.html

### Features:

* Interactive API documentation
* Try out API endpoints directly
* View request/response schemas
* See example payloads
* HTTP status codes documentation
* Parameter descriptions

**OpenAPI JSON:** http://localhost:8080/api-docs

## Data Validation

### 1. Product Validation:

* Name: Required, not empty
* Price: Must be positive
* Stock: Cannot be negative
* Category: Must be from predefined list

### 2. User Validation:

* Email: Valid format, unique
* Username: Required, not empty
* Password: Minimum length requirements

### 3. Cart Validation:

* Quantity: Must be positive
* Product availability check
* Stock validation

### 4. Order Validation:

* Cart must not be empty
* Sufficient stock for all items
* User must exist

## Error Handling

The application implements comprehensive error handling:

### 1. HTTP Status Codes:

* **200 OK:** Successful request
* **201 Created:** Resource created
* **204 No Content:** Successful deletion
* **400 Bad Request:** Invalid input
* **404 Not Found:** Resource not found
* **500 Internal Server Error:** Server error

### 2. Custom Exception Handling:

* ProductNotFoundException
* UserNotFoundException
* InsufficientStockException
* InvalidInputException

### 3. Error Response Format:

```json
{
  "timestamp": "2025-10-31T10:30:00",
  "status": 404,
  "error": "Not Found",
  "message": "Product with ID P999 not found",
  "path": "/api/products/P999"
}
```

---

# CHAPTER 8: TESTING AND DEPLOYMENT

## Running the Application

### Method 1: Using Maven

1. Open terminal in project directory
2. Run command: `mvn spring-boot:run`
3. Application starts on http://localhost:8080

### Method 2: Using JAR File

1. Build the JAR: `mvn clean package`
2. Run the JAR: `java -jar target/ecommerce-mongodb-cli-1.0.0.jar`

### Method 3: Using IDE

1. Open project in IntelliJ IDEA/Eclipse
2. Locate ECommerceApplication.java
3. Right-click and select "Run"

### Method 4: CLI Mode Only

To run only CLI interface:

1. Comment out @SpringBootApplication
2. Run ECommerceCLI.java directly

## Testing Procedures

### 1. Manual Testing via CLI

**Step 1:** Start the application  
**Step 2:** Choose option from main menu  
**Step 3:** Follow prompts for data entry  
**Step 4:** Verify results displayed  
**Step 5:** Check MongoDB for data persistence

#### Example Test Case - Add Product:

1. Select "1. Product Management"
2. Select "4. Add Product"
3. Enter product details:
   * Name: Laptop
   * Description: Gaming laptop
   * Price: 1299.99
   * Category: Electronics
   * Stock: 25
4. Verify success message
5. View all products to confirm addition

### 2. Testing via Swagger UI

**Step 1:** Open browser  
**Step 2:** Navigate to http://localhost:8080/swagger-ui.html  
**Step 3:** Expand API endpoint  
**Step 4:** Click "Try it out"  
**Step 5:** Enter request body  
**Step 6:** Click "Execute"  
**Step 7:** Verify response

#### Example: Test POST /api/products

1. Expand ProductController
2. Click POST /api/products
3. Click "Try it out"
4. Enter JSON:

```json
{
  "name": "Smartphone",
  "description": "Latest model",
  "price": 699.99,
  "category": "Electronics",
  "stock": 50
}
```

5. Click Execute
6. Check response code 200
7. Verify product created in response

### 3. Testing via Postman

**Step 1:** Install Postman  
**Step 2:** Create new request  
**Step 3:** Set method (GET/POST/PUT/DELETE)  
**Step 4:** Enter URL: http://localhost:8080/api/...  
**Step 5:** Add request body (for POST/PUT)  
**Step 6:** Send request  
**Step 7:** Verify response

#### Example Collection:

* Register User
* Login User
* Add Product
* Search Products
* Add to Cart
* Place Order
* View Order History

### 4. Database Verification

**Step 1:** Open MongoDB Compass or Shell  
**Step 2:** Connect to localhost:27017  
**Step 3:** Select shopsphere_db  
**Step 4:** View collections:
* products
* users
* carts
* orders

**Step 5:** Verify data matches application operations

## Sample Inputs and Outputs

### Scenario 1: Adding a Product

#### CLI Input:

```
Enter Product Name: Wireless Headphones
Enter Description: Bluetooth noise-cancelling headphones
Enter Price: 149.99
Enter Category: Electronics
Enter Stock Quantity: 75
```

#### CLI Output:

```
✓ Product added successfully!
Product ID: P001
Name: Wireless Headphones
Price: $149.99
Stock: 75 units
```

#### MongoDB Document:

```json
{
  "_id": ObjectId("..."),
  "productId": "P001",
  "name": "Wireless Headphones",
  "description": "Bluetooth noise-cancelling headphones",
  "price": 149.99,
  "category": "Electronics",
  "stock": 75
}
```

### Scenario 2: User Registration

#### API Request: POST /api/users/register

```json
{
  "username": "alice_smith",
  "email": "alice@example.com",
  "password": "securePass123",
  "address": "456 Oak Avenue, Springfield"
}
```

#### API Response: 201 Created

```json
{
  "userId": "U001",
  "username": "alice_smith",
  "email": "alice@example.com",
  "address": "456 Oak Avenue, Springfield"
}
```

### Scenario 3: Adding to Cart

#### API Request: POST /api/cart/add

```json
{
  "userId": "U001",
  "productId": "P001",
  "quantity": 2
}
```

#### API Response: 200 OK

```json
{
  "cartId": "CART001",
  "userId": "U001",
  "items": [
    {
      "productId": "P001",
      "productName": "Wireless Headphones",
      "quantity": 2,
      "price": 149.99,
      "subtotal": 299.98
    }
  ],
  "totalAmount": 299.98
}
```

### Scenario 4: Placing an Order

#### API Request: POST /api/orders/place

```json
{
  "userId": "U001"
}
```

#### API Response: 200 OK

```json
{
  "orderId": "ORD001",
  "userId": "U001",
  "items": [
    {
      "productId": "P001",
      "productName": "Wireless Headphones",
      "quantity": 2,
      "price": 149.99,
      "subtotal": 299.98
    }
  ],
  "totalAmount": 299.98,
  "orderDate": "2025-10-31T14:30:00",
  "paymentStatus": "PAID"
}
```

**Stock Update:**  
Product P001 stock: 75 → 73 (reduced by quantity ordered)

### Scenario 5: Searching Products

#### CLI Input:

```
Enter search keyword: wireless
```

#### CLI Output:

```
Search Results (2 found):

1. Product ID: P001
   Name: Wireless Headphones
   Price: $149.99
   Stock: 73 units

2. Product ID: P005
   Name: Wireless Mouse
   Price: $29.99
   Stock: 150 units
```

### Scenario 6: Viewing Order History

#### API Request: GET /api/orders/U001

#### API Response: 200 OK

```json
[
  {
    "orderId": "ORD001",
    "totalAmount": 299.98,
    "orderDate": "2025-10-31T14:30:00",
    "paymentStatus": "PAID",
    "itemCount": 1
  },
  {
    "orderId": "ORD002",
    "totalAmount": 699.99,
    "orderDate": "2025-10-31T15:45:00",
    "paymentStatus": "PAID",
    "itemCount": 2
  }
]
```

## Troubleshooting

### Problem 1: MongoDB Connection Failed

**Error:** "Unable to connect to MongoDB"

#### Solutions:

1. Verify MongoDB is running:
   * Windows: Check Services for "MongoDB"
   * Linux/Mac: `sudo systemctl status mongod`

2. Check connection string in application.properties:
   * `spring.data.mongodb.host=localhost`
   * `spring.data.mongodb.port=27017`

3. Verify port 27017 is not blocked by firewall

4. Try connecting via MongoDB Compass to test connection

### Problem 2: Port 8080 Already in Use

**Error:** "Port 8080 is already in use"

#### Solutions:

1. Change port in application.properties:
   * `server.port=8081`

2. Or stop the application using port 8080:
   * Windows: `netstat -ano | findstr :8080`
   * Kill process: `taskkill /PID <PID> /F`
   * Linux/Mac: `lsof -i :8080`
   * Kill: `kill -9 <PID>`

### Problem 3: Maven Dependencies Not Downloading

**Error:** "Cannot resolve dependencies"

#### Solutions:

1. Check internet connection
2. Delete .m2/repository folder and rebuild
3. Use Maven clean install with -U flag: `mvn clean install -U`
4. Check Maven settings.xml for proxy settings

### Problem 4: Swagger UI Not Loading

**Error:** "404 Not Found at /swagger-ui.html"

#### Solutions:

1. Verify Springdoc dependency in pom.xml
2. Check application.properties for correct swagger paths
3. Ensure Spring Boot Web starter is included
4. Try accessing: http://localhost:8080/swagger-ui/index.html

### Problem 5: Data Not Persisting

**Error:** "Data disappears after restart"

#### Solutions:

1. Check MongoDB is running persistently
2. Verify database name in application.properties
3. Use MongoDB Compass to verify data is saved
4. Check for exceptions in application logs

### Problem 6: Stock Not Updating

**Error:** "Product stock remains same after order"

#### Solutions:

1. Check OrderService implementation
2. Verify transaction is committed
3. Review logs for exceptions
4. Test with MongoDB queries directly

---

# CHAPTER 9: CONCLUSION AND FUTURE SCOPE

## Conclusion

The ShopSphere E-Commerce Application successfully demonstrates the implementation of a full-featured online shopping platform using modern Java technologies. This project has achieved all its primary objectives:

### 1. Technical Achievements:

* Successfully integrated Spring Boot with MongoDB for a robust backend
* Implemented RESTful API following industry best practices
* Created comprehensive API documentation using Swagger
* Developed both CLI and API interfaces for versatile access
* Established layered architecture for maintainability and scalability

### 2. Functional Achievements:

* Complete product catalog management system
* User registration and authentication
* Shopping cart with real-time calculations
* Order processing with automated stock management
* Payment status tracking

### 3. Learning Outcomes:

* Gained practical experience with Spring Boot framework
* Understood NoSQL database design and implementation
* Learned RESTful API design principles
* Mastered dependency injection and inversion of control
* Developed skills in error handling and validation

### 4. Business Value:

* The application provides a solid foundation for e-commerce operations
* Scalable architecture allows for future growth
* API-first design enables integration with frontend frameworks
* Modular structure facilitates easy maintenance and updates

## Lessons Learned

### 1. Technical Lessons:

* Spring Boot significantly reduces configuration overhead
* MongoDB's flexibility suits e-commerce data models well
* Proper exception handling is crucial for user experience
* API documentation is essential for collaboration
* Testing should be integrated throughout development

### 2. Design Lessons:

* Separation of concerns improves code maintainability
* Validation should occur at multiple layers
* User experience matters even in CLI applications
* Database schema should be designed for common queries
* Error messages should be clear and actionable

### 3. Process Lessons:

* Incremental development helps manage complexity
* Regular testing catches issues early
* Documentation should be maintained alongside code
* Version control is essential for project management

## Future Enhancements

### 1. Security Enhancements:

* Implement JWT-based authentication
* Add password encryption using BCrypt
* Implement role-based access control (Admin/User)
* Add HTTPS/SSL support
* Implement rate limiting for API endpoints
* Add CSRF protection

### 2. Functionality Enhancements:

* Product reviews and ratings system
* Wishlist functionality
* Product recommendations based on purchase history
* Advanced search with filters (price range, rating, etc.)
* Order tracking and status updates
* Email notifications for orders
* Multi-currency support
* Discount codes and promotions
* Inventory alerts for low stock

### 3. User Interface Enhancements:

* Develop React/Angular frontend
* Create mobile application (Android/iOS)
* Add product image upload and display
* Implement real-time chat support
* Add dashboard for analytics
* Create admin panel for management

### 4. Technical Enhancements:

* Implement caching with Redis
* Add pagination for large datasets
* Implement asynchronous processing for orders
* Add file upload for product images
* Implement full-text search with Elasticsearch
* Add API versioning
* Implement microservices architecture
* Add Docker containerization
* Implement CI/CD pipeline

### 5. Payment Enhancements:

* Integrate real payment gateways (Stripe, PayPal)
* Support multiple payment methods
* Add invoice generation
* Implement refund processing
* Add payment history

### 6. Analytics & Reporting:

* Sales reports and dashboards
* User behavior analytics
* Inventory reports
* Revenue tracking
* Popular products analysis
* Customer segmentation

### 7. Business Features:

* Multi-vendor support
* Shipping integration
* Tax calculation
* International shipping
* Return and refund management
* Customer support ticketing system

## Project Impact

This project has demonstrated:

* Practical application of Java and Spring Boot knowledge
* Understanding of e-commerce business logic
* Ability to design and implement complex systems
* Skills in API development and documentation
* Database design and management capabilities
* Problem-solving and debugging proficiency

The knowledge and experience gained from this project are directly applicable to:

* Enterprise application development
* Microservices architecture
* E-commerce platform development
* API design and implementation
* Full-stack development projects

## References

### 1. Documentation:

* **Spring Boot Official Documentation**  
  https://docs.spring.io/spring-boot/docs/current/reference/html/

* **Spring Data MongoDB Reference**  
  https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/

* **MongoDB Manual**  
  https://docs.mongodb.com/manual/

* **Springdoc OpenAPI Documentation**  
  https://springdoc.org/

* **Java 17 Documentation**  
  https://docs.oracle.com/en/java/javase/17/

### 2. Tutorials and Guides:

* **Baeldung - Spring Boot Tutorials**  
  https://www.baeldung.com/spring-boot

* **MongoDB University**  
  https://university.mongodb.com/

* **Spring Framework Guides**  
  https://spring.io/guides

### 3. Books:

* "Spring Boot in Action" by Craig Walls
* "MongoDB: The Definitive Guide" by Shannon Bradshaw
* "RESTful Web Services" by Leonard Richardson
* "Clean Code" by Robert C. Martin

### 4. Tools:

* IntelliJ IDEA - https://www.jetbrains.com/idea/
* MongoDB Compass - https://www.mongodb.com/products/compass
* Postman - https://www.postman.com/
* Maven - https://maven.apache.org/

---

# LIST OF FIGURES

| S.No | Figure Description | Page Reference |
|------|-------------------|----------------|
| 01. | Java Installation Steps | Chapter 1 |
| 02. | Java Version Checking | Chapter 1 |
| 03. | Variables and Data Types Example | Chapter 2 |
| 04. | User Input Example | Chapter 2 |
| 05. | Operators in Java | Chapter 2 |
| 06. | Conditional Statements | Chapter 2 |
| 07. | Loop Examples | Chapter 2 |
| 08. | Array Examples | Chapter 2 |
| 09. | String Handling | Chapter 2 |
| 10. | Methods Example | Chapter 2 |
| 11. | Exception Handling | Chapter 2 |
| 12. | Class and Object Example | Chapter 3 |
| 13. | Constructor Example | Chapter 3 |
| 14. | Inheritance Example | Chapter 3 |
| 15. | Polymorphism Example | Chapter 3 |
| 16. | Interface Example | Chapter 3 |
| 17. | Project Architecture Diagram | Chapter 4 |
| 18. | Database Schema Design | Chapter 5 |
| 19. | Spring Boot Project Structure | Chapter 5 |
| 20. | MVC Architecture Flow | Chapter 5 |
| 21. | Product Management Module | Chapter 6 |
| 22. | User Management Module | Chapter 6 |
| 23. | Shopping Cart Module | Chapter 6 |
| 24. | Order Processing Module | Chapter 6 |
| 25. | CLI Main Menu | Chapter 7 |
| 26. | Swagger UI Interface | Chapter 7 |
| 27. | Product API Endpoints | Chapter 7 |
| 28. | Cart API Endpoints | Chapter 7 |
| 29. | MongoDB Collections Structure | Chapter 7 |
| 30. | Sample Product Output | Chapter 8 |
| 31. | Sample Order Output | Chapter 8 |
| 32. | Order History View | Chapter 8 |
| 33. | MongoDB Compass View | Chapter 8 |
| 34. | Postman Testing Example | Chapter 8 |
| 35. | Error Handling Example | Chapter 8 |
| 36. | Application Startup Logs | Chapter 8 |

---

# APPENDIX A: COMPLETE API REFERENCE

Please refer to Swagger UI at http://localhost:8080/swagger-ui.html for:

* Complete API endpoint list
* Request/Response schemas
* Example payloads
* HTTP status codes
* Parameter descriptions

---

# APPENDIX B: DATABASE QUERIES

Common MongoDB queries for ShopSphere:

### 1. Find all products:

```javascript
db.products.find()
```

### 2. Find products by category:

```javascript
db.products.find({category: "Electronics"})
```

### 3. Search products by name:

```javascript
db.products.find({name: /wireless/i})
```

### 4. Find user by email:

```javascript
db.users.findOne({email: "user@example.com"})
```

### 5. Find user's cart:

```javascript
db.carts.findOne({userId: "U001"})
```

### 6. Find user's orders:

```javascript
db.orders.find({userId: "U001"}).sort({orderDate: -1})
```

### 7. Get order count:

```javascript
db.orders.countDocuments()
```

### 8. Update product stock:

```javascript
db.products.updateOne(
  {productId: "P001"},
  {$inc: {stock: -5}}
)
```

---

# APPENDIX C: ENVIRONMENT SETUP CHECKLIST

* ☐ Java JDK 17 installed
* ☐ JAVA_HOME environment variable set
* ☐ Maven installed and configured
* ☐ MongoDB installed and running
* ☐ MongoDB service started
* ☐ Project cloned/downloaded
* ☐ Dependencies downloaded (mvn clean install)
* ☐ application.properties configured
* ☐ MongoDB database created
* ☐ Port 8080 available
* ☐ IDE/Editor configured
* ☐ MongoDB Compass installed (optional)
* ☐ Postman installed (optional)

---

# END OF DOCUMENT

**Project:** ShopSphere - E-Commerce Application  
**Technology Stack:** Spring Boot 3.1.5, MongoDB, Java 17  
**Author:** Ramisetty Divyasree  
**Roll No:** 22781A3137  
**Date:** October 31, 2025

---
