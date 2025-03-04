import ItemMangemnet_package.ItemMangement;
import Item_package.Item;
import User_package.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user=new User("Mark","Jinja",12);
        Item item=new Item("Bread","1200");
        user.displayUserInformation();

        ItemMangement itemMangement=new ItemMangement();
        itemMangement.addItem(new Item("Rice","500"));
        itemMangement.addItem(new Item("Fish","5000"));
        itemMangement.displayItems();

    }
}