package practise.snake_ladder;

public class Player {

    private final String  name;
    private int currentPosition;

    public Player(String name) {
        this.name = name;
        this.currentPosition = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void moveToDestination(int destination) {
        this.currentPosition = destination;
    }
}
