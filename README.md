# 🛡️ User Authentication Microservice

The **User Auth Microservice** is designed to manage user authentication and authorization in a secure and scalable way using **Spring Boot** and **JWT (JSON Web Tokens)**. This microservice provides RESTful APIs for user registration, login, and access control based on roles.

## ✨ Features

- 🔐 User Registration

New users can sign up with basic details securely.

- 🔑 User Login

Authenticates user credentials and returns a signed JWT.

- 🧑‍💼 Role-Based Access Control

Grants/denies access to protected endpoints based on roles.

- 🔒 JWT Token Security

Stateless authentication using JWT for secure session handling.

- 📖 Swagger UI

API documentation is available via Swagger for easy testing.

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3.3.3
- Spring Security
- JJWT (Java JWT)
- MySQL (as relational database)
- Lombok (to reduce boilerplate)

## 📦 Getting Started

### ✅ Prerequisites

- Java 17
- Maven 3.9+
- MySQL running locally
- Postman (optional, for API testing)

### 🚀 Run Locally

**1. Clone the Repository**

```bash
git clone https://github.com/itanishkaa/User-Authentication-Microservice.git
cd userauth
```

**2. Configure Database**

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/auth_services
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
jwt.secret=your_jwt_secret_key
```

**3. Build and Run**

```bash
./mvnw spring-boot:run
```

**4. Access Swagger UI**

```bash
http://localhost:8080/swagger-ui/index.html
```

## 📌 API Endpoints

| Method | Endpoint            | Description             |
|--------|---------------------|-------------------------|
| POST    | `/api/auth/register`     | Register new user        |
| POST   | `/api/auth/login`     | Login and get JWT Token       |
| GET   | `/api/test/user`     | Access for authenticated users       |
| GET | `/api/test/admin`| Access for admin users |
