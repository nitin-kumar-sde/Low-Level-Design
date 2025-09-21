package practise.movie_booking_system.model;

import java.time.Instant;

public class Show {
    private final Integer showId;
    private final Movie movie;
    private final Screen screen;
    private final Instant startTime;
    private final Instant endTime;

    public Show(Integer showId, Movie movie, Screen screen, Instant startTime,
                Instant endTime) {
        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Integer getShowId() {
        return showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }
}
