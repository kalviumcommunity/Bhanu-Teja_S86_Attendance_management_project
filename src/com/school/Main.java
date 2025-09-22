package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        // Students
        Student s1 = new Student("Alice Wonderland");
        Student s2 = new Student("Bob The Builder");

        // Courses
        Course c1 = new Course("Intro to Programming");
        Course c2 = new Course("Linear Algebra");

        // Display students and courses
        s1.displayDetails();
        s2.displayDetails();
        c1.displayDetails();
        c2.displayDetails();

        // Attendance Log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c1.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c2.getCourseId(), "present")); // case-insensitive
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c2.getCourseId(), "Late")); // invalid status

        System.out.println("\nAttendance Records:");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        System.out.println("\nSession 4: Data Encapsulation & Attendance Recording Complete.");
    }
}
