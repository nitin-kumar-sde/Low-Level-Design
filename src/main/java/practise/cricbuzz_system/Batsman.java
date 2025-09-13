package practise.cricbuzz_system;

import java.util.ArrayList;
import java.util.List;

public class Batsman extends Player{

    private final List<BowlScore> bowsPlayed;

    public Batsman(String name, Team team) {
        super(name, team);
        this.bowsPlayed = new ArrayList<>();
    }

    @Override
    public String role() {
        return "BATSMAN";
    }

    public List<BowlScore> getBowsPlayed() {
        return bowsPlayed;
    }

    public void playBowl(BowlScore bowlScore) {
        this.bowsPlayed.add(bowlScore);
    }
}
