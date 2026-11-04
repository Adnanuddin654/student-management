# Student Management System

A backend application developed using Java, Spring Boot, and MySQL to manage student records through RESTful APIs.

## Overview

The Student Management System provides REST API operations to create, retrieve, update, and delete student records. It also includes input validation and exception handling.

## Technologies Used

- **Programming Language:** Java
- **Backend Framework:** Spring Boot
- **Database:** MySQL
- **ORM:** Spring Data JPA
- **Build Tool:** Maven
- **API Testing:** Postman
- **Development Environment:** Visual Studio Code

## Features

- Create new student records
- Retrieve all student records
- Retrieve a student by ID
- Update existing student details
- Delete student records
- Validate input data
- Handle student-not-found exceptions
- Store student information in MySQL

## REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/students` | Create a student |
| GET | `/students` | Retrieve all students |
| GET | `/students/{id}` | Retrieve student by ID |
| PUT | `/students/{id}` | Update student details |
| DELETE | `/students/{id}` | Delete a student |

## Sample JSON Request

```json
{
  "name": "Adnan",
  "email": "adnan@gmail.com",
  "course": "Java Spring Boot",
  "age": 23
}
```

## Database Configuration

1. Install and start MySQL.
2. Create a database named `student_management`.
3. Create `src/main/resources/application.properties` locally.
4. Add your own database configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

**Note:** Do not upload your actual database username or password to GitHub.

## How to Run the Project

1. Clone this repository.
2. Open the project in Visual Studio Code.
3. Configure your MySQL database.
4. Update your local `application.properties`.
5. Run `StudentManagementApplication.java`.
6. Test the REST APIs using Postman.

## Project Status

Completed: Basic CRUD operations, database integration, input validation, and exception handling.

## Author

**Adnan Uddin**

GitHub: [Adnanuddin654](https://github.com/Adnanuddin654)