Spring Boot CRUD Operations - User Management

This is a Spring Boot project that performs CRUD (Create, Read, Update, Delete) operations for managing user details.
It is built using a layered architecture with POJO classes, repository interfaces, service classes, controller, and exception handling.

 📌 Features

- Add a new user
- Get all users or a specific user by ID
- Update user details
- Delete user by ID
- Exception handling for user not found

 🧾 Project Structure

src/main/java/com/springuser/
├── controller/
│ └── UserController.java
├── exceptions/
│ ├── payload/
│ │ └── ExceptionHandler.java
│ └── ResourceNotFoundException.java
├── models/
│ └── User.java
├── repo/
│ └── UserRepo.java
├── service/
│ └── UserService.java
└── SpringUserApplication.java


 ⚙️ Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Starter Project
- MySQL or H2 Database

 🔗 API Endpoints

| Method | Endpoint           | Description            |
|--------|--------------------|------------------------|
| POST   | `/api/users`       | Create a new user      |
| GET    | `/api/users`       | Get all users          |
| GET    | `/api/users/{id}`  | Get user by ID         |
| PUT    | `/api/users/{id}`  | Update user by ID      |
| DELETE | `/api/users/{id}`  | Delete user by ID      |

 ▶️ How to Run the Project

1. Clone the repository:

git clone https://github.com/GayathriBestha/SpringBootCRUDOperations.git
cd SpringBootCRUDOperations


2. Open the project in your preferred IDE (Eclipse/IntelliJ).

3. Configure the `application.properties` file for your database connection (MySQL/H2).

4. Run the project using:

5. Test the APIs using Postman or any REST client.
   

This project is a great example of building RESTful APIs using Spring Boot with a clear and modular architecture.

 📖 Project Overview

This Spring Boot project is designed to perform CRUD (Create, Read, Update, Delete) operations on user data through a RESTful API.

The application allows users to send data—either a single user or multiple users—in JSON format using **Postman**. This data is then saved into the database. The application uses the following HTTP methods to perform operations:

- POST – To insert single or multiple user records into the database.
- GET – To retrieve all users or a specific user by ID.
- PUT – To update an existing user’s information based on their ID.
- DELETE – To remove a user from the database by ID.

The application is built using a layered architecture that includes:
- POJO (Plain Old Java Object) class -> for data modeling.
- Repository interface -> for database interaction.
- Service class -> for business logic.
- Controller class -> to handle incoming HTTP requests.
- Exception handler -> for managing runtime errors like "User not found".

This structure ensures clean code organization, modular development, and ease of testing and maintenance.

👩‍💻 Author

Gayathri Bestha

---
