# E-Commerce Backend (Spring Boot + MySQL)

This project is a backend system for an E-commerce application built using **Spring Boot** and **MySQL**.  
It provides APIs to manage users, products, cart, and orders.

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman (API Testing)

---

## Project Architecture

The project follows the standard Spring Boot architecture:

Controller → Service → Repository → Database

Modules included:

- User Management
- Product Management
- Cart System
- Order System

---

## API Endpoints

### User API
POST /api/users  
Create a new user

---

### Product API
POST /api/products  
Add a product

GET /api/products  
Get all products

---

### Cart API
POST /api/cart/add  
Add product to cart

GET /api/cart/user/{userId}  
Get cart items of a user

DELETE /api/cart/{cartId}  
Remove item from cart

---

### Order API
POST /api/order  
Place an order

GET /api/order/user/{userId}  
Get all orders of a user

---

## Example JSON Request

#### Add Product:
```json
{
 "name": "Laptop",
 "description": "Gaming Laptop",
 "price": 75000
}
```

#### Add to Cart:
```json
{
 "userId": 1,
 "productId": 2,
 "quantity": 1
}
```

#### Place Order:
```json
{
 "userId": 1,
 "productId": 2,
 "quantity": 1,
 "totalPrice": 20000
}
```
## Features

- User Registration
- Product Management
- Cart System
- Order System
- REST APIs
- MySQL Database Integration

## Author

Najima  
B.Tech CSE Student



