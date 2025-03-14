package User_package;

public class User {
    String  name;
    String  Address;
   private String Amountpaid;

    public User(String name, String address, int age) {
        this.name = name;
        Address = address;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public int getAge() {
        return Age;
    }

    public void displayUserInformation(){
        
        System.out.println("Address is " + Address);
        System.out.println("Age is " + Age);
    }
}
