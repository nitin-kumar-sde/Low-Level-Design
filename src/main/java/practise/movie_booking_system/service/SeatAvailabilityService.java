package practise.movie_booking_system.service;

import practise.movie_booking_system.lock.SeatLockProvider;
import practise.movie_booking_system.model.Seat;
import practise.movie_booking_system.model.Show;

import java.util.*;

/**
 * Domain layer for handling seat available requests.
 */
public class SeatAvailabilityService {

    private final BookingService bookingService;
    private final SeatLockProvider seatLockProvider;

    public SeatAvailabilityService(BookingService bookingService, SeatLockProvider seatLockProvider) {
        this.bookingService = Objects.requireNonNull(bookingService);
        this.seatLockProvider = Objects.requireNonNull(seatLockProvider);
    }

    // Returns all available seats for a given show.
    public List<Seat> getAvailableSeats(final Show show) {
        List<Seat> allSeats = show.getScreen().getSeats();

        // Use a HashSet for efficient lookup of unavailable seats
        Set<Seat> unavailable = new HashSet<>(bookingService.getBookedSeats(show));
        unavailable.addAll(seatLockProvider.getLockedSeats(show));

        // Filter seats that are not in unavailable set
        return allSeats.stream()
                .filter(seat -> !unavailable.contains(seat))
                .toList();
    }
}

