package practise.movie_booking_system.controller;

import practise.movie_booking_system.model.Booking;
import practise.movie_booking_system.model.Seat;
import practise.movie_booking_system.model.Show;
import practise.movie_booking_system.model.User;
import practise.movie_booking_system.service.BookingService;
import practise.movie_booking_system.service.ShowService;
import practise.movie_booking_system.service.TheatreService;

import java.util.ArrayList;
import java.util.List;

/**
 * API layer for creating, confirming on Booking.
 */

public class BookingController {

    private final ShowService showService;
    private final BookingService bookingService;
    private final TheatreService theatreService;

    public BookingController(final ShowService showService, final BookingService bookingService,
                             final TheatreService theatreService){
        this.showService = showService;
        this.bookingService = bookingService;
        this.theatreService = theatreService;
    }

    public Booking createBooking(final User user, final int showId, final List<Integer> seatsIds) {
        final Show show = showService.getShow(showId);

        final List<Seat> seats = new ArrayList<>();
        for (Integer seatsId : seatsIds) {
            Seat seat = theatreService.getSeat(seatsId);
            seats.add(seat);
        }
        return bookingService.createBooking(user, show, seats); // Create and return booking ID
    }

    // will expose methods for cancelling booking, updating and all...
}
