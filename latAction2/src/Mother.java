public class Mother extends FamilyMember {
    public Mother(String name) {

        super(name);
    }
    @Override
    public void performAction() {

        System.out.println(name + " prepares  food and looks after after the family.");
    }
}
