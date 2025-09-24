package practise.snake_game;

import practise.snake_game.board.GameBoard;
import practise.snake_game.controller.FoodController;
import practise.snake_game.controller.GameController;
import practise.snake_game.game.SnakeGame;
import practise.snake_game.model.Snake;
import practise.snake_game.observer.SimpleGameObserver;
import practise.snake_game.strategy.HumanPlayerMovementStrategy;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GameController gameController = new GameController();
        GameBoard gameBoard = new GameBoard(5, 5);
        Snake snake = new Snake();
        SnakeGame game = new SnakeGame(gameBoard,
                snake, new HumanPlayerMovementStrategy());

        FoodController foodController = new FoodController(gameBoard);
        foodController.addFood(1, 2, 5);
        foodController.addFood(1, 4, 10);
        game.addObserver(new SimpleGameObserver());
        gameController.startGame(game);
    }
}
