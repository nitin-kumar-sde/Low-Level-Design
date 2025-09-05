package practise.snake_ladder;

import practise.snake_ladder.moves.Ladder;
import practise.snake_ladder.moves.Move;
import practise.snake_ladder.moves.Snake;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Snake and Ladder!");
        List<Player> players = List.of(new Player("Nitin"),
                new Player("Nishant"));
        List<Move> moves = List.of(new Snake(14, 7),
                new Snake(31, 26),
                new Snake(38, 3),
                new Snake(84, 58),
                new Snake(59, 17),
                new Snake(67, 50),
                new Snake(91, 61),
                new Snake(99, 78),
                new Ladder(9, 34),
                new Ladder(40, 64),
                new Ladder(51, 67),
                new Ladder(63, 81),
                new Ladder(71, 91));
        GameManager gameManager = new GameManager(players, moves);
        gameManager.startGame();
    }
}
