# Project Documentation

## Project Overview
This project is a REST API application built using Spring Boot. It includes controllers, DTOs, and tests for managing entities like employees and students.

## Key Files
- `DemoApplication.java`: Entry point of the application.
- `EmployeeController.java`: Handles API requests related to employees.
- `StudentDTO.java`: Data Transfer Object for student-related operations.
- `application.properties`: Configuration file for the application.
- `DemoApplicationTests.java`: Contains unit tests for the application.

## Build and Run
1. Build the project using Maven:
   ```
   mvn clean install
   ```
2. Run the application:
   ```
   java -jar target/demo-0.0.1-SNAPSHOT.jar
   ```

## Testing
Run the tests using Maven:
```
mvn test
```

## Reports
Test reports are generated in the `target/surefire-reports` directory.