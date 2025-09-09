package practise.food_delivery.delivery;

import practise.food_delivery.model.Order;
import practise.food_delivery.model.OrderStatus;

public class InHouseDelivery implements DeliveryStrategy {

    @Override
    public void deliver(Order order) {
        System.out.println("🚴 Delivering order " + order.getOrderId() + " using in-house delivery team.");
        order.updateState(OrderStatus.OUT_FOR_DELIVERY);
    }
}