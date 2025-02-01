
public class Customer {
    public String name;
    private String accountName;
    private double balance;

    public Customer(String name, String accountName, double balance) {
        this.name = name;
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountName() {
        return accountName;
    }

    public double get Balance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 10) {
            balance += amount;
            System.out.println("The Deposited amount is : UGX " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void deductAmount(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("The Deducted amount is : UGX " + amount);
        } else {
            System.out.println("The balance is not enough!");
        }
    }

    public static void addFunds(Customer user, double fundAmount) {
        user.deposit(fundAmount);
    }

    public static void attemptingDeduction(Customer user, double deductionAmount) {
        user.deductAmount(deductionAmount);
    }
}
