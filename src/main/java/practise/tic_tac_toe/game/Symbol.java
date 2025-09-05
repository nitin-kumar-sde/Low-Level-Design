package practise.tic_tac_toe.game;

public enum Symbol {

    ZERO('0'),
    CROSS('X'),
    EMPTY(' ');

    private final Character character;

    Symbol(final Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

}
