package com.school;

public class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() { return department; }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Staff, Department: " + department);
    }
}
