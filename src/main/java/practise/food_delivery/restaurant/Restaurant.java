package practise.food_delivery.restaurant;

import practise.food_delivery.model.Order;
import practise.food_delivery.model.OrderStatus;

import java.util.Map;
import java.util.UUID;

public class Restaurant {

    private final String id;
    // in production, we will create new Location model
    private final String location;
    private final Menu menu;
    private final FoodItemFactory itemFactory;

    public Restaurant(final String location,
                      final FoodItemFactory itemFactory) {
        this.id = UUID.randomUUID().toString();
        this.location = location;
        // need to injected
        this.menu = new Menu();
        this.itemFactory = itemFactory;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    // can be auto triggered or admin trigger based on threshold or demand
    // Add a food item + stock into this restaurant’s inventory
    public void addFoodItem(String name, FoodType type, double price, int minThreshold, int currentQty) {
        FoodItem item = itemFactory.createFoodItem(UUID.randomUUID().toString(), name, type, price);
        FoodStock stock = new FoodStock(item, minThreshold, currentQty);
        menu.addFoodStock(stock);
    }

    public boolean placeOrder(Order order) {
        // Validate stock

        for (Map.Entry<FoodItem, Integer> entry : order.getOrderItems().entrySet()) {
            FoodItem item = entry.getKey();
            int qty = entry.getValue();

            var stockOpt = menu.findStockByFoodId(item.getId());
            if (stockOpt.isEmpty() || stockOpt.get().getCurrentQuantity() < qty) {
                System.out.println("❌ Order failed: insufficient stock for " + item.getName());
                order.updateState(OrderStatus.CANCELLED);
                return false;
            }
        }

        // Deduct stock
        for (Map.Entry<FoodItem, Integer> entry : order.getOrderItems().entrySet()) {
            FoodItem item = entry.getKey();
            int qty = entry.getValue();

            menu.findStockByFoodId(item.getId()).get().decrementStock(qty);
        }

        order.updateState(OrderStatus.CONFIRMED);
        System.out.println("✅ Order confirmed: " + order.getOrderId());
        return true;
    }

}

