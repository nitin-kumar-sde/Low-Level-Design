package practise.food_delivery.restaurant;


import java.util.*;

public class Menu {

    private final Map<FoodType, List<FoodStock>> stockByType;

    public Menu() {
        this.stockByType = new HashMap<>();
        for (FoodType type : FoodType.values()) {
            stockByType.put(type, new ArrayList<>());
        }
    }

    public void addFoodStock(FoodStock stock) {
        stockByType.get(stock.getFoodItem().getType()).add(stock);
    }

    public List<FoodStock> getStockByType(FoodType type) {
        return Collections.unmodifiableList(stockByType.get(type));
    }

    public Optional<FoodStock> findStockByFoodId(String foodId) {
        return stockByType.values().stream()
                .flatMap(List::stream)
                .filter(stock -> stock.getFoodItem().getId().equals(foodId))
                .findFirst();
    }

    public List<FoodStock> getAllStock() {
        return stockByType.values().stream()
                .flatMap(List::stream)
                .toList();
    }

}
