public class Mother extends FamilyMember {
    public Mother(String role) {

        super(name);
    }
    @Override
    public void performAction() {

        System.out.println(name + " prepares  food and looks after after the family.");
    }
}
