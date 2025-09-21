package practise.movie_booking_system.service;

import practise.movie_booking_system.exception.MovieDoesNotFoundException;
import practise.movie_booking_system.model.Movie;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Domain layer for CRUD in Movie.
 */
public class MovieService {

    private final Map<Integer, Movie> movies;

    private final AtomicInteger movieCounter;

    public MovieService() {
        this.movies = new HashMap<>();
        this.movieCounter = new AtomicInteger(1);
    }


    public Movie getMovie(final int movieId)  {
        if (!movies.containsKey(movieId)) {
            throw new MovieDoesNotFoundException("Movie with ID " + movieId + " not exist.");
        }
        return movies.get(movieId);
    }
    public Movie createMovie(final String movieName,
                             final int durationInMinutes) {

        int movieId = movieCounter.incrementAndGet();
        Movie movie = new Movie(movieId, movieName, durationInMinutes);
        movies.put(movieId, movie);
        return movie;
    }
    // remove and other relevant methods could be added here.
}
