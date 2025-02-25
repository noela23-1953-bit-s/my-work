abstract class FamilyMember {
    protected String name;

    protected FamilyMember(String name) {
        this.name = name;
    }
    public abstract void performAction();

    public void displayInfo() {
        System.out.println("The Family Member's Name is  " + name);
    }

    public void displayDetails(String relationship) {
        System.out.println(relationship + " - Family Member: " + name);
    }
}
