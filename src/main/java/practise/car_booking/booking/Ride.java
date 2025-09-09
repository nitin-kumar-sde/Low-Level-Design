package practise.car_booking.booking;


import practise.car_booking.actors.Driver;
import practise.car_booking.actors.Rider;
import practise.car_booking.vehicle.VehicleType;

import java.util.UUID;

public class Ride {

    private final UUID rideId;
    private final Rider rider;
    private Driver driver; // can be assigned later
    private final String source;
    private final String destination;
    private final VehicleType requestedVehicleType;
    private RideStatus status;
    public Ride(Rider rider, String source, String destination, VehicleType requestedVehicleType) {
        this.rideId = UUID.randomUUID();
        this.rider = rider;
        this.source = source;
        this.destination = destination;
        this.requestedVehicleType = requestedVehicleType;
        this.status = RideStatus.REQUESTED;
    }

    public UUID getRideId() {
        return rideId;
    }

    public Rider getRider() { return rider; }
    public Driver getDriver() { return driver; }
    public void assignDriver(Driver driver) { this.driver = driver; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public VehicleType getRequestedVehicleType() { return requestedVehicleType; }
    public RideStatus getStatus() { return status; }
    public void setStatus(RideStatus status) { this.status = status; }

}

