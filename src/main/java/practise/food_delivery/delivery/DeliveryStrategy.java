package practise.food_delivery.delivery;


import practise.food_delivery.model.Order;

public interface DeliveryStrategy {
    void deliver(Order order);
}