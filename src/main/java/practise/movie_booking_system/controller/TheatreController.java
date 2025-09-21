package practise.movie_booking_system.controller;

import practise.movie_booking_system.model.Screen;
import practise.movie_booking_system.model.Seat;
import practise.movie_booking_system.model.Theatre;
import practise.movie_booking_system.service.TheatreService;

/**
 * API layer for CRUD on Theatres.
 */
public class TheatreController {

    private final TheatreService theatreService;


    public TheatreController(final TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    public Theatre createTheatre(final String theatreName) {
        return theatreService.createTheatre(theatreName);
    }

    public Screen addScreenInTheatre(final String screenName,
                                     final int theatreId) {
        final Theatre theatre = theatreService.getTheatre(theatreId);

        return theatreService.addScreenInTheatre(screenName, theatre);
    }

    public Seat addSeatInScreen(final Integer rowNo, final int screenId) {
        final Screen screen = theatreService.getScreen(screenId);
        return theatreService.addSeatInScreen(rowNo, screen);
    }
}

