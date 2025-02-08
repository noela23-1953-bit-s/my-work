public class Faculty {
    protected String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    protected void Welcome() {
        System.out.println("Welcome to the faculty of " + facultyName);
    }
}
