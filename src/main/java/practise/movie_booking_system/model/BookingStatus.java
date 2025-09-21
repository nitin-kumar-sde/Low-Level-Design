package practise.movie_booking_system.model;

public enum BookingStatus {
    PENDING,     // seats are locked, awaiting payment
    CONFIRMED,   // booking completed successfully
    CANCELLED,   // cancelled by user/system
    FAILED       // payment failed, seats released
}
