# Student Management System

A Java-based console application to manage student records using Core Java, JDBC, and MySQL.

## Features
- Add new student records
- View all students
- Search student by ID
- Update student details
- Delete student records
- Input validation (email format, CGPA range)

## Tech Stack
- **Language:** Java (OOP — Encapsulation, Inheritance, Abstraction)
- **Database:** MySQL
- **Connectivity:** JDBC (PreparedStatement, ResultSet)
- **Architecture:** Layered — Controller → Service → DAO → Database
- **Tools:** Eclipse IDE, MySQL Workbench, Git

## Project Structure
```
StudentManagementSystem/
├── src/main/java/com/student/
│   ├── controller/    → StudentController.java (main entry point)
│   ├── service/       → StudentService.java    (business logic + validation)
│   ├── dao/           → StudentDAO.java         (JDBC CRUD operations)
│   ├── model/         → Student.java            (data model)
│   └── util/          → DBConnection.java       (MySQL connection)
├── database.sql       → DB schema + sample data
└── README.md
```

## How to Run

### 1. Set up the database
Open MySQL Workbench and run `database.sql`

### 2. Update DB credentials
In `src/main/java/com/student/util/DBConnection.java`:
```java
private static final String USER = "root";
private static final String PASSWORD = "your_password";
```

### 3. Add MySQL Connector JAR
Download `mysql-connector-java.jar` and add it to your Eclipse project build path.

### 4. Run the project
Right-click `StudentController.java` → Run As → Java Application

## Author
**Swetha Devarajan** — Java Full Stack Developer Intern @ JSpiders, Bangalore
