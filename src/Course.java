import java.util.ArrayList;

// Course.java
public class Course {
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private int currentEnrollment;
    private int[] examMarks;
    private ArrayList<Teacher> teachers;

    // Constructor
    public Course(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.currentEnrollment = 0;
        this.examMarks = new int[maxCapacity];
        this.teachers = new ArrayList<>();
    }

    // Getter methods

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentEnrollment() {
        return currentEnrollment;
    }

    // Other methods

    public boolean enrollStudent(Student student) {
        if (currentEnrollment < maxCapacity) {
            student.addCourse(this);
            currentEnrollment++;
            return true;
        } else {
            System.out.println("Course is full. Cannot enroll more students.");
            return false;
        }
    }

    public void deregisterStudent(Student student) {
        student.removeCourse(this);
        currentEnrollment--;
    }

    public void conductExam() {
        // Code to conduct exam and assign marks
        // (For simplicity, let's assume marks are randomly generated here)
        for (int i = 0; i < currentEnrollment; i++) {
            examMarks[i] = (int) (Math.random() * 100);
        }
    }

    public void generateReport() {
        System.out.println("Report for " + courseCode + " - " + courseName);
        for (int i = 0; i < currentEnrollment; i++) {
            System.out.println("Student " + (i + 1) + ": " + examMarks[i] + " marks");
        }
    }

    public void addTeacher(Teacher teacher1) {
        teachers.add(teacher1);
    }
}
