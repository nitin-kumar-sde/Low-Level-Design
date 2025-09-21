package practise.movie_booking_system.model;


public class Movie {

    private final Integer movieId;
    private final String title;
    private final int durationMinutes;

    public Movie(Integer movieId, String title, int durationMinutes) {
        this.movieId = movieId;
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

}
