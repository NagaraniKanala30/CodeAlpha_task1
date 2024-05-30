package gradetracker;

import java.util.Map;

public class Student {
    private String studentID;
    private String firstName;
    private String surName;
    private String studentClass;
    private Map<String, Integer> marks;

    public Student(String studentID, String firstName, String surName, String studentClass, Map<String, Integer> marks) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.surName = surName;
        this.studentClass = studentClass;
        this.marks = marks;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public int getTotalScore() {
        int total = 0;
        for (int mark : marks.values()) {
            total += mark;
        }
        return total;
    }

    public double getPercentage() {
        return getTotalScore() / (double) marks.size();
    }

    public double getCGPA() {
        return getPercentage() / 10;
    }
}

