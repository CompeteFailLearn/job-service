# job-service

This project implements a RESTful API for a job application platform. The API endpoints are secured using Spring Security, which provides username and password authentication. Passwords are securely hashed using `BcryptPasswordEncoder` to ensure user data protection.

Additionally, the project leverages Aspect-Oriented Programming (AOP) for logging, enabling efficient and centralized logging of application events and actions.

### Key Features:
- **Spring Security**: Ensures secure access to API endpoints through username and password authentication.
- **Password Encoding**: Utilizes `BcryptPasswordEncoder` for securely hashing user passwords.
- **AOP Logging**: Implements logging using AOP to maintain clean and modular code.

This setup ensures that the API remains secure, maintainable, and easy to monitor.
