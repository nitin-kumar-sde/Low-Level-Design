package practise.snake_ladder;

import practise.snake_ladder.moves.Move;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    private final List<Cell> cells;

    public GameBoard(List<Move> moves) {
        cells = new ArrayList<>(101);
        for(int i=1; i<=100; i++) {
            cells.add(new Cell(i));
        }

        for(Move move : moves) {
            int start = move.getStart();
            cells.get(start).setMove(move);
        }
    }

    public Cell getCell(int cellNumber) {
        return cells.get(cellNumber);
    }

    public Cell getCellAfterMove(int currentCellNumber, int diceNumber) {
        int newCellNumber = currentCellNumber + diceNumber;

        if(newCellNumber > 100) {
            return cells.get(currentCellNumber);
        }
        final Cell cell = cells.get(newCellNumber);

        int destinationCellNumber = cell.getDestinationCellNumber();
        return cells.get(destinationCellNumber);
    }

}
