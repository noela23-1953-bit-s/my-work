
public class Main {
    public static void main(String[] args) {
        Staff s1= new Staff(77003537);
        Staff s2 = new Staff(7654321);

        System.out.println("Staff 1 - staffID is: " + s1.getUniqueId() + ", TelNum is: " + s1.getTelNum());
        System.out.println("Staff 2 - staffID is: " + s2.getUniqueId() + ", TelNum is: " + s2.getTelNum());


    }
}