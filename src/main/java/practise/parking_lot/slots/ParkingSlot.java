package practise.parking_lot.slots;

import practise.parking_lot.vehicles.Vehicle;

public abstract class ParkingSlot {

    private final String id;
    private SlotLocation location;
    private Vehicle vehicle;

    protected ParkingSlot(String id, SlotLocation location) {

        this.id = id;
        this.location = location;
        this.vehicle = null;
    }

    protected ParkingSlot(String id) {

        this.id = id;
        this.vehicle = null;
    }

    public String getId() {
        return id;
    }

    public SlotLocation getLocation() {
        return location;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public abstract boolean canFit(Vehicle v);


    public boolean park(Vehicle v) {
        if (!isAvailable()) {
            return false;
        }
        if (!canFit(v)) {
            return false;
        }
        this.vehicle = v;
        return true;
    }

    public Vehicle unpark() {
        Vehicle removed = this.vehicle;
        this.vehicle = null;
        return removed;
    }

}

