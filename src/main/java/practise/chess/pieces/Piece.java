package practise.chess.pieces;

import practise.chess.game.GameBoard;
import practise.chess.game.COLOR;
import practise.chess.game.Move;

public abstract class Piece {

    private COLOR color;
    private PieceStatus pieceStatus;

    public Piece(COLOR color) {
        this.color = color;
        this.pieceStatus = PieceStatus.NOT_KILLED;
    }

    public COLOR getColor() {
        return color;
    }

    public PieceStatus getPieceStatus() {
        return pieceStatus;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }

    public void setPieceStatus(PieceStatus pieceStatus) {
        this.pieceStatus = pieceStatus;
    }

    public abstract boolean isMoveValid(Move move, GameBoard gameBoard);
}
