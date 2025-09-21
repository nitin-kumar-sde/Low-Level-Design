package practise.movie_booking_system.exception;

public class TheatreDoesNotFoundException extends RuntimeException
{
    public TheatreDoesNotFoundException(String message) {
        super(message);
    }
}
