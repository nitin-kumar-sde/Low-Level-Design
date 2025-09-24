package practise.snake_game.board;

import practise.snake_game.model.Cell;
import practise.snake_game.model.Food;

public class GameBoard {

    private final int width;
    private final int height;
    private final Cell[][] cells;

    public GameBoard(int height, int width) {
        this.height = height;
        this.width = width;
        this.cells = new Cell[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public Cell getCell(int row, int col) {
        if (row < 0 || row >= height || col < 0 || col >= width) {
            return null;
        }
        return cells[row][col];
    }

    public void addFoodToCell(int x, int y, Food food) {
        Cell cell =  getCell(x, y);
        cell.setFood(food);
    }

    public Boolean isBoundaryPosition(Cell cell) {
        int x = cell.getX();
        int y = cell.getY();
        return x == 0 || x == width || y == 0 || y == height;
    }
}
