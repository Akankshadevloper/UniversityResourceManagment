// Student.java
import java.util.ArrayList;

public class Student {
    private String studentId;
    private String name;
    private ArrayList<Course> enrolledCourses;

    // Constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Getter methods

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // Other methods

    public void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void removeCourse(Course course) {
        enrolledCourses.remove(course);
    }

    public void displayEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + " (" + studentId + "):");
        for (Course course : enrolledCourses) {
            System.out.println(course.getCourseCode() + " - " + course.getCourseName());
        }
    }
}
