package practise.tic_tac_toe.game;

import practise.tic_tac_toe.user.Player;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    private final List<Game> games;

    public GameManager() {
        this.games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void displayAllGames() {
        for (Game game : games) {
            System.out.println("");
            System.out.println(game);
        }
    }

    public void updateRatings(Game game) {
        for (Player player : game.getPlayers()) {
            if (player == game.getWinner()) {
                player.setRating(player.getRating() + 10);
            } else {
                player.setRating(player.getRating() - 5);
            }
        }
    }
}
