package practise.chess.pieces;

import practise.chess.game.GameBoard;
import practise.chess.game.COLOR;
import practise.chess.game.Move;

public class Knight extends Piece {

    public Knight(COLOR color) {
        super(color);
    }

    @Override
    public boolean isMoveValid(Move move, GameBoard gameBoard) {

        final Cell start = move.getStart();
        final Cell end = move.getEnd();

        if (end.getPiece().getColor() == this.getColor()) {
            return false;
        }

        int x = Math.abs(start.getRowNumber() - end.getRowNumber());
        int y = Math.abs(start.getColumnNumber() - end.getColumnNumber());
        // all the rules can be added... like check, checkmate, castling etc.
        return x * y == 2;
    }
}
