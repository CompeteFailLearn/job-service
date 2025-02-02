# RESTful Web Service Application For a Job Application Platform

This project implements a RESTful web service application for a job application platform. The backend is powered by PostgreSQL, which provides robust and reliable database support. The endpoints are secured using Spring Security, which provides username and password authentication. Passwords are securely hashed using `BcryptPasswordEncoder` to ensure user data protection. Additionally, the project leverages Aspect-Oriented Programming (AOP) for logging, enabling efficient and centralized logging of application events and actions.

## Key Features

- **Spring Security**: Ensures secure access to endpoints through username and password authentication.
- **Password Encoding**: Utilizes `BcryptPasswordEncoder` for securely hashing user passwords.
- **AOP Logging**: Implements logging using AOP to maintain clean and modular code.
- **CRUD Operations**: Supports Create, Read, Update, and Delete functionalities.
- **Database**: The backend is powered by PostgreSQL, providing robust and reliable database support.
- **Spring MVC**: Employs Spring MVC to handle HTTP requests and responses.
- **Spring JPA**: Simplifies database interactions with Spring JPA.

This setup ensures that the application remains secure, maintainable, and easy to monitor.
