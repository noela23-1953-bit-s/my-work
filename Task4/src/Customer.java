
class Customer extends Bank {
    private String customerName;
    String Address

    // Constructor
    public Customer(String bankName,int bankCode, String bankBranch,String customerName) {
        super(bankName, bankCode,bankBranch); // Call parent class constructor
        this.customerName = customerName;
    }

    // Method to simulate customer activities
    public void shareCopies() {

        System.out.println(" Customer " + customerName + " is sharing his details to the Manager.");
    }

    // Met
    public void displayCustomerInfo() {
        System.out.println("The Customer's Name is: " + customerName);
        super.displayInfo();
    }
}

