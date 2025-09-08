package practise.parking_lot.strategy;

import practise.parking_lot.slots.ParkingLot;

public abstract class BaseParkingStrategy implements ParkingStrategy {
    protected final ParkingLot lot;

    public BaseParkingStrategy(ParkingLot lot) {
        this.lot = lot;
    }
}

