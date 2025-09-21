package practise.movie_booking_system.model;

public class Seat {

    private final Integer seatId;
    private final int row;
    private SeatStatus status;

    public Seat(Integer seatId, int row) {
        this.seatId = seatId;
        this.row = row;
        this.status = SeatStatus.AVAILABLE;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public int getRow() {
        return row;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public void updateStatus(SeatStatus newStatus) {
        this.status = newStatus;
    }

    public boolean isAvailable() {
        return this.status == SeatStatus.AVAILABLE;
    }
}
