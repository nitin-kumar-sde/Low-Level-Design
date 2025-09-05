package practise.snake_ladder.moves;

public class Snake extends Move {

    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public int getFinalCellNumber() {
        return super.getEnd();

    }
}
