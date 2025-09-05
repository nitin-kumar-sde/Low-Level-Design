package practise.chess.rating;

import practise.chess.game.Game;
import practise.chess.game.GameStatus;

public class SimpleRatingUpdater implements RatingUpdater {

    @Override
    public void updateRating(Game game) {
        // simple logic for updating the rating
        if(game.getGameStatus() == GameStatus.BLACK_WIN) {
            game.getBlackPlayer().updateRatingWithDelta(50);
            game.getWhitePlayer().updateRatingWithDelta(-25);

        }
        else if(game.getGameStatus() == GameStatus.WHITE_WIN) {
            game.getWhitePlayer().updateRatingWithDelta(50);
            game.getBlackPlayer().updateRatingWithDelta(-25);
        }
    }
}
