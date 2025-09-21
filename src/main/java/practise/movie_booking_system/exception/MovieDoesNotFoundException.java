package practise.movie_booking_system.exception;

public class MovieDoesNotFoundException extends RuntimeException {

    public MovieDoesNotFoundException(String message) {
        super(message);
    }
}
