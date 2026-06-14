package com.student.controller;

import com.student.model.Student;
import com.student.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentController {

    private static StudentService service = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Student Management System ===");

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewAllStudents(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine();

        Student student = new Student(0, name, email, phone, course, cgpa);
        boolean result = service.addStudent(student);
        System.out.println(result ? "Student added successfully!" : "Failed to add student.");
    }

    private static void viewAllStudents() {
        List<Student> students = service.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\n--- All Students ---");
            for (Student s : students) {
                System.out.println("ID: " + s.getId() + " | Name: " + s.getName() +
                    " | Course: " + s.getCourse() + " | CGPA: " + s.getCgpa());
            }
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Student s = service.getStudentById(id);
        if (s != null) {
            System.out.println("\nFound: " + s);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("New Name: ");
        String name = scanner.nextLine();
        System.out.print("New Email: ");
        String email = scanner.nextLine();
        System.out.print("New Phone: ");
        String phone = scanner.nextLine();
        System.out.print("New Course: ");
        String course = scanner.nextLine();
        System.out.print("New CGPA: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine();

        Student student = new Student(id, name, email, phone, course, cgpa);
        boolean result = service.updateStudent(student);
        System.out.println(result ? "Updated successfully!" : "Update failed.");
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        boolean result = service.deleteStudent(id);
        System.out.println(result ? "Deleted successfully!" : "Delete failed.");
    }
}
