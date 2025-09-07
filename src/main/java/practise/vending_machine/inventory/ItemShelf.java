package practise.vending_machine.inventory;

import practise.vending_machine.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemShelf {

    private final List<Item> items;
    private final int code;

    public ItemShelf(int code) {
        this.code = code;
        this.items = new ArrayList<>();
    }

    public ItemShelf(int code, final List<Item> items) {
        this.code = code;
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }



    public Item dispatchItem() {
        Item item = items.getLast();
        items.removeLast();
        return item;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getItemCount() {
        return items.size();
    }
}
