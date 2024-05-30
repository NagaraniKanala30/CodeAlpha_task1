package gradetracker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeTracker {
    private static StudentRecord studentRecord = new StudentRecord();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter a command (add, list, details, exit): ");
            command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    addStudent(scanner);
                    break;
                case "list":
                    studentRecord.listStudents();
                    break;
                case "details":
                    printStudentDetails(scanner);
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command. Try again.");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.println("Enter Student ID: ");
        String studentID = scanner.nextLine().trim();
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("Enter Surname: ");
        String surName = scanner.nextLine().trim();
        System.out.println("Enter Class: ");
        String studentClass = scanner.nextLine().trim();

        Map<String, Integer> marks = new HashMap<>();
        System.out.println("Enter marks for Maths: ");
        marks.put("Maths", Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Enter marks for Biology: ");
        marks.put("Biology", Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Enter marks for Physics: ");
        marks.put("Physics", Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Enter marks for Chemistry: ");
        marks.put("Chemistry", Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Enter marks for I-Language: ");
        marks.put("I-Language", Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Enter marks for II-Language: ");
        marks.put("II-Language", Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Enter marks for III-Language: ");
        marks.put("III-Language", Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Enter marks for Computers: ");
        marks.put("Computers", Integer.parseInt(scanner.nextLine().trim()));

        Student student = new Student(studentID, firstName, surName, studentClass, marks);
        studentRecord.addStudent(student);
        System.out.println("Student " + firstName + " " + surName + " added.");
    }

    private static void printStudentDetails(Scanner scanner) {
        System.out.println("Enter Student ID: ");
        String studentID = scanner.nextLine().trim();

        Student student = studentRecord.getStudent(studentID);
        if (student != null) {
            System.out.println("Student ID: " + student.getStudentID());
            System.out.println("Name: " + student.getFirstName() + " " + student.getSurName());
            System.out.println("Class: " + student.getStudentClass());
            System.out.println("Marks: " + student.getMarks());
            System.out.println("Total Score: " + student.getTotalScore());
            System.out.println("Percentage: " + student.getPercentage());
            System.out.println("CGPA: " + student.getCGPA());
        } else {
            System.out.println("Student not found.");
        }
    }
}
