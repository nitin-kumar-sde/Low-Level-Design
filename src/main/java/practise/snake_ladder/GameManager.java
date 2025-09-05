package practise.snake_ladder;

import practise.snake_ladder.moves.Move;

import java.util.List;

public class GameManager {

    public static final int LAST_CELL = 100;
    private final List<Player> players;
    private final GameBoard gameBoard;
    private final Dice dice;

    public GameManager(List<Player> players, List<Move> moves) {
        this.players = players;
        this.gameBoard = new GameBoard(moves);
        this.dice = new Dice();
    }

    public void startGame() {

        boolean hasWinner = false;
        while(!hasWinner) {

            for(Player player : players) {
                int diceNumber = dice.roll();
                int currentCell = player.getCurrentPosition();
                Cell newCell = gameBoard.getCellAfterMove(currentCell, diceNumber);
                player.moveToDestination(newCell.getCellNumber());

                System.out.println(player.getName() + " rolled a " + diceNumber +
                        " and moved to cell " + newCell.getCellNumber());

                if(newCell.getCellNumber() == LAST_CELL) {
                    System.out.println(player.getName() + " has won the game!");
                    hasWinner = true;
                    break;
                }
            }
        }
    }


}
