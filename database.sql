-- Student Management System Database Schema
-- Run this in MySQL Workbench before running the Java project

CREATE DATABASE IF NOT EXISTS student_db;
USE student_db;

CREATE TABLE IF NOT EXISTS students (
    id      INT AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(100) NOT NULL,
    email   VARCHAR(100) NOT NULL UNIQUE,
    phone   VARCHAR(15),
    course  VARCHAR(100),
    cgpa    DECIMAL(3,1),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Sample data to test
INSERT INTO students (name, email, phone, course, cgpa) VALUES
('Swetha Devarajan',  'swetha@email.com',  '8754511209', 'B.E. Computer Science', 8.5),
('Priya Rajan',       'priya@email.com',   '9876543210', 'B.E. Computer Science', 7.8),
('Arjun Kumar',       'arjun@email.com',   '9123456789', 'B.Tech IT',             9.1);
