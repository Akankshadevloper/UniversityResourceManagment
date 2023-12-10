
public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("S001", "Akanksha Kumari");
        Student student2 = new Student("S002", "Preety");

       
        Teacher teacher1 = new Teacher("T001", "Professor Ravi ");

        
        Course mathCourse = new Course("MATH101", "Introduction to Mathematics", 2);
        Course javaCourse = new Course("CS101", "Java Programming", 3);

        
        mathCourse.enrollStudent(student1);
        mathCourse.enrollStudent(student2);
        javaCourse.enrollStudent(student1);
        javaCourse.enrollStudent(student2);

        mathCourse.addTeacher(teacher1);
        javaCourse.addTeacher(teacher1);

        
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();
        teacher1.displayTaughtCourses();

        
        mathCourse.conductExam();
        javaCourse.conductExam();

        mathCourse.generateReport();
        javaCourse.generateReport();
    }
}
