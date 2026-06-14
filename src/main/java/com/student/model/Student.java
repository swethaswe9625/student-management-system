package com.student.model;

public class Student {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String course;
    private double cgpa;

    public Student() {}

    public Student(int id, String name, String email, String phone, String course, double cgpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.course = course;
        this.cgpa = cgpa;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name=" + name + ", email=" + email +
               ", course=" + course + ", cgpa=" + cgpa + "}";
    }
}
