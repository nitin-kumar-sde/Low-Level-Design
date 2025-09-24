package practise.snake_game.game;

import practise.snake_game.board.GameBoard;
import practise.snake_game.model.Cell;
import practise.snake_game.model.GameStatus;
import practise.snake_game.model.Snake;
import practise.snake_game.observer.GameObserver;
import practise.snake_game.observer.GameSubject;
import practise.snake_game.strategy.MovementStrategy;

import java.util.ArrayList;
import java.util.List;

import static practise.snake_game.model.GameStatus.CREATED;

public class SnakeGame implements Game, GameSubject {

    private GameBoard board;
    private Snake snake;
    private int score;
    private MovementStrategy movementStrategy;
    private GameStatus gameStatus;
    private List<GameObserver> observers;

    public SnakeGame(GameBoard board, Snake snake,
                     MovementStrategy movementStrategy) {
        this.board = board;
        this.snake = snake;
        this.score = 0;
        this.movementStrategy = movementStrategy;
        this.gameStatus = CREATED;
        this.observers = new ArrayList<>();
    }

    @Override
    public void start() throws InterruptedException {

        this.gameStatus = GameStatus.RUNNING;
        while (gameStatus == GameStatus.RUNNING) {

            final Cell currentHead = this.snake.getHeadPosition();

            final Cell nextCell = movementStrategy.getNextCell(currentHead,
                    snake.getDirection());

            // check if snake id dead.
            if(snake.doesCollide(nextCell) ||
                    board.isBoundaryPosition(nextCell)) {

                gameStatus = GameStatus.ENDED;
                end();
                return;
            }
            // mimics movement of snake.
            Thread.sleep(3000);
            snake.move(nextCell);



            if(nextCell.getFood() == null) {
                score++;
            }
            else {
                this.score += (nextCell.getFood().getHealthAmount());
                nextCell.setFood(null);
            }
            notifyOnMovement();
        }
    }

    @Override
    public void end() {
        System.out.println("---- GAME ENDED-----");
        notifyOnGameEnd();
    }

    @Override
    public void addObserver(GameObserver gameObserver) {
        // add observer
        // have validations.
        this.observers.add(gameObserver);
    }

    @Override
    public void removeObserver(GameObserver gameObserver) {
        // remove observer
        // have validations.
        this.observers.remove(gameObserver);
    }

    @Override
    public void notifyOnGameEnd() {

        for(GameObserver observer : this.observers) {
            observer.onGameOver(score);
        }
    }

    @Override
    public void notifyOnMovement() {

        for(GameObserver observer : this.observers) {
            observer.onMoveMade(this.snake.getHeadPosition());
        }
    }
}
