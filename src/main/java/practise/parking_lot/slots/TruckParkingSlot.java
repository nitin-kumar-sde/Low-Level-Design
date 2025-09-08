package practise.parking_lot.slots;

import practise.parking_lot.vehicles.Truck;
import practise.parking_lot.vehicles.Vehicle;

public class TruckParkingSlot extends ParkingSlot {

    public TruckParkingSlot(String id, SlotLocation location) {
        super(id, location);
    }

    @Override
    public boolean canFit(Vehicle v) {
        return v instanceof Truck;
    }
}

