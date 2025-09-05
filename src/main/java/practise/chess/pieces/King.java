package practise.chess.pieces;

import practise.chess.game.GameBoard;
import practise.chess.game.COLOR;
import practise.chess.game.Move;


public class King extends Piece {

    public King(COLOR color) {
        super(color);
    }


    @Override
    public boolean isMoveValid(Move move, GameBoard gameBoard) {
        // check all the valid moves for a king
        Cell start = move.getStart();
        Cell end = move.getEnd();

        if (end.getPiece().getColor() == this.getColor()) {
            return false;
        }

        int x = Math.abs(start.getRowNumber() - end.getRowNumber());
        int y = Math.abs(start.getColumnNumber() - end.getColumnNumber());

        return x + y == 1;

        // all the rules can be added... like check, checkmate, castling etc.
    }

}