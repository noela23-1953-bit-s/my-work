public class Student {
    private double grades;
    String studentID;
    protected String studentName;

    public Student(String studentName, String studentID, double initialGrades) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.grades = initialGrades;
    }

    public double getGrades() {
        return grades;
    }

    private void setGrades(double grades) {
        this.grades = grades;
    }

    protected void upgradeGrades(double amount) {
        setGrades(this.grades + amount);
    }
}
