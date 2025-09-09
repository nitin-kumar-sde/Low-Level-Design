package practise.car_booking.payment;


import practise.car_booking.booking.Ride;

public class SimplePricingStrategy implements PricingStrategy {
    private static final double BASE_FARE = 50.0;
    private static final double PER_KM_RATE = 10.0;

    @Override
    public double calculateFare(Ride ride) {

        double distance = 5.0;
        return BASE_FARE + (PER_KM_RATE * distance);
    }
}
