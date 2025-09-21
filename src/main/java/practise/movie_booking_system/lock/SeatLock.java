package practise.movie_booking_system.lock;

import practise.movie_booking_system.model.Seat;
import practise.movie_booking_system.model.Show;
import practise.movie_booking_system.model.User;

import java.time.Instant;

public class SeatLock {

    private Seat seat;
    private Show show;
    private Instant ttl;
    private User lockedBy;

    public SeatLock(Seat seat, Show show, Instant ttl, User user) {
        this.seat = seat;
        this.show = show;
        this.ttl = ttl;
        this.lockedBy = user;
    }

    public boolean isLockExpired() {
        return ttl.isBefore(Instant.now());
    }


    public void setTTL(Instant ttl) {
        this.ttl = ttl;
    }

    public User getLockedBy() {
        return lockedBy;
    }

    public void setLockedBy(User lockedBy) {
        this.lockedBy = lockedBy;
    }
}
