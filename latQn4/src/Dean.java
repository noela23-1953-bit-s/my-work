public class Dean extends Faculty{
    public Dean(String facultyName) {
        super(facultyName);
    }

    public void accessFacultyDetails() {
        System.out.println("The Dean belongs to the faculty of : " + facultyName);
        Welcome();
    }
}
