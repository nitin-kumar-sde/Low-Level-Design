package practise.snake_game.model;

public class Cell {

    private final int x;
    private final int y;
    private Food food;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.food = null;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Food getFood() {
        return food;
    }
}
