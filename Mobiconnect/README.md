
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
4. Lombok
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

*MANY TO ONE MAPPING*
For Leave Table
>GET /leave - Get all leaves.
>GET /leave/{id} - Get a specific leave.
>POST /leave - Get a new leave.
>PUT /leave/{leaveId} - Update a leave.
>DELETE /leave/{leaveId} - Delete a leave.

JSON data-
{
    "id": 1,
    "type": "sick",
    "start_date": "2-2-2010",
    "end_date": "3-2-2010",
    "day": "monday",
    "approver": "yes",
    "status": "completed",
    "employeeTable": {
        "id": 1,
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
        "total_leaves": "2",
        "leave_balance": "3000"
    }
}

*MANY TO ONE*
For TimeSheet Table
>GET /timesheet - Get all timesheet.
>GET /timesheet/{id} - Get a specific timesheet.
>POST /timesheet - Get a new timesheet.
>PUT /timesheet/{timesheetId} - Update a timesheet.
>DELETE /timesheet/{timesheetId} - Delete a timesheet.

JSON data-
{
    "id": 5,
    "start_date": "2-2-2010",
    "end_date": "3-2-2010",
    "total_hours": "3",
    "leave_hours": "2",
    "holiday_hours": "2",
    "approver": "yes",
    "status": "completed",
    "employeeTable": {
        "id": 4,
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
        "total_leaves": "2",
        "leave_balance": "3000"
    },
    "timesheetDayTable": {
        "id": 3,
        "day1": "monday",
        "day2": "tuesday",
        "day3": "wednsday",
        "day4": "thursday",
        "day5": "friday",
        "day6": "saturday",
        "day7": "sunday",
        "week": "2",
        "projectTable": {
            "id": 5,
            "name": "java",
            "owner_client": "avinash",
            "owner_consultant": "powar",
            "start_date": "1-2-2010",
            "end_date": "1-3-2020",
            "status": "completed",
            "clientTable": null,
            "employeeTable": null
        }
    }
}


*MANY TO ONE*
For TimeSheetDay table-
>GET /timesheetday - Get all timesheetday.
>GET /timesheetday/{id} - Get a specific timesheetday.
>POST /timesheetday - Get a new timesheetday.
>PUT /timesheetday/{timesheetdayId} - Update a timesheetday.
>DELETE /timesheetday/{timesheetdayId} - Delete a timesheetday.


## Authors

*Maithili Mali @mmaithili15@gmail.com*
