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

## Part 4 - Data Encapsulation & Attendance Recording

### Updates
- Made fields in `Student` and `Course` **private** and added **getters**.
- Created `AttendanceRecord` class to store attendance for a student-course pair.
- Added **validation** for attendance status: only "Present" or "Absent" allowed (case-insensitive). Invalid status is automatically set to "Invalid" with a warning.
- Updated `Main.java` to:
  - Create `AttendanceRecord` objects
  - Test valid and invalid attendance statuses
  - Display all attendance records

## Part 5 – Students, Teaching & Non-Teaching Staff Hierarchy

### Updates
- Implemented **inheritance hierarchy**:
  - Base class: `Person` (common fields: `personId`, `name`, `age`)
  - Derived classes: `Student`, `Teacher`, `Staff`
- Added role-specific fields:
  - Student: `course`
  - Teacher: `subject`
  - Staff: `department`
- Updated `Main.java` to create objects of each type and display details.

## Part 6: Interface-Driven Persistence with Storage
- Defined a `Storable` interface with a `toDataString()` method.
- Modified `Student`, `Course`, and `AttendanceRecord` classes to implement the `Storable` interface and provide their specific `toDataString()` implementations (CSV format).
- Created a `FileStorageService` class with a `saveData(List<? extends Storable> items, String filename)` method to write `Storable` objects to a text file.
- Utilized `try-with-resources` for safe file handling (`PrintWriter`, `FileWriter`).
- Demonstrated in `Main.java` how to save lists of students, courses, and attendance records to separate files (`students.txt`, `courses.txt`, `attendance_log.txt`).
- Discussed the flexibility provided by interfaces for handling different types of storable objects uniformly.

## How to Run
```bash
javac -d out src/com/school/*.java
java -cp out com.school.Main