package practise.car_booking.payment;

import practise.car_booking.booking.Ride;

public class PaymentManager {

    private final PricingStrategy pricingStrategy;
    private final PaymentStrategy paymentStrategy;

    public PaymentManager(PricingStrategy pricingStrategy, PaymentStrategy paymentStrategy) {
        this.pricingStrategy = pricingStrategy;
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(Ride ride) {
        double fare = pricingStrategy.calculateFare(ride);
        System.out.println("💰 Fare for ride " + ride.getRideId() + " = Rs." + fare);
        paymentStrategy.pay(fare);
        // handle failure using try and catch
    }

}
