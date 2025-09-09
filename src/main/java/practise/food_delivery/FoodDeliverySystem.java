package practise.food_delivery;

import practise.food_delivery.delivery.DeliveryStrategy;
import practise.food_delivery.model.Order;
import practise.food_delivery.restaurant.Restaurant;

import java.util.*;

// this can be made single ton
public class FoodDeliverySystem {

    private final List<Restaurant> restaurants;
    private final DeliveryStrategy deliveryStrategy;

    public FoodDeliverySystem(DeliveryStrategy initialStrategy, DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
        this.restaurants = new ArrayList<>();
    }

    // Register a restaurant into the ecosystem
    public void registerRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    // Get all restaurants - in prod code bases,
    // we will implemented filter pattern to search as per criteria.
    public List<Restaurant> getRestaurants() {
        return Collections.unmodifiableList(restaurants);
    }

    // Find restaurant by id
    public Optional<Restaurant> findRestaurantById(String restaurantId) {
        return restaurants.stream()
                .filter(r -> r.getId().equals(restaurantId))
                .findFirst();
    }

    // Place an order with a restaurant and deliver
    public Order placeOrderAndDeliver(String restaurantId, Order order) {
        Optional<Restaurant> restaurantOpt = findRestaurantById(restaurantId);

        if (restaurantOpt.isEmpty()) {
            System.out.println("❌ Restaurant not found: " + restaurantId);
            return null;
        }

        final Restaurant restaurant = restaurantOpt.get();
        boolean success = restaurant.placeOrder(order);

        if (!success) {
            System.out.println("❌ Order failed.");
            return order;
        }

        // Deliver using chosen strategy
        deliveryStrategy.deliver(order);

        return order;
        // notification can be implemented using Observer design pattern.
    }
}
