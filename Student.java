import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String program;
    private String semester;
    private Map<String, Integer> courses; // Course name and marks

    // Constructor
    public Student(String name, String program, String semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new HashMap<>();
    }

    // Method to register courses and their marks
    public void registerCourse(String courseName, int marks) {
        courses.put(courseName, marks);
    }

    // Method to retrieve student's details
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered: " + courses.keySet());
    }

    // Method to retrieve courses with marks less than 40
    public void displayCoursesWithLowMarks() {
        System.out.println("Courses with marks less than 40 for " + name + ":");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() < 40) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " marks");
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        Student student = new Student("John Doe", "BSc Computer Science", "2nd Semester");
        student.registerCourse("Math", 35);
        student.registerCourse("Physics", 45);
        student.registerCourse("Chemistry", 38);
        
        // Display student details
        student.displayStudentInfo();
        
        // Display courses with marks less than 40
        student.displayCoursesWithLowMarks();
    }
}
