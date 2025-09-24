package practise.snake_game.controller;

import practise.snake_game.game.Game;

/**
 * Web Layer for interacting with snake Game.
 */
public class GameController {

    public void startGame(Game game) throws InterruptedException {
        // starts game
        game.start();
    }
}
