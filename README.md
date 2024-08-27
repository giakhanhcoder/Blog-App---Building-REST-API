# Blog App - Building REST API

This is a simple Blog Application built using Java, Spring Boot, and JPA to demonstrate how to build a RESTful API.

## Features

- **User Authentication and Authorization using JWT**
- **CRUD operations for blog posts**
- **Role-based access control (Admin and User)**
- **Pagination and Sorting for blog posts**
- **Exception handling and error responses**
- **RESTful API design principles**

## Technologies Used

- **Java**: Core language for development.
- **Spring Boot**: Framework used for building the application.
- **Spring Security**: For managing authentication and authorization.
- **JWT (JSON Web Token)**: For securing API endpoints.
- **JPA/Hibernate**: For database operations.
- **MySQL**: Database used for persistence.
- **Maven**: For project management and dependency management.
- **Postman**: For API testing.

## Getting Started

### Prerequisites

- **Java 8 or higher**
- **Maven**
- **MySQL**
- **Postman** (optional, for testing the API)

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/giakhanhcoder/Blog-App---Building-REST-API.git
   cd Blog-App---Building-REST-API
### Configure the MySQL database:

- Open the `application.properties` file located in the `src/main/resources` directory.
- Update the following properties with your MySQL credentials:

  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/blog_db
  spring.datasource.username=your_username
  spring.datasource.password=your_password
  spring.jpa.hibernate.ddl-auto=update

### Build the project:

```bash
mvn clean install
Test the API using Postman:
Import the provided Postman collection (if available) or manually create requests to interact with the API.
API Endpoints
Here are some of the main endpoints provided by this API:

User Authentication:

POST /api/auth/signup - Register a new user.
POST /api/auth/signin - Login to receive a JWT token.
Blog Posts:

GET /api/posts - Get all blog posts (supports pagination and sorting).
GET /api/posts/{id} - Get a single blog post by ID.
POST /api/posts - Create a new blog post (requires authentication).
PUT /api/posts/{id} - Update a blog post by ID (requires authentication).
DELETE /api/posts/{id} - Delete a blog post by ID (requires authentication).
Testing
Unit tests and integration tests are included in the project.

To run tests, use the following command:

bash
mvn test
Deployment
The application can be deployed on any server that supports Java. Just package the application using Maven and deploy the generated WAR/JAR file.
Contributing
Contributions are welcome! Please fork this repository and submit a pull request for any enhancements or bug fixes.
License
This project is licensed under the MIT License - see the LICENSE file for details.
Contact



