package practise.parking_lot;


import practise.parking_lot.gates.EntryGate;
import practise.parking_lot.gates.ExitGate;
import practise.parking_lot.gates.Ticket;
import practise.parking_lot.slots.CarParkingSlot;
import practise.parking_lot.slots.ParkingLot;
import practise.parking_lot.slots.ParkingSlot;
import practise.parking_lot.strategy.*;
import practise.parking_lot.vehicles.Car;
import practise.parking_lot.vehicles.Vehicle;

import java.util.concurrent.TimeUnit;

public class ParkingLotManager {

    public static void main(String[] args) throws InterruptedException {

        final ParkingLot lot = new ParkingLot("LOT-1");

        final ParkingSlot slot1 = new CarParkingSlot("S1");
        final ParkingSlot slot2 = new CarParkingSlot("S2");
        lot.addSlot(slot1);
        lot.addSlot(slot2);

        // Add gates
        final EntryGate entryGate = new EntryGate(1,
                new NearestAvailableSlotStrategy(lot));

        final ExitGate exitGate = new ExitGate(1,
                new SimpleHourlyBillCalculationStrategy(20.0),
                new CashPaymentStrategy());
        lot.addEntryGate(entryGate);
        lot.addExitGate(exitGate);

        System.out.println("🚗 Parking Lot Initialized: " + lot);

        Vehicle car = new Car("CAR-123");

        Ticket ticket = entryGate.enter(car);
        if (ticket == null) {
            System.out.println("❌ Could not park vehicle!");
            return;
        }

        System.out.println("✅ Vehicle parked with Ticket: " + ticket);

        // Step 4: Simulate stay
        TimeUnit.SECONDS.sleep(3);

        exitGate.exit(ticket);
    }
}
