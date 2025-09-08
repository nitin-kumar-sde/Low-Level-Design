package practise.parking_lot.strategy;

import practise.parking_lot.slots.ParkingSlot;
import practise.parking_lot.vehicles.Vehicle;

public interface ParkingStrategy {

    ParkingSlot findSlot(Vehicle vehicle);
}

