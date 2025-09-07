package practise.atm.model;

public class User {

    private final String userId;

    private Card card;

    public User(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
