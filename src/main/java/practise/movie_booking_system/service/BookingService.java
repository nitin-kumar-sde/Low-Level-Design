package practise.movie_booking_system.service;

import practise.movie_booking_system.lock.SeatLockProvider;
import practise.movie_booking_system.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class BookingService {

    private final Map<Integer, Booking> showBookings;


    private final SeatLockProvider seatLockProvider;
    // Atomic integer to generate unique booking IDs
    private final AtomicInteger bookingIdCounter = new AtomicInteger(1);

    public BookingService(SeatLockProvider seatLockProvider) {
        this.seatLockProvider = seatLockProvider;
        this.showBookings = new ConcurrentHashMap<>();
    }

    public Booking getBooking(final int bookingId) throws Exception  {
        if (!showBookings.containsKey(bookingId)) {
            throw new RuntimeException("No Booking exists for the ID : " + bookingId);
        }
        return showBookings.get(bookingId);
    }

    public List<Booking> getAllBookings(final Show show) {

        List<Booking> response = new ArrayList<>();
        for (Booking booking : showBookings.values()) {
            if (booking.getShow().equals(show)) response.add(booking);
        }
        return response;
    }

    public Booking createBooking(final User user, final Show show, final List<Seat> seats) {

        if (isAnySeatAlreadyUnderProcess(show, seats)) throw new IllegalStateException("Seat Already Booked");

        seatLockProvider.lockSeats(show, seats, user, 10000);

        final int bookingId = bookingIdCounter.getAndIncrement();
        final Booking newBooking = new Booking(bookingId, user, show, seats);
        showBookings.put(bookingId, newBooking);
        return newBooking;
    }

    // Gets the booked(confirmed seats for a show).
    public List<Seat> getBookedSeats(final Show show) {
        return getAllBookings(show).stream()
                .filter(booking -> booking.getStatus().equals(BookingStatus.CONFIRMED))      // Only confirmed bookings
                .map(Booking::getSeats)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    // confirms booking once payment is processed.
    public void confirmBooking(final Booking booking, final User user) {

        if (!booking.getUser().equals(user)) {
            // custom exception need to be thrown
            throw new RuntimeException("Can't confirm a booking made by different user...");
        }
        // Validate locks for each seat
        for (Seat seat : booking.getSeats()) {
            if (!seatLockProvider.validateLock(booking.getShow(), seat, user)) {
                throw new IllegalStateException("Booked Seat is either Invalid or has Expired");
            }
        }
        // Mark booking as confirmed
        booking.setStatus(BookingStatus.CONFIRMED);
    }

    private boolean isAnySeatAlreadyUnderProcess(final Show show, final List<Seat> seats) {
        final List<Seat> bookedSeats = getBookedSeats(show);
        for (Seat seat : seats) {
            if (bookedSeats.contains(seat)) return true;
        }
        return false;
    }
}