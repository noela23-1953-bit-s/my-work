public class Child extends FamilyMember{
    public Child(String name) {

        super(name);
    }

    @Override
    public void showAction() {

        System.out.println(name + " is playing with friends");
    }
}
