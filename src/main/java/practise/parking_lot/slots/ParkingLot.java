package practise.parking_lot.slots;

import practise.parking_lot.gates.EntryGate;
import practise.parking_lot.gates.ExitGate;
import practise.parking_lot.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingLot {

    private final String lotId;
    private final List<ParkingSlot> slots;
    private final List<EntryGate> entryGates;
    private final List<ExitGate> exitGates;

    public ParkingLot(String lotId) {
        this.lotId = lotId;
        this.slots = new ArrayList<>();
        this.entryGates = new ArrayList<>();
        this.exitGates = new ArrayList<>();
    }

    public void addSlot(ParkingSlot slot) {
        slots.add(slot);
    }

    public void removeSlot(ParkingSlot slot) {
        slots.remove(slot);
    }

    public List<ParkingSlot> getAllSlots() {
        return Collections.unmodifiableList(slots);
    }

    public List<ParkingSlot> getAvailableSlots() {
        return slots.stream()
                .filter(ParkingSlot::isAvailable)
                .collect(Collectors.toList());
    }

    public boolean hasAvailableSlotFor(Vehicle vehicle) {
        return slots.stream().anyMatch(slot -> slot.isAvailable() &&
                slot.canFit(vehicle));
    }

    public void addEntryGate(EntryGate gate) {
        entryGates.add(gate);
    }

    public void addExitGate(ExitGate gate) {
        exitGates.add(gate);
    }

    public List<EntryGate> getEntryGates() {
        return Collections.unmodifiableList(entryGates);
    }

    public List<ExitGate> getExitGates() {
        return Collections.unmodifiableList(exitGates);
    }

    public String getLotId() {
        return lotId;
    }

}
