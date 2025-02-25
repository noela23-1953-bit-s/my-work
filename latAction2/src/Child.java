public class Child extends FamilyMember{
    public Child(String name) {

        super(name);
    }

    @Override
    public void performAction() {

        System.out.println(name + " is playing with friends");
    }
}
