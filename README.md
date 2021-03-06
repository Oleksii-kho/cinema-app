# cinema-app
This is a simple movie theater web application, where certain endpoints are available to the user, depending on his role.
## Implementation details
### The structure of this project consists of 3 levels:
  * Data access layer (DAO). This layer is responsible for accessing the database. It is implemented with Hibernate API.
  * Application layer (service). This layer implements the main logic of the application.
  * Presentation layer (controllers). This layer is responsible for communication with a user. It is implemented with Spring API
    
### Technologies
  * Java 11
  * MySQL
  * Hibernate
  * Spring (Core, WEB, Security)
  * Apache Tomcat (to run app locally)
  * Maven Checkstyle Plugin

## Overview
### Endpoints that can be accessed by any logged-in user:
* GET: /cinema-halls
* GET: /movies
* GET: /movie-sessions/available

### The admin has access to such endpoints:
* POST: /cinema-halls
* POST: /movies
* POST: /movie-sessions
* PUT: /movie-sessions/{id}
* DELETE: /movie-sessions/{id}
* GET: /users/by-email

### The user has access to such endpoints:
* POST: /orders/complete
* PUT: /shopping-carts/movie-sessions
* GET: /orders
* GET: /shopping-carts/by-user

## SETUP
1. Install and configure Apache Tomcat
2. Install and configure and create a schema in MySQL
3. Fork and clone this project
4. In the /resources/db.properties file, replace the stubs with your database data
5. Run the application
6. After running the application you will be redirected to login page. You can use:
    * username `admin@email.ua` with password `PasswordAdmin` to login as admin
    * username `user@email.ua` with password `PasswordUser` to login as user
7. Use Postman for sending your requests during testing this application