package practise.tic_tac_toe.game;

public class GameBoard {
    private final Cell[][] board;
    private final int size;

    public GameBoard(int size) {
        this.size = size;
        this.board = new Cell[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Cell(i, j, Symbol.EMPTY);
            }
        }
    }

    public boolean placeSymbol(int row, int col, Symbol symbol) {
        if (row < 0 || row >= size || col < 0 || col >= size ||
                board[row][col].getSymbol() != Symbol.EMPTY) {
            return false;
        }
        board[row][col].setSymbol(symbol);
        return true;
    }

    public boolean checkWinner(Symbol symbol) {
        // Check rows and columns
        for (int i = 0; i < size; i++) {
            if (checkRow(i, symbol) || checkColumn(i, symbol)) {
                return true;
            }
        }
        // Check diagonals
        return checkDiagonals(symbol);
    }

    private boolean checkRow(int row, Symbol symbol) {

        for (int col = 0; col < size; col++) {
            if (board[row][col].getSymbol() != symbol) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(int col, Symbol symbol) {
        for (int row = 0; row < size; row++) {
            if (board[row][col].getSymbol() != symbol) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonals(Symbol symbol) {
        boolean leftDiagonal = true, rightDiagonal = true;
        for (int i = 0; i < size; i++) {
            if (board[i][i].getSymbol() != symbol) {
                leftDiagonal = false;
            }
            if (board[i][size - 1 - i].getSymbol() != symbol) {
                rightDiagonal = false;
            }
        }
        return leftDiagonal || rightDiagonal;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j].getSymbol() == Symbol.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j].getSymbol() + " ");
            }
            System.out.println();
        }
    }


}
