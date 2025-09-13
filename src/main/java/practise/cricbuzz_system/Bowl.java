package practise.cricbuzz_system;

public class Bowl {

    private final int over;
    private final Batsman batsman;
    private final Bowler bowler;
    private BowlScore bowlScore;

    public Bowl(int over, Batsman batsman, Bowler bowler) {
        this.over = over;
        this.batsman = batsman;
        this.bowler = bowler;
        this.bowlScore = BowlScore.NOT_DELIVERED;
    }

    public void setBowlScore(final BowlScore bowlScore) {
        this.bowlScore = bowlScore;
    }

    public int getOver() {
        return over;
    }

    public Batsman getBatsman() {
        return batsman;
    }

    public Bowler getBowler() {
        return bowler;
    }

    public BowlScore getBowlScore() {
        return bowlScore;
    }
}
