package practise.vending_machine.model;

public class Item {

    private final String id;

    private final double price;

    private final ItemType itemType;
    public Item(String id, double price, ItemType itemType) {
        this.id = id;
        this.price = price;
        this.itemType = itemType;
    }

    public ItemType getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", type=" + itemType +
                '}';
    }

    public double getPrice() {
        return price;
    }
}
