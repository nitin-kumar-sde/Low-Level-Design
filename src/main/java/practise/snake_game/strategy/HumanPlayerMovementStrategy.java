package practise.snake_game.strategy;

import practise.snake_game.model.Cell;
import practise.snake_game.model.Direction;

public class HumanPlayerMovementStrategy implements MovementStrategy {

    @Override
    public Cell getNextCell(final Cell currentHead,
                            final Direction direction) {

        int row = currentHead.getX();
        int col = currentHead.getY();

        // ideally should input from console.
        // and then make movement also enforce current
        // and requested direction. i.e. both can't be reverse.

        return switch (direction) {

            case UP -> new Cell(row - 1, col);
            case DOWN -> new Cell(row + 1, col);
            case LEFT -> new Cell(row, col - 1);
            case RIGHT-> new Cell(row, col + 1);
        };
    }
}