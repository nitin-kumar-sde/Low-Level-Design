package practise.car_booking.booking;


import practise.car_booking.actors.Driver;
import practise.car_booking.vehicle.VehicleType;

import java.util.List;

public class SimpleRideMatchingStrategy implements RideMatchingStrategy {

    private final List<Driver> driverPool;

    public SimpleRideMatchingStrategy(List<Driver> driverPool) {
        this.driverPool = driverPool;
    }

    @Override
    public Driver matchDriver(Ride ride) {
        VehicleType requestedType = ride.getRequestedVehicleType();

        for (Driver driver : driverPool) {
            if (driver.isAvailable()
                    && driver.getVehicle().getClass().getSimpleName().toUpperCase().equals(requestedType.name())) {
                return driver;
            }
        }
        return null;
    }
}

