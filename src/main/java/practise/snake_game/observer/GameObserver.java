package practise.snake_game.observer;

import practise.snake_game.model.Cell;

public interface GameObserver {

    void onMoveMade(final Cell headCell);
    void onGameOver(int finalScore);
}
