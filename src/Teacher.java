// Teacher.java
import java.util.ArrayList;

public class Teacher {
    private String teacherId;
    private String name;
    private ArrayList<Course> taughtCourses;

    // Constructor
    public Teacher(String teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
        this.taughtCourses = new ArrayList<>();
    }

    // Getter methods

    public String getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    // Other methods

    public void addCourse(Course course) {
        taughtCourses.add(course);
    }

    public void removeCourse(Course course) {
        taughtCourses.remove(course);
    }

    public void displayTaughtCourses() {
        System.out.println("Courses taught by " + name + " (" + teacherId + "):");
        for (Course course : taughtCourses) {
            System.out.println(course.getCourseCode() + " - " + course.getCourseName());
        }
    }
}
