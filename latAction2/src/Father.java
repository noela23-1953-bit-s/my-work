public class Father extends FamilyMember {
    public Father(String name) {

        super(name);
    }

    @Override
    public void performAction() {

        System.out.println(name + " is the head of the family.");
    }
}
