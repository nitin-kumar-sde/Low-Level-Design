package practise.movie_booking_system.model;

public class User {

    private final int userId;
    private final String name;

    public User(final int userId, final String name) {
        this.userId = userId;
        this.name = name;
    }

    // getters
    public int getUserId() { return userId; }
    public String getName() { return name; }
}
