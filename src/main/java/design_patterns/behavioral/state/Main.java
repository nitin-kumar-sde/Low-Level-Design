package design_patterns.behavioral.state;

public class Main {

    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        while (!order.getStatus().equals("Delivered")) {
            System.out.println("Current State: " + order.getStatus());
            order.next();
        }

        System.out.println("Final State: " + order.getStatus());
        order.next(); // Calling next on Delivered state
    }
}
