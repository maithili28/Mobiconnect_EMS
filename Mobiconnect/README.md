
# Employee Management System
This is a web-based application built using Spring Boot that allows an organization to manage its employee information. The application provides features such as adding, editing, and deleting employees, viewing employee details, and generating reports.



## Technologies Used 
Spring Boot 
Bootstrap 
PostgreSQL
Maven 
## Getting Started

Prerequisites
Java 8 or higher
MySQL 8.0.26 or higher
Maven 3.8.2 or higher

Installation

1. Clone the repository:
git clone https://github.com/your-username/employee-management-system.git

2. CREATE DATABASE emp_db;
CREATE DATABASE emp_db;

3. Configure the database connection in the application.properties file:
spring.datasource.url=jdbc:postresql://localhost:5432/emp_db
spring.datasource.username=root
spring.datasource.password=

4. Build and run the application:
mvn spring-boot:run

5. Access the application at http://localhost:8080.




## Dependencies Used

1. Spring Data JPA
2. Spring Boot
3. PostgreSQL
## API

*MANY TO ONE MAPPING*

For Clients-
>GET /client - Get all clients.
>GET /client/{id} - Get a specific client.
>POST /client - Create a new client.
>PUT /client/{clientId} - Update a client.
>DELETE /client/{clientId} - Delete a client.

For Projects-
>GET /projects recieve all projects.
>GET /projects/{id} recieve a specific project.
>POST /projects - Create a new project.
>PUT /projects/{projectId} - Update a project.
>DELETE /projects/{projectsId} - Delete a project.

JSON data-
{
    "id": 2,
    "name": "java",
    "owner_client": "amol jagtap",
    "owner_consultant": "vrushali patil",
    "start_date": "1-2-2010",
    "end_date": "1-3-2020",
    "status": "completed",
    "clientTable": {
        
        "id": 2,
        "name": "saloni",
        "location": "sangli",
        "start_date": "1-1-2010",
        "end_date": "10-1-2010"
    }
}


*MANY TO MANY MAPPING*

For Employees-
>GET /emp - Get all employees.
>GET /emp/{id} - Get a specific employee.
>POST /emp - Get a new employee.
>PUT /emp/{empId} - Update a employee.
>DELETE /emp/{empId} - Delete a employee.

JSON data-

{
    "id": 5,
    "name": "java",
    "owner_client": "avinash",
    "owner_consultant": "powar",
    "start_date": "1-2-2010",
    "end_date": "1-3-2020",
    "status": "completed",
   
    "employeeTable": [
        {
            "id": 3,
            "name": "amol",
            "email": "mmaithili28@gmail.com",
            "contact": "2345678908",
            "gender": "female",
            "dob": "28-06-2001",
            "designation": "intern",
            "address": "sangli",
            "work_location": "pune",
            "date_of_joining": "02-02-2010",
            "date_of_exit": "01-02-2025",
            "manager": "jagtap",
            "total_leaves": "4",
            "leave_balance": "3000"
        }
    ]
}



## Authors

*Maithili Mali @mmaithili15@gmail.com*