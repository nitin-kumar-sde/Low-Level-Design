package practise.food_delivery.restaurant;

public class FoodItem {

    private final String id;
    private final String name;
    private final FoodType type;
    private final double price;

    public FoodItem(final String id, final String name,
                    final FoodType type, final double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public FoodType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
