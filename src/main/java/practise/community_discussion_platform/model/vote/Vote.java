package practise.community_discussion_platform.model.vote;

import practise.community_discussion_platform.model.User;

import java.util.UUID;

public abstract class Vote {

    private final UUID id;
    private final User voter;

    public Vote(User voter) {
        this.id = UUID.randomUUID();
        this.voter = voter;
    }

    public UUID getId() { return id; }
    public User getVoter() { return voter; }

    public abstract int getValue();
}

