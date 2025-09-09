package practise.food_delivery.restaurant;

public class FoodItemFactory {

    public FoodItem createFoodItem(final String id, final String name,
                                   final FoodType type, final double price) {
        return new FoodItem(id, name, type, price);
    }
}
