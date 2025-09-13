package practise.cricbuzz_system;

import java.util.UUID;

public abstract class Player {
    protected final UUID id;
    private String name;
    private Team team;

    protected Player(final String name, final Team team) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.team = team;
    }

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }
    public void setTeam(Team team) { this.team = team; }
    public abstract String role();
}
