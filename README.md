## Inventory Management System - RESTful API

A comprehensive, full-featured RESTful API designed to serve as the backend for a complete inventory management system. This API provides all the necessary endpoints to handle complex stock operations, from procurement to sales, while offering insights through a data-driven dashboard.

## Key Features

-   **Analytics Dashboard**
    
    -   Provides endpoints to supply data for a high-level overview of transactions, product quantity, and filtered data by month and year.
-   **Stock Transaction Management**
    
    -   Enables detailed tracking of every stock movement, including manual adjustments, inter-location transfers, initial stock entries, and returns.
-   **Product Management**
    
    -   Full CRUD (Create, Read, Update, Delete) operations for products, managing details such as SKU, name, description, pricing, and current stock levels.
-   **Category Management**
    
    -   Allows for the organization of products into hierarchical categories and sub-categories for better filtering, reporting, and management.
-   **Supplier Management**
    
    -   Maintain a complete database of suppliers, including their contact information and associated products.
-   **Purchase Order Management**
    
    -   Functionality to create, manage, and track purchase orders from suppliers to efficiently replenish inventory.
-   **Sales & Order Processing**
    
    -   Endpoints to handle sales transactions, which automatically update stock levels in real-time. Includes managing sales orders and customer information.
-   **User Profile Management**
    
    -   Allows registered users to view and manage their own profile information securely.


## Tech Stack

### Core Technologies
-   **Language**:  **Java 21**  ( Java OOP, Collections, and Leveraging modern features such as Lambda, Optional, etc.)
-   **Framework**:  **Spring Boot 3.x**
-   **Build Tool**:  **Apache Maven**

### Data Persistence
-   **Data Access**:  **Spring Data JPA**  for simplified repository layer implementation.
-   **Database**:  **MySQL**  as the relational database.
-   **ORM**:  **Hibernate**  as the underlying JPA provider.

### Security
-   **Framework**:  **Spring Security 6.x**  Implement comprehensive authorization logic, setting up roles and permissions to control access for different user types.
-   **Authentication**:  **JSON Web Tokens (JWT)**  for stateless, token-based authentication.

### Key Libraries & Features

-   **Code Efficiency**:  **Project Lombok**  to reduce boilerplate code (e.g., getters, setters, constructors, Slf4j).
-   **Validation**:  **Jakarta Bean Validation**  for server-side validation of request data.
-   **Dynamic Filtering with Specifications**: Use Spring Boot Specifications to build flexible, customizable filters, allowing users to search and sort items efficiently.

## How to install the project

    git clone https://github.com/Piyapat-Thongrueng/InventoryMS-Backend.git
    
## Database Setup
 - Open your Relational Database, such as MySQL Workbench or DBeaver.
 - Create a new database schema for this project.   
```
CREATE DATABASE inventory_db;
```

## Spring Boot project setup
