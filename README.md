# Project Documentation

## Project Overview
This project is a REST API application built using Spring Boot. It includes controllers, DTOs, and tests for managing entities like employees and students.

## Project Structure
```
pom.xml
src/
	main/
		java/
			com/
				example/
					demo/
						DemoApplication.java
						EmployeeController.java
						StudentDTO.java
		resources/
			application.properties
	test/
		java/
			com/
				example/
					demo/
						DemoApplicationTests.java
target/
	demo-0.0.1-SNAPSHOT.jar
	demo-0.0.1-SNAPSHOT.jar.original
	classes/
		application.properties
		com/
			example/
				demo/
					DemoApplication.class
					EmployeeController.class
					StudentDTO.class
	generated-sources/
		annotations/
	generated-test-sources/
		test-annotations/
	maven-archiver/
		pom.properties
	maven-status/
		maven-compiler-plugin/
			compile/
				default-compile/
					createdFiles.lst
					inputFiles.lst
			testCompile/
				default-testCompile/
					createdFiles.lst
					inputFiles.lst
	surefire-reports/
		com.example.demo.DemoApplicationTests.txt
		TEST-com.example.demo.DemoApplicationTests.xml
	test-classes/
		com/
			example/
				demo/
					DemoApplicationTests.class
```

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