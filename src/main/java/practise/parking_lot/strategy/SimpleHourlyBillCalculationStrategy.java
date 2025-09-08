package practise.parking_lot.strategy;


import practise.parking_lot.gates.Ticket;

import java.time.Duration;
import java.time.Instant;

public class SimpleHourlyBillCalculationStrategy implements BillCalculationStrategy {

    private final double hourlyRate;

    public SimpleHourlyBillCalculationStrategy(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateBill(Ticket ticket, Instant exitTime) {
        long hours = Math.max(1, Duration.between(ticket.getEntryTime(), exitTime).toHours());
        return hours * hourlyRate;
    }
}
