package ItemMangemnet_package;

import Item_package.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemMangement {
    private List<Item>items=new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void displayItems(){
        for(Item item:items){
            System.out.println("ItemName is " + item.getItemName() + "  Price is " + item.getPrice());

        }
    }
}
