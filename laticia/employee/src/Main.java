
public class Main {
    public static void main(String[] args) {

        Customer cus = new Customer("Cash money", "NSSF Account", 700.0);


        System.out.println("The Customers name is : " + cus.get Name());
        System.out.println("The Accounts name is : " + cus.getAccountName());
        System.out.println("The Balance left is : UGX " + cus.getBalance());


        Customer.addFunds(cus, 300.0);
        Customer.attemptingDeduction(cus, 100.0);

        System.out.println("The Updated Balance is : UGX" + cus.getBalance());
    }
}
