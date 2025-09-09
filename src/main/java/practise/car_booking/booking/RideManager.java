package practise.car_booking.booking;


import practise.car_booking.actors.Driver;
import practise.car_booking.actors.Rider;
import practise.car_booking.vehicle.VehicleType;

import java.util.*;

public class RideManager {

    private final Map<UUID, Ride> rides;
    private final RideMatchingStrategy rideMatchingStrategy;

    public RideManager(RideMatchingStrategy rideMatchingStrategy) {
        this.rideMatchingStrategy = rideMatchingStrategy;
        this.rides = new HashMap<>();
    }

    public Ride createRide(final Rider rider, final String source,
                           final String destination, VehicleType vehicleType) {
        final Ride ride = new Ride(rider, source, destination, vehicleType);

        rides.put(ride.getRideId(), ride);

        System.out.println("✅ Ride created: " + ride.getRideId());
        return ride;
    }

    public void findDriver(final Ride ride) {
        Driver driver = rideMatchingStrategy.matchDriver(ride);
        if (driver == null) {
            System.out.println("❌ No driver available for ride " + ride.getRideId());
            return ;
        }

        driver.setAvailable(false);
        ride.assignDriver(driver);
        ride.setStatus(RideStatus.ASSIGNED);

        System.out.println("🚖 Driver " + driver.getName() + " assigned to ride " + ride.getRideId());
    }

    public void startRide(Ride ride) {
        if (ride.getStatus() == RideStatus.ASSIGNED) {
            ride.setStatus(RideStatus.IN_PROGRESS);
            System.out.println("▶️ Ride started: " + ride.getRideId());
        } else {
            System.out.println("⚠️ Cannot start ride in state: " + ride.getStatus());
        }
    }

    public void completeRide(Ride ride) {
        if (ride.getStatus() == RideStatus.IN_PROGRESS) {
            ride.setStatus(RideStatus.COMPLETED);
            ride.getDriver().setAvailable(true); // release driver
            System.out.println("✅ Ride completed: " + ride.getRideId());
        } else {
            System.out.println("⚠️ Cannot complete ride in state: " + ride.getStatus());
        }
    }

    public Ride getRide(UUID rideId) {
        return rides.get(rideId);
    }

    public List<Ride> getAllRides() {
        return new ArrayList<>(rides.values());
    }
}
