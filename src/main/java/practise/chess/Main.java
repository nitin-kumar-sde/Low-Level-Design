package practise.chess;

import practise.chess.game.COLOR;
import practise.chess.game.GameBoard;
import practise.chess.game.GameManager;
import practise.chess.game.Player;
import practise.chess.rating.SimpleRatingUpdater;

public class Main {
    public static void main(String[] args) {
        final GameManager gameManager = new GameManager(new SimpleRatingUpdater());
        final GameBoard board = new GameBoard();
        final Player playerOne = new Player("Nitin", COLOR.WHITE, board);
        final Player playerTwo = new Player("Nishant", COLOR.BLACK, board);
        gameManager.launchGame(playerOne, playerTwo, board);

    }
}
