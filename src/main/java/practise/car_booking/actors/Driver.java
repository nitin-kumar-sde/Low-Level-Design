package practise.car_booking.actors;


import practise.car_booking.vehicle.Vehicle;

public class Driver extends User {

    private final Vehicle vehicle;
    private boolean available;

    public Driver(String id, String name, Vehicle vehicle) {
        super(id, name);
        this.vehicle = vehicle;
        this.available = true; // default available
    }

    public Vehicle getVehicle() { return vehicle; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return "Driver{id='" + getId() + "', name='" + getName() +
                "', vehicle=" + vehicle +
                ", available=" + available + "}";
    }
}
