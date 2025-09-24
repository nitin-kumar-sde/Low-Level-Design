package practise.snake_game.controller;

import practise.snake_game.board.GameBoard;
import practise.snake_game.model.Food;

/**
 * Web Layer for Managing Foods.
 */
public class FoodController {

    private GameBoard gameBoard;

    public FoodController(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public void addFood(int x, int y, int amount) {
        // adds food to a position.
        gameBoard.addFoodToCell(x, y, new Food(amount));
    }
}
