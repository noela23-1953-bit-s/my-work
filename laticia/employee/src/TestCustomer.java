
public class TestCustomer {
    public static void main(String[] args) {

        Customer cus = new Customer("Cash Money", "NSSF Account", 1000.0);

        System.out.println("Customer's Name is: " + cus.getName());
        System.out.println("Account's Name is : " + cus.getAccountName());
        System.out.println("Balance remaining is: " + cus.getBalance());


        cus.deposit(2000.0);

        Customer.addFunds(cus, 500.0);

        Customer.attemptingDeduction(cus, 176.0);

    }
}

