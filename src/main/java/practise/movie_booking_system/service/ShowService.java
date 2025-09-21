package practise.movie_booking_system.service;

import practise.movie_booking_system.exception.ShowDoesNotFoundException;
import practise.movie_booking_system.model.Movie;
import practise.movie_booking_system.model.Screen;
import practise.movie_booking_system.model.Show;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Domain layer for CRUD on show.
 */

public class ShowService {

    private final Map<Integer, Show> shows;
    private final AtomicInteger showCounter;

    public ShowService() {
        this.shows = new HashMap<>();
        this.showCounter = new AtomicInteger(0);
    }

    public Show getShow(final int showId) {

        if (!shows.containsKey(showId)) {
            throw new ShowDoesNotFoundException("Show with ID " + showId + " not exist.");
        }
        return shows.get(showId);
    }
    public Show createShow(final Movie movie, final Screen screen,
                           final Instant startTime, final Integer durationInSeconds) {

        int showId = showCounter.incrementAndGet();
        // Create and store the new show
        final Show show = new Show(showId, movie, screen, startTime, startTime.plus(durationInSeconds
        , ChronoUnit.SECONDS));
        this.shows.put(showId, show);
        return show;
    }
    private List<Show> getShowsForAScreen(final Screen screen) {

        // we can also store shows in screen as well.
        final List<Show> showList = new ArrayList<>();
        for (Show show : shows.values()) {
            if (show.getScreen().getScreenId().equals(screen.getScreenId())) { // Compare by screen ID
                showList.add(show);
            }
        }
        return showList;
    }
}

