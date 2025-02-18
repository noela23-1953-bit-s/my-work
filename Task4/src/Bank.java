public class Bank {
    String bankName;
    String bankBranch;
    String bankLocation;

    public Bank(String bankName, int bankCode, String bankBranch) {
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.bankBranch = bankBranch;
    }

        public void shareCopies(){

        System.out.println("Employees can share copies");
        }
        public void displayInfo(){
            System.out.println("bankName:"+bankName+",bankCode:"+bankCode+",bankBranch:"+bankBranch);
        }
    }

