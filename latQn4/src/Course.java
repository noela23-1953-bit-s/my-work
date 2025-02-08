public class Course {
    double credits;
    String courseName;

    Course(double credits, String courseName) {
        this.credits = credits;
        this.courseName = courseName;
    }


    void enrollStudent(Student student) {
        student.updateGrades(credits);
        System.out.println("Student enrolled in " + courseName + " with " + credits + " credits");
    }
}
