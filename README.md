# BCrypt Password Generator

A Spring Boot application that provides a secure way to generate BCrypt password hashes and verify passwords against existing hashes.

## Features

- Generate BCrypt password hashes with configurable strength
- Verify passwords against existing BCrypt hashes
- Web-based user interface
- RESTful API endpoints
- Built with Spring Security best practices

## Technologies Used

- Java 17
- Spring Boot 3.2.12
- Spring Security
- Thymeleaf
- Maven

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven 3.6+

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/deepeshprajapati055/BCrypt-Password-Generator.git
   ```

2. Navigate to the project directory:
   ```bash
   cd BCrypt-Password-Generator
   ```

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the application at `http://localhost:8080`

## Usage

1. **Generate Hash**: Enter a password in the input field and click "Generate Hash" to create a BCrypt hash
2. **Verify Password**: Enter a password and its hash to verify if they match

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## Author

Deepesh Prajapati

![Image](https://github.com/user-attachments/assets/2ea6ecdc-c451-4253-a230-82553785b293)
