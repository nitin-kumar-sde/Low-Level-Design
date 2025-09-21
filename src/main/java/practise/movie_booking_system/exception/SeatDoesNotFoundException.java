package practise.movie_booking_system.exception;

public class SeatDoesNotFoundException extends RuntimeException {

    public SeatDoesNotFoundException(String message) {
        super(message);
    }
}
