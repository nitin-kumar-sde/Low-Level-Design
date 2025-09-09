package practise.car_booking.payment;

import practise.car_booking.booking.Ride;

public interface PricingStrategy {

    double calculateFare(Ride ride);
}
