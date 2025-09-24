package practise.snake_game.observer;

public interface GameSubject {

    void addObserver(GameObserver gameObserver);
    void removeObserver(GameObserver gameObserver);
    void notifyOnGameEnd();
    void notifyOnMovement();
}
