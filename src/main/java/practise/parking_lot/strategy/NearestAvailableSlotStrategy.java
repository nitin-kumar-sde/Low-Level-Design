package practise.parking_lot.strategy;

import practise.parking_lot.slots.ParkingLot;
import practise.parking_lot.slots.ParkingSlot;
import practise.parking_lot.vehicles.Vehicle;

public class NearestAvailableSlotStrategy extends BaseParkingStrategy {

    public NearestAvailableSlotStrategy(ParkingLot lot) {
        super(lot);
    }

    @Override
    public ParkingSlot findSlot(Vehicle vehicle) {
        for (ParkingSlot slot : lot.getAvailableSlots()) {
            if (slot.canFit(vehicle)) {
                return slot;
            }
        }
        return null;
    }
}

