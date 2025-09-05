package practise.snake_ladder;

import practise.snake_ladder.moves.Move;

public class Cell {

    private final int cellNumber;

    private Move move;

    public Cell(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public Cell(int cellNumber, Move move) {
        this.cellNumber = cellNumber;
        this.move = move;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public int getDestinationCellNumber() {
        if (move != null) {
            return move.getFinalCellNumber();
        }
        return cellNumber;
    }
}
