package practise.chess.game;

import practise.chess.rating.RatingUpdater;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GameManager {

    private final RatingUpdater ratingUpdater;
    private final List<Game> games;

    public GameManager(RatingUpdater ratingUpdater) {
        this.ratingUpdater = ratingUpdater;
        this.games = new ArrayList<>();
    }

    public void launchGame(Player blackPlayer, Player whitePlayer,
                    GameBoard gameBoard) {

        final Game game = new Game(blackPlayer, whitePlayer, gameBoard);

        game.startGame();
        // update game stats after Game is finished.
        updateGameStats(game);
    }

    public void updateGameStats(Game game) {
        ratingUpdater.updateRating(game);
    }

    public List<Game> getGames() {
        return games;
    }

    public void displayAllGames() {
        for(Game game : games) {
            System.out.println("Game - " + game);
        }
    }

    public Optional<Game> getGameWithId(int id) {
        for(Game game : games ) {
            if(game.getGameId() == id)
                return Optional.of(game);
        }
        return Optional.empty();
    }
}
