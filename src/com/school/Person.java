package com.school;

public class Person {
    private static int nextPersonId = 1;
    private int personId;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.personId = nextPersonId++;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getPersonId() { return personId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void displayDetails() {
        System.out.println("ID: P" + personId + ", Name: " + name + ", Age: " + age);
    }
}
