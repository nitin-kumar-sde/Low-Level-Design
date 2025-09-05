package practise.chess.pieces;

public class Cell {

    private final int rowNumber;
    private final int columnNumber;
    private Piece piece;

    public Cell(Piece piece, int columnNumber, int rowNumber) {
        this.piece = piece;
        this.columnNumber = columnNumber;
        this.rowNumber = rowNumber;
    }

    public Cell(int columnNumber, int rowNumber) {
        this.columnNumber = columnNumber;
        this.rowNumber = rowNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
