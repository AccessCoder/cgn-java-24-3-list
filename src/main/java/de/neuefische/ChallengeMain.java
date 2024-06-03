package de.neuefische;

public class ChallengeMain {

    public static void main(String[] args) {
        Student student1 = new Student("Max", "Muster", "1");
        Student student2 = new Student("Maxi", "Muster", "2");
        Student student3 = new Student("Maxim", "Muster", "3");

        School school = new School();

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        System.out.println("Print Student with all 3 Students");
        school.printStudents();
        System.out.println("_____________________");
        System.out.println("Find Student with Id 2:");
        System.out.println(school.findStudent("2"));
        System.out.println("_____________________");
        System.out.println("Remove Student 2 and Print again");
        school.removeStudent("2");
        school.printStudents();
    }
}
