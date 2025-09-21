package practise.movie_booking_system.service;

import practise.movie_booking_system.exception.ScreenDoesNotFoundException;
import practise.movie_booking_system.exception.SeatDoesNotFoundException;
import practise.movie_booking_system.exception.TheatreDoesNotFoundException;
import practise.movie_booking_system.model.Screen;
import practise.movie_booking_system.model.Seat;
import practise.movie_booking_system.model.Theatre;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TheatreService {

    private final Map<Integer, Theatre> theatres;

    private final Map<Integer, Screen> screens;

    private final Map<Integer, Seat> seats;

    private final AtomicInteger theatreCounter;
    private final AtomicInteger screenCounter;
    private final AtomicInteger seatCounter;


    public TheatreService() {
        this.theatres = new HashMap<>();
        this.screens = new HashMap<>();
        this.seats = new HashMap<>();
        this.theatreCounter = new AtomicInteger(0);
        this.screenCounter = new AtomicInteger(0);
        this.seatCounter = new AtomicInteger(0);
    }

    public Seat getSeat(final int seatId) {

        if (!seats.containsKey(seatId)) {
            throw new SeatDoesNotFoundException("Seat with ID " + seatId + " not exist.");
        }
        return seats.get(seatId);
    }

    public Theatre getTheatre(final int theatreId){

        if (!theatres.containsKey(theatreId)) {
            throw new TheatreDoesNotFoundException("Theatre with ID " + theatreId + " not exist.");
        }
        return theatres.get(theatreId);
    }


    public Screen getScreen(final int screenId)  {
        if (!screens.containsKey(screenId)) {
            throw new ScreenDoesNotFoundException("Screen with ID " + screenId + " not exist.");
        }
        return screens.get(screenId);
    }

    public Theatre createTheatre(final String theatreName) {
        int theatreId = theatreCounter.incrementAndGet(); // Generate unique ID
        Theatre theatre = new Theatre(theatreId, theatreName);
        theatres.put(theatreId, theatre); // Store theatre in map
        return theatre;
    }

    // add new or existing screen in theatre
    public Screen addScreenInTheatre(final String screenName, final Theatre theatre) {
        Screen screen = createScreen(screenName, theatre);
        theatre.addScreen(screen);
        return screen;
    }

    public Seat addSeatInScreen(final Integer rowNo, final Screen screen) {
        int seatId = seatCounter.incrementAndGet(); // Generate unique seat ID
        Seat seat = new Seat(seatId, rowNo);
        seats.put(seatId, seat); // mimics DB storing.
        screen.addSeat(seat);
        return seat;
    }
    // Private helper to create a screen with unique ID and store it
    private Screen createScreen(final String screenName,
                                final Theatre theatre) {
        int screenId = screenCounter.incrementAndGet(); // Generate unique ID
        Screen screen = new Screen(screenId, screenName, theatre, 50);
        screens.put(screenId, screen); // mimics DB store - Repository layer.
        return screen;
    }
}
