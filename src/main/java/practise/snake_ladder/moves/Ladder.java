package practise.snake_ladder.moves;

public class Ladder extends Move {

    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public int getFinalCellNumber() {
        return super.getEnd();
    }
}
