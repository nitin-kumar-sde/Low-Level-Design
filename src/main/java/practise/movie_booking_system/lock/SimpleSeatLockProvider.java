package practise.movie_booking_system.lock;

import practise.movie_booking_system.model.Seat;
import practise.movie_booking_system.model.Show;
import practise.movie_booking_system.model.User;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Simple Seat Locking strategy which locks at show level and checks for seats one by one.
 */
public class SimpleSeatLockProvider implements SeatLockProvider {

    private int lockTimeoutSeconds;
    private final Map<Show, Map<Seat, SeatLock>> locks = new ConcurrentHashMap<>();

    public SimpleSeatLockProvider(int lockTimeoutSeconds) {
        this.lockTimeoutSeconds = lockTimeoutSeconds;
    }

    public void setLockTimeoutSeconds(int lockTimeoutSeconds) {
        this.lockTimeoutSeconds = lockTimeoutSeconds;
    }

    @Override
    public void lockSeats(Show show, List<Seat> seats, User user, int timeoutInSeconds) {

        Map<Seat, SeatLock> seatLocks = locks.computeIfAbsent(show, s -> new ConcurrentHashMap<>());

        synchronized (show) {
            // Check availability
            for (Seat seat : seats) {
                SeatLock existing = seatLocks.get(seat);
                if (existing != null && !existing.isLockExpired()) {
                    throw new RuntimeException("Seat " + seat.getSeatId() + " is already locked.");
                }
            }
            // Lock all seats
            final Instant now = Instant.now();
            final Instant ttl = Instant.now().plus(timeoutInSeconds,
                    ChronoUnit.SECONDS);

            seats.forEach(seat -> seatLocks.put(seat, new SeatLock(seat,
                    show, ttl, user)));
        }
    }

    @Override
    public void unlockSeats(final Show show, List<Seat> seats, User user) {

        Map<Seat, SeatLock> seatLocks = locks.get(show);
        if (seatLocks == null) return;

        synchronized (seatLocks) {
            seats.removeIf(seat -> {
                SeatLock lock = seatLocks.get(seat);
                if (lock != null && lock.getLockedBy().equals(user)) {
                    seatLocks.remove(seat);
                    return true;
                }
                return false;
            });
        }

    }


    @Override
    public boolean isSeatLocked(Show show, Seat seat) {
        Map<Seat, SeatLock> seatSeatLockMap = locks.get(show);
        if(seatSeatLockMap == null) return false;

        final SeatLock seatLock = seatSeatLockMap.get(seat);

        return seatLock != null && !seatLock.isLockExpired();
    }

    @Override
    public boolean validateLock(Show show, Seat seat, User user) {
        SeatLock lock = getLock(show, seat);
        return lock != null && !lock.isLockExpired() && lock.getLockedBy().equals(user);
    }

    private SeatLock getLock(Show show, Seat seat) {
        Map<Seat, SeatLock> seatLocks = locks.get(show);
        return (seatLocks == null) ? null : seatLocks.get(seat);
    }

    @Override
    public List<Seat> getLockedSeats(final Show show) {
        Map<Seat, SeatLock> seatLocks = locks.get(show);
        if (seatLocks == null) {
            return Collections.emptyList();
        }
        synchronized (seatLocks) {
            return seatLocks.entrySet()
                    .stream()
                    .filter(entry -> !entry.getValue().isLockExpired())
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
        }
    }
}
