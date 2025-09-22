package com.school;

public class Student extends Person {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public String getCourse() { return course; }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student, Course: " + course);
    }
}
