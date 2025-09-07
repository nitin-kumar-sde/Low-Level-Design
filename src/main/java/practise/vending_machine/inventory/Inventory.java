package practise.vending_machine.inventory;

import practise.vending_machine.model.Item;

import java.util.HashMap;
import java.util.Map;

// This can be singleton for only one instance

public class Inventory {

    private final Map<Integer, ItemShelf> shelves;

    public Inventory(int numberOfShelves) {
        this.shelves = new HashMap<>();
        for (int i = 1; i <= numberOfShelves; i++) {
            shelves.put(i, new ItemShelf(i));
        }
    }

    public ItemShelf getShelf(int code) {
        return shelves.get(code);
    }

    public void addItemToShelf(int code, Item item, int qty) {
        ItemShelf shelf = shelves.get(code);
        if (shelf == null) {
            throw new IllegalArgumentException("Invalid shelf code: " + code);
        }
        shelf.addItem(item);
    }

    public void displayInventory() {

        System.out.println("=== Inventory ===");
        for (ItemShelf shelf : shelves.values()) {
            System.out.println(shelf);
        }
    }
}
