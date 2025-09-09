package practise.food_delivery.restaurant;

public class FoodStock {

    private final FoodItem foodItem;
    private final int minThreshold;
    private int currentQuantity;

    public FoodStock(FoodItem foodItem, int minThreshold, int currentQuantity) {
        this.foodItem = foodItem;
        this.minThreshold = minThreshold;
        this.currentQuantity = currentQuantity;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public int getMinThreshold() {
        return minThreshold;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void incrementStock(int amount) {
        currentQuantity += amount;
    }

    public boolean decrementStock(int amount) {
        if (currentQuantity >= amount) {
            currentQuantity -= amount;
            return true;
        }
        return false;
    }

    public boolean isBelowThreshold() {
        return currentQuantity <= minThreshold;
    }
}

