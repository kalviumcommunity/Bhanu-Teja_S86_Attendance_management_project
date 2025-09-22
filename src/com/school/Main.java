package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Hierarchy ---");

        // Create objects
        Student s1 = new Student("Alice Wonderland", 20, "Computer Science");
        Teacher t1 = new Teacher("Mr. John Doe", 35, "Mathematics");
        Staff st1 = new Staff("Mrs. Jane Smith", 40, "Administration");

        // Display
        s1.displayDetails();
        System.out.println();
        t1.displayDetails();
        System.out.println();
        st1.displayDetails();

        System.out.println("\nSession 5: Person Hierarchy Established.");
    }
}
