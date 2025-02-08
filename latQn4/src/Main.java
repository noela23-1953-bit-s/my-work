public class Main {
    public static void main(String[] args) {
        Student student = new Student("Albert Fred", "ISM778", 90.0);
        Course course = new Course(4.0, "Applied Object-Oriented Programming");
        Faculty faculty = new Faculty("BUSINESS STUDIES");
        Dean dean = new Dean("LAW");

        System.out.println("Student grades are : " + student.getGrades());

        System.out.println("Student ID is : " + student.studentID);
        course.enrollStudent(student);

        System.out.println("Student name is : " + student.studentName);

        dean.accessFacultyDetails();


    }

}
