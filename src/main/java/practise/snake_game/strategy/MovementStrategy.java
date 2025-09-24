package practise.snake_game.strategy;

import practise.snake_game.model.Cell;
import practise.snake_game.model.Direction;

public interface MovementStrategy {

    Cell getNextCell(Cell currentHead,
                     Direction direction);
}