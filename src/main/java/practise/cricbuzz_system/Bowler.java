package practise.cricbuzz_system;

public class Bowler extends Player {

    public Bowler(String name, Team team) {
        super(name, team);
    }

    @Override
    public String role() {
        return "BOWLER";
    }
}
