package practise.food_delivery.model;


import practise.food_delivery.restaurant.FoodItem;

import java.util.Map;
import java.util.UUID;

public class Order {

    private final String orderId;
    private final User user;
    private final String destination;
    private OrderStatus orderStatus;

    private final Map<FoodItem, Integer> orderItems;

    public Order(User user, String destination,
                 Map<FoodItem, Integer> orderItems) {
        this.orderId = UUID.randomUUID().toString();
        this.user = user;
        this.destination = destination;
        this.orderItems = orderItems;
        this.orderStatus = OrderStatus.PLACED;
    }

    public String getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public String getDestination() {
        return destination;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Map<FoodItem, Integer> getOrderItems() {
        return orderItems;
    }

    public void updateState(final OrderStatus newStatus) {
        this.orderStatus = newStatus;
    }
}
