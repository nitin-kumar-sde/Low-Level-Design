package practise.tic_tac_toe.game;

import practise.tic_tac_toe.user.Player;

import java.util.List;

public class Game {

    private final List<Player> players;

    private final GameBoard gameBoard;
    private GameStatus gameStatus;
    private final GameManager gameManager;
    private Player winner;

    public Game(List<Player> players, GameBoard gameBoard, GameManager gameManager) {
        this.players = players;
        this.gameBoard = gameBoard;
        this.gameManager = gameManager;
        this.gameStatus = GameStatus.NOT_STARTED;
    }

    public void startGame() {
       gameStatus = GameStatus.STARTED;
       gameManager.addGame(this);
       while (gameStatus != GameStatus.NOT_STARTED) {
              for (Player player : players) {
                player.playNextMove();

                if (gameBoard.checkWinner(player.getSymbol())) {
                     System.out.println("Player " + player.getName() + " wins!");
                     gameManager.updateRatings(this);
                     gameStatus = GameStatus.FINISHED;
                     winner = player;
                     break;
                }
              }
       }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getWinner() {
        return winner;
    }


}
