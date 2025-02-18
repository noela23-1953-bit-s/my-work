
public class Cashier extends Manager {
    String cashierName;

    public Cashier(String bankName, int bankCode, String bankBranch, String name, int id, String cashierName) {
        super(bankName, bankCode, bankBranch, name, id);
        this.cashierName = cashierName; 
    }

    public void displayCashierInfo() {
        System.out.println(" The Cashier's is Name: " + cashierName);
        super.displayManagerInfo();
    }
}