package practise.tic_tac_toe;

import practise.tic_tac_toe.game.GameBoard;
import practise.tic_tac_toe.game.Game;
import practise.tic_tac_toe.game.GameManager;
import practise.tic_tac_toe.game.Symbol;
import practise.tic_tac_toe.user.Player;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final GameBoard gameBoard = new GameBoard(3);
        final GameManager gameManager = new GameManager();
        final List<Player> players = List.of(
                new Player("Nitin", Symbol.CROSS, gameBoard),
                new Player("Nishant", Symbol.ZERO, gameBoard)
        );
        final Game game = new Game(players, gameBoard, gameManager);
        game.startGame();
        gameManager.displayAllGames();
    }
}
