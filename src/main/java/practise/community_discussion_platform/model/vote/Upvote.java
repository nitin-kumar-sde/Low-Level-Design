package practise.community_discussion_platform.model.vote;

import practise.community_discussion_platform.model.User;

public class Upvote extends Vote {
    public Upvote(User voter) {
        super(voter);
    }

    @Override
    public int getValue() {
        return 1;
    }
}
