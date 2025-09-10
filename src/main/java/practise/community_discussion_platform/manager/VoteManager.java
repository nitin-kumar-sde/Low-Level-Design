package practise.community_discussion_platform.manager;

import practise.community_discussion_platform.model.*;
import practise.community_discussion_platform.model.vote.Downvote;
import practise.community_discussion_platform.model.vote.Upvote;
import practise.community_discussion_platform.model.vote.Votable;
import practise.community_discussion_platform.model.vote.Vote;

import java.util.*;

public class VoteManager {

    public void addVote(Votable target, Vote vote) {

        target.addVote(vote);
    }

    public void removeVote(Vote vote, Votable target) {
        target.removeVote(vote);
    }

    public int getUpvoteCount(Votable target) {
        return (int) target.getVotes().stream()
                .filter(v -> v instanceof Upvote)
                .count();
    }

    public int getDownvoteCount(Votable target) {
        return (int) target.getVotes().stream()
                .filter(v -> v instanceof Downvote)
                .count();
    }
}
