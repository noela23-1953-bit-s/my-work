public class department {
    private static String roles;
    private String roles;
    private int age;

    static {
        roles = "Managing director";
        System.out.println("Roles have been assigned accordingly to the Team members");
    }


    {

        System.out.println("Instance block executed: Age is  required");
    }


    public department(String staff,int age) {
        this.staff = staff;
        this.age=age;
    }

    public static String getRoles() {
        return roles;
    }

    public String getStaff() {
        return staff;
    }

    public int getage() {
        return age;
    }
    public void displayInfo(){
        System.out.println("The Roles of the person on duty is " + getRoles());
        System.out.println("The worker belongs to the staff of " + getStaff());
        System.out.println("The Age of the worker is " + getage());
    }
}
