package gradetracker;



import java.util.HashMap;
import java.util.Map;

public class StudentRecord {
    private Map<String, Student> studentMap;

    public StudentRecord() {
        studentMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        studentMap.put(student.getStudentID(), student);
    }

    public Student getStudent(String studentID) {
        return studentMap.get(studentID);
    }

    public void listStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            for (Student student : studentMap.values()) {
                System.out.println("ID: " + student.getStudentID() + ", Name: " + student.getFirstName() + " " + student.getSurName());
            }
        }
    }
}

