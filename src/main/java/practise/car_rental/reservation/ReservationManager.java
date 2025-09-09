package practise.car_rental.reservation;

import practise.car_rental.strategy.PaymentStrategy;
import practise.car_rental.strategy.PricingStrategy;
import practise.car_rental.vehicles.Vehicle;
import practise.car_rental.vehicles.VehicleStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReservationManager {

    private final List<Reservation> reservations;
    private final PricingStrategy pricingStrategy;
    private final PaymentStrategy paymentStrategy;

    public ReservationManager(PricingStrategy pricingStrategy, PaymentStrategy paymentStrategy) {
        this.reservations = new ArrayList<>();
        this.pricingStrategy = pricingStrategy;
        this.paymentStrategy = paymentStrategy;
    }

    public Reservation createReservation(String customerId, Vehicle vehicle,
                                         LocalDateTime start, LocalDateTime end) {
        if (!vehicle.isAvailable()) {
            throw new IllegalStateException("❌ Vehicle is not available for reservation!");
        }

        final Reservation reservation = new Reservation(vehicle, customerId, start, end);
        reservations.add(reservation);

        double amount = pricingStrategy.calculatePrice(reservation);

        paymentStrategy.pay(amount);

        // in real code base, we need to handle payment failure and change status
        // payment failure.
        vehicle.setVehicleStatus(VehicleStatus.RESERVED);
        System.out.println("✅ Reservation created: " + reservation);

        // can we extended to sent Notification on Reservation creation or failure
        // using observer design pattern
        return reservation;
    }

    public void cancelReservation(String reservationId) {

        Reservation reservation = getReservationById(reservationId);
        if (reservation == null) {
            throw new IllegalArgumentException("❌ Reservation not found: " + reservationId);
        }

        reservation.setStatus(ReservationStatus.CANCELLED);
        reservation.getVehicle().setVehicleStatus(VehicleStatus.AVAILABLE);
        System.out.println("🛑 Reservation cancelled: " + reservationId);
    }


    public Reservation getReservationById(String reservationId) {
        return reservations.stream()
                .filter(r -> r.getReservationId().equals(reservationId))
                .findFirst()
                .orElse(null);
    }

    public List<Reservation> getAllReservations() {
        return Collections.unmodifiableList(reservations);
    }
}
