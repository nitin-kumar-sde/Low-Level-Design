package practise.cricbuzz_system;

import java.util.UUID;

public class Match {
    private final UUID id;
    private final Team firstTeam;
    private final Team secondTeam;

    public Match(Team firstTeam, Team secondTeam) {
        this.id = UUID.randomUUID();
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    public UUID getId() {
        return id;
    }

    public Team getFirstTeam() {
        return firstTeam;
    }

    public Team getSecondTeam() {
        return secondTeam;
    }
}
