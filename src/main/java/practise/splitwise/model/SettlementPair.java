package practise.splitwise.model;

public class SettlementPair {

    private final User user1;
    private final User user2;

    public SettlementPair(User user1, User user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }
}