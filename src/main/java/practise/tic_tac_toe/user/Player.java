package practise.tic_tac_toe.user;

import practise.tic_tac_toe.game.GameBoard;
import practise.tic_tac_toe.game.Symbol;

import java.util.Scanner;

public class Player {

    private final String name;
    private final Symbol symbol;
    private  int rating;
    private final GameBoard gameBoard;

    public Player(final String name, final Symbol symbol,
                  final GameBoard gameBoard) {
        this.name = name;
        this.symbol = symbol;
        rating = 1000;
        this.gameBoard = gameBoard;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void playNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + name + " turn.");
        gameBoard.displayBoard();
        System.out.print("Enter an row: ");
        int row = scanner.nextInt();
        System.out.print("Enter an col: ");
        int col = scanner.nextInt();
        // handle invalid input
         while (!gameBoard.placeSymbol(row, col, symbol)) {
             System.out.println("Invalid move. Try again.");
             System.out.print("Enter an row: ");
             row = scanner.nextInt();
             System.out.print("Enter an col: ");
             col = scanner.nextInt();
         }
    }
}
