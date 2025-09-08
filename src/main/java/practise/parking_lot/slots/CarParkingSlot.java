package practise.parking_lot.slots;

import practise.parking_lot.vehicles.Car;
import practise.parking_lot.vehicles.Vehicle;

public class CarParkingSlot extends ParkingSlot {

    public CarParkingSlot(String id, SlotLocation location) {
        super(id, location);
    }

    public CarParkingSlot(String id) {
        super(id);
    }

    @Override
    public boolean canFit(Vehicle v) {
        return v instanceof Car;
    }
}
