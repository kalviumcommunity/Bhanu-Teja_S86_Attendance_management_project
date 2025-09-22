# Attendance Management Project

This is the initial setup for the Attendance Management System project.

## Structure
- src/com/school/Main.java: Contains the welcome message Java program.

## Part 1 & 2 - Core Domain Modeling

- **Student.java**: Basic Student class with `studentId` and `name` fields.  
- **Course.java**: Basic Course class with `courseId` and `courseName` fields.  
- **Main.java**: Created arrays of `Student` and `Course`, used `setDetails()` method to initialize objects.  
- Learned to organize code using packages (`com.school`) and arrays for object management.  

---

## Part 3 - Constructor Initialization & Auto-ID Generation

### Updates
- Replaced `setDetails()` methods with **constructors**:
  - `Student(String name)`
  - `Course(String courseName)`
- Added **automatic unique ID generation** using `static` counters:
  - Students: IDs start at **1** → displayed as `S1`, `S2`, …
  - Courses: IDs start at **101** → displayed as `C101`, `C102`, …
- Updated `Main.java` to create multiple instances of `Student` and `Course` using constructors and verify auto-ID generation.

## How to Run
```bash
javac src/com/school/Main.java
java -cp src com.school.Main