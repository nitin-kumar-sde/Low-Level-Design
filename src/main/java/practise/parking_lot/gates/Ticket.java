package practise.parking_lot.gates;

import practise.parking_lot.slots.ParkingSlot;
import practise.parking_lot.vehicles.Vehicle;

import java.time.Instant;

public class Ticket {

    private final Vehicle vehicle;
    private final Instant entryTime;
    private final ParkingSlot parkingSlot;

    public Ticket(Vehicle vehicle, Instant entryTime,
                  ParkingSlot parkingSlot) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Instant getEntryTime() {
        return entryTime;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }
}
