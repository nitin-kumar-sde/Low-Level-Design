package practise.snake_game.model;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Snake {

    private final Deque<Cell> body;
    private Direction direction;
    private final Map<Cell, Boolean> bodyMap;

    public Snake() {

        this.body = new LinkedList<>();
        this.bodyMap = new HashMap<>();

        this.direction = Direction.RIGHT;

        Cell initialPosition = new Cell(1, 1);

        this.body.offerFirst(initialPosition);
        this.bodyMap.put(initialPosition, true);
    }

    public boolean doesCollide(Cell nextCell) {

        return bodyMap.containsKey(nextCell);
    }

    public void move(final Cell nextCell) {

        body.offerFirst(nextCell);
        bodyMap.put(nextCell, true);
        if(nextCell.getFood() == null) {
            Cell tail = body.pollLast();
            bodyMap.remove(tail);
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Cell getHeadPosition() {
      return this.body.peekFirst();
    }
}
