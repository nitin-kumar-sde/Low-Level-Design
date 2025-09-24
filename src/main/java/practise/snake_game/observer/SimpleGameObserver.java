package practise.snake_game.observer;

import practise.snake_game.model.Cell;

public class SimpleGameObserver implements GameObserver {

    @Override
    public void onMoveMade(Cell headCell) {

        System.out.println("Snake moved to position: [" +
                headCell.getX() + ", " +
                headCell.getY() + "]");
    }


    @Override
    public void onGameOver(int finalScore) {
        System.out.println("Game Over! Score: " + finalScore);
    }
}

