package practise.parking_lot.slots;


public final class SlotLocation {

    private final int row;
    private final int column;

    public SlotLocation(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

}
