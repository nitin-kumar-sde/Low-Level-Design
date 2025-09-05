package practise.chess.game;

import practise.chess.pieces.Cell;
import practise.chess.pieces.King;
import practise.chess.pieces.Knight;
import practise.chess.pieces.Piece;

public class GameBoard {
    private Cell[][] boxes;

    public GameBoard() {
        this.initialize();
    }

    public Cell getCell(int x, int y) {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new RuntimeException("Invalid board position");
        }

        return boxes[x][y];
    }

    public void initialize() {
        assert boxes != null;
        boxes = new Cell[8][8];
        boxes[0][4] = new Cell(new King(COLOR.BLACK),
                0, 4);

        boxes[7][1] = new Cell(new Knight(COLOR.WHITE),
                0, 4);
        // ... set the board

        // initialize remaining boxes without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                boxes[i][j] = new Cell(null, i, j);
            }
        }
    }

    public void setCell(int row, int col, Piece piece) {
        // sets the piece on a cell
        Cell cell  = boxes[row][col];
        cell.setPiece(piece);
    }

    public boolean isCheckmate(Player turn) {
        // checkmate logic
        return false;
    }

    public boolean isStalemate(Player turn) {
        // check stalemate logic
        return false;
    }
}