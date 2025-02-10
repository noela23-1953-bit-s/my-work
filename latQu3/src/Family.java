public class Family {
    private String fname;
    private String behaviour;
    private String nationality;

    public Family(String fname, String behaviour, String nationality) {
        this.fname = fname;
        this.behaviour = behaviour;
        this.nationality = nationality;
    }

    public String get Fname() {
        return fname;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public String getNationality() {
        return nationality;
    }

    public String infor() {
        return "Family{" + "Fname='" + fname + '\'' + ", Behaviour='" + behaviour + '\'' + ", Nationality='" + nationality + '\'' + '}';
    }
    public String toString() {
        return infor();
    }
}
