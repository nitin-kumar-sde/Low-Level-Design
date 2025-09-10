package practise.community_discussion_platform.model.vote;


import java.util.List;

public interface Votable {
    List<Vote> getVotes();
    void addVote(Vote vote);
    void removeVote(Vote vote);
}