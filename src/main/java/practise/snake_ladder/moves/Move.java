package practise.snake_ladder.moves;

public abstract class Move {
    private final int start;

    private final int end;

    protected Move(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public abstract int getFinalCellNumber();
}
