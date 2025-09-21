package practise.movie_booking_system.controller;

import practise.movie_booking_system.model.Movie;
import practise.movie_booking_system.service.MovieService;

/**
 * API layer for CRUD on Movies.
 */
public class MovieController {

    private final MovieService movieService;

    public MovieController(final MovieService movieService) {
        this.movieService = movieService;
    }


    public Movie createMovie(final String movieName,
                             final int durationInMinutes) {
        return movieService.createMovie(movieName,
                durationInMinutes);
    }

    // other CRUD methods could be added here.
}