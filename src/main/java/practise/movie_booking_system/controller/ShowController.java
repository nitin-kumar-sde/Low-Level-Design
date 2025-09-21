package practise.movie_booking_system.controller;

import practise.movie_booking_system.model.Movie;
import practise.movie_booking_system.model.Screen;
import practise.movie_booking_system.model.Show;
import practise.movie_booking_system.service.MovieService;
import practise.movie_booking_system.service.ShowService;
import practise.movie_booking_system.service.TheatreService;

import java.time.Instant;

public class ShowController {

    private final ShowService showService;
    private final TheatreService theatreService;
    private final MovieService movieService;


    public ShowController(ShowService showService,
                          TheatreService theatreService, MovieService movieService) {
        this.showService = showService;
        this.theatreService = theatreService;
        this.movieService = movieService;
    }
    public Show createShow(final int movieId, final int screenId, final Instant startTime,
                           final Integer durationInSeconds) {
        final Screen screen = theatreService.getScreen(screenId);
        final Movie movie = movieService.getMovie(movieId);
        return showService.createShow(movie, screen, startTime, durationInSeconds);
    }

    // remove and update should go here..l.
}
