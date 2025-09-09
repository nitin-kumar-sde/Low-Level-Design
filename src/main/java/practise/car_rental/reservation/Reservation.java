package practise.car_rental.reservation;

import practise.car_rental.vehicles.Vehicle;

import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {

    private final String reservationId;
    private final Vehicle vehicle;
    private final String customerId;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private ReservationStatus status;

    public Reservation(Vehicle vehicle, String customerId,
                       LocalDateTime startTime, LocalDateTime endTime) {
        this.reservationId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.customerId = customerId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = ReservationStatus.CREATED;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getCustomerId() {
        return customerId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
