package practise.community_discussion_platform.model.vote;

import practise.community_discussion_platform.model.User;

public class Downvote extends Vote {

    public Downvote(User voter) {
        super(voter);
    }

    @Override
    public int getValue() {
        return -1;
    }
}