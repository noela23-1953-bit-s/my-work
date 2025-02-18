public class Manager extends Bank{
    String managerName;
    int id;

    public Manager(String bankName, int bankCode, String bankBranch,String managerName, int id) {
        super(bankName,bankCode,bankBranch);
        this.managerName=managerName;
        this.id=id;
    }

    public void shareCopies(){

        System.out.println("Manager " + managerName + " is sharing customers copy.");
    }
    public void displayManagerInfo(){
       super.displayInfo();
        System.out.println("The Manager's name is:" +managerName+",Her ID is:" +id);
    }

    }

