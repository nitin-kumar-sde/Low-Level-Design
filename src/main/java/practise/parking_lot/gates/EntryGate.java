package practise.parking_lot.gates;

import practise.parking_lot.slots.ParkingSlot;
import practise.parking_lot.strategy.ParkingStrategy;
import practise.parking_lot.vehicles.Vehicle;

import java.time.Instant;

public class EntryGate {

    private final int id;
    private final ParkingStrategy parkingStrategy;

    public EntryGate(int id, ParkingStrategy strategy) {
        this.id = id;
        this.parkingStrategy = strategy;
    }

    public Ticket enter(final Vehicle vehicle) {

        ParkingSlot slot = parkingStrategy.findSlot(vehicle);
        if (slot == null) {
            throw new IllegalStateException("❌ No slot available for vehicle: " + vehicle.getId());
        }

        Ticket ticket = new Ticket(vehicle, Instant.now(), slot);
        slot.park(vehicle);
        System.out.println("✅ Vehicle " + vehicle.getId() + " parked at " + slot.getLocation());
        return ticket;
    }
}
