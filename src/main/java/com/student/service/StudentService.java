package com.student.service;

import com.student.dao.StudentDAO;
import com.student.model.Student;

import java.util.List;

public class StudentService {

    private StudentDAO studentDAO = new StudentDAO();

    public boolean addStudent(Student student) {
        if (student.getName() == null || student.getName().isEmpty()) {
            System.out.println("Validation failed: Name is required");
            return false;
        }
        if (student.getEmail() == null || !student.getEmail().contains("@")) {
            System.out.println("Validation failed: Invalid email");
            return false;
        }
        if (student.getCgpa() < 0 || student.getCgpa() > 10) {
            System.out.println("Validation failed: CGPA must be between 0 and 10");
            return false;
        }
        return studentDAO.addStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }

    public boolean updateStudent(Student student) {
        return studentDAO.updateStudent(student);
    }

    public boolean deleteStudent(int id) {
        return studentDAO.deleteStudent(id);
    }
}
