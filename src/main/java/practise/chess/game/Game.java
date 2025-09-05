package practise.chess.game;

public class Game {

    private final int gameId;
    private final Player blackPlayer;
    private final Player whitePlayer;
    private final GameBoard gameBoard;
    private GameStatus gameStatus;
    private Player turn;

    public Game(Player blackPlayer, Player whitePlayer,
                GameBoard gameBoard) {
        this.blackPlayer = blackPlayer;
        this.whitePlayer = whitePlayer;
        this.gameBoard = gameBoard;
        this.gameStatus = GameStatus.NOT_STARTED;
        this.turn = whitePlayer;
        this.gameId = (int) (Math.random() * 10000);
    }

    public Player getBlackPlayer() {
        return blackPlayer;
    }

    public Player getWhitePlayer() {
        return whitePlayer;
    }

    public GameBoard getBoard() {
        return gameBoard;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getTurn() {
        return turn;
    }

    public int getGameId() {
        return gameId;
    }

    public void startGame() {
        this.gameStatus = GameStatus.IN_PROGRESS;

        while (this.gameStatus == GameStatus.IN_PROGRESS) {

            System.out.println("Turn of " + turn.getName());
            turn.makeMove();

            turn = (turn == whitePlayer) ? blackPlayer : whitePlayer;

            // Check for checkmate or stalemate
            if (gameBoard.isCheckmate(turn)) {
                this.gameStatus = turn == whitePlayer ? GameStatus.WHITE_WIN :
                        GameStatus.BLACK_WIN;
                System.out.println("Checkmate! " + (turn == whitePlayer ? blackPlayer.getName() : whitePlayer.getName()) + " wins!");
            } else if (gameBoard.isStalemate(turn)) {
                this.gameStatus = GameStatus.STALEMATE;
                System.out.println("Stalemate! The game is a draw.");
            }
        }
    }
}
