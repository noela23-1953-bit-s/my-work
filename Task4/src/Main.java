//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bank b=new Bank("UBA",467,"KANSANGA");

        Manager m=new Manager("UBA",467,"KANSANGA","Leticia",4567);
        m.displayManagerInfo();
        m.shareCopies();

        Cashier k=new Cashier("UBA",467,"KANSANGA","Leticia",4567,"Norah");
        k.displayCashierInfo();

        Customer c=new Customer("UBA",467,"KANSANGA","jacques");
        c.displayCustomerInfo();
        c.shareCopies();
        }
    }
