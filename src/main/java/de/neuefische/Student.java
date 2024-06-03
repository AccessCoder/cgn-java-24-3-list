package de.neuefische;

public class Student {

    /**
     *
     Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.

     Step 2: Create a Java List for elements of type "Student" and add multiple students.


     */

    private String firstName;
    private String lastName;
    private String studentId;

    public Student(String firstName, String lastName, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }

    public String getStudentId() {
        return studentId;
    }
}
