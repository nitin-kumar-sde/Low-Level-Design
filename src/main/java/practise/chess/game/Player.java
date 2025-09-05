package practise.chess.game;

import practise.chess.pieces.Cell;
import practise.chess.pieces.Piece;

import java.util.Scanner;

public class Player {
    private final String name;
    private final COLOR color;
    private final GameBoard gameBoard;
    private int rating;

    public Player(String name, COLOR color, GameBoard gameBoard) {
        this.name = name;
        this.color = color;
        this.gameBoard = gameBoard;
        this.rating = 1000;
    }

    public void updateRatingWithDelta(final int delta) {
        this.rating = this.rating + delta;
    }
    public String getName() {
        return name;
    }

    public COLOR getColor() {
        return color;
    }

    public void makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", enter your move (e.g., e2 e4): ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length != 2) {
            System.out.println("Invalid input format. Please use 'e2 e4' format.");
            makeMove();
        }
        // perform validation of cell contains Piece of player's color
        final int sourceRowNumber = parts[0].charAt(0) - 'a' + 1;
        final int sourceColNumber = parts[0].charAt(1) - '0';

        final int destRowNumber = parts[1].charAt(0) - 'a' + 1;
        final int destColNumber = parts[1].charAt(1) - '0';

        final Cell source = gameBoard.getCell(sourceRowNumber, sourceColNumber);
        final Cell dest = gameBoard.getCell(destRowNumber, destColNumber);

        final Piece piece = source.getPiece();

        final Move move = new Move(this, source, dest, piece, gameBoard);
        if (!piece.isMoveValid(move, gameBoard)) {
            // error handling needs to be done for providing relevant message to user
            System.out.println("Invalid move. Try again.");
            makeMove();
        }
        move.execute();
    }
}
