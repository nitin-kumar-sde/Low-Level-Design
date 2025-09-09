package practise.car_booking.booking;

import practise.car_booking.actors.Driver;

public interface RideMatchingStrategy {

    Driver matchDriver(Ride ride);
}
