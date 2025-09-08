package practise.parking_lot.strategy;

import practise.parking_lot.gates.Ticket;

public interface BillCalculationStrategy {

    double calculateBill(Ticket ticket, java.time.Instant exitTime);
}
