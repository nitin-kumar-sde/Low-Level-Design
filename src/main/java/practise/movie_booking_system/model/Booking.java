package practise.movie_booking_system.model;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {

    private final int bookingId;
    private final User user;
    private final Show show;
    private final List<Seat> seats;
    private BookingStatus status;
    private final LocalDateTime bookingTime;

    public Booking(int bookingId, User user, Show show, List<Seat> seats) {
        this.bookingId = bookingId;
        this.user = user;
        this.show = show;
        this.seats = seats;
        this.status = BookingStatus.PENDING;
        this.bookingTime = LocalDateTime.now();
    }

    // getters & setters
    public int getBookingId() { return bookingId; }
    public User getUser() { return user; }
    public Show getShow() { return show; }
    public List<Seat> getSeats() { return seats; }
    public BookingStatus getStatus() { return status; }
    public void setStatus(BookingStatus status) { this.status = status; }
    public LocalDateTime getBookingTime() { return bookingTime; }

}
