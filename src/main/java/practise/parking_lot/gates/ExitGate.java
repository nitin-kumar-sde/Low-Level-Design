package practise.parking_lot.gates;

import practise.parking_lot.slots.ParkingLot;
import practise.parking_lot.slots.ParkingSlot;
import practise.parking_lot.strategy.BillCalculationStrategy;
import practise.parking_lot.strategy.PaymentStrategy;

import java.time.Instant;

public class ExitGate {

    private final int id;
    private final BillCalculationStrategy billStrategy;
    private final PaymentStrategy paymentStrategy;

    public ExitGate(int id, BillCalculationStrategy billStrategy,
                    PaymentStrategy paymentStrategy) {
        this.id = id;
        this.billStrategy = billStrategy;
        this.paymentStrategy = paymentStrategy;
    }

    public void exit(Ticket ticket) {
        final Instant exitTime = Instant.now();

        double amount = billStrategy.calculateBill(ticket, exitTime);

        System.out.println("🧾 Bill generated: " + amount);

        if (paymentStrategy.pay(amount)) {
            final ParkingSlot slot = ticket.getParkingSlot();
            slot.unpark();
            System.out.println("🚗 Vehicle " + ticket.getVehicle().getId()
                    + " exited. Slot " + slot.getLocation() + " is now free.");
        } else {
            System.out.println("⚠️ Payment failed for vehicle: " + ticket.getVehicle().getId());
        }
    }
}
