public class Faculty {
    protected String facultyName;

    protected Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    protected void Welcome() {
        System.out.println("Welcome to the faculty of " + facultyName);
    }
}
