package practise.cricbuzz_system;

import java.util.List;
import java.util.UUID;

public class Team {

    private final UUID id;
    private final List<Player> players;

    public Team(List<Player> players) {
        this.id = UUID.randomUUID();
        this.players = players;

    }

    public UUID getId() {
        return id;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void playGame() {
        // kicks off the play game
    }
}
