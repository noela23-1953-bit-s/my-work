package Item_package;

import java.util.List;

public class Item {
   String ItemName;


    public Item(String itemName, String price) {
        ItemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getPrice() {
        return price;
    }
}
