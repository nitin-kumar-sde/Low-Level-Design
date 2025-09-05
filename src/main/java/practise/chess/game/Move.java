package practise.chess.game;

import practise.chess.pieces.Cell;
import practise.chess.pieces.Piece;

public class Move {

    private final Player player;
    private final Cell start;
    private final Cell end;
    private final Piece piece;
    private final GameBoard gameBoard;

    public Move(Player player, Cell start, Cell end,
                Piece piece, GameBoard gameBoard) {
        this.player = player;
        this.start = start;
        this.end = end;
        this.piece = piece;
        this.gameBoard = gameBoard;
    }

    public Player getPlayer() {
        return player;
    }

    public Cell getStart() {
        return start;
    }

    public Cell getEnd() {
        return end;
    }

    public Piece getPiece() {
        return piece;
    }

    public void execute() {
        // add logic for killing destination
        gameBoard.setCell(end.getRowNumber(), end.getColumnNumber(),
                piece);

        gameBoard.setCell(start.getRowNumber(), start.getColumnNumber(),
                null);
    }
}
