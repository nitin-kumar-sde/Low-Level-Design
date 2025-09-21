package practise.movie_booking_system.lock;

import practise.movie_booking_system.model.Seat;
import practise.movie_booking_system.model.Show;
import practise.movie_booking_system.model.User;

import java.util.List;

public interface SeatLockProvider {

    // Acquire locks for given seats in a show for a user
    void lockSeats(Show show, List<Seat> seats, User user, int timeoutInSeconds);

    // Release previously held locks
    void unlockSeats(Show show, List<Seat> seats, User user);

    // Check if a seat is locked (useful during booking confirm flow)
    boolean isSeatLocked(Show show, Seat seat);

    // Verify if a lock belongs to a specific user (avoid double booking issue)
    boolean validateLock(Show show, Seat seat, User user);

    // provides list of locked seats for a show
    List<Seat> getLockedSeats(final Show show);
}
