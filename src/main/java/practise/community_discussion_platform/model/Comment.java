package practise.community_discussion_platform.model;


import practise.community_discussion_platform.model.vote.Votable;
import practise.community_discussion_platform.model.vote.Vote;

import java.util.*;

public class Comment implements Commentable, Votable {

    private final UUID commentId;
    private final User author;
    private String content;
    private final Date createdAt;
    private final Commentable parent;
    private final List<Comment> replies;
    private final List<Vote> votes;

    public Comment(User author, String content, Commentable parent) {
        this.commentId = UUID.randomUUID();
        this.author = author;
        this.content = content;
        this.createdAt = new Date();
        this.parent = parent;
        this.replies = new ArrayList<>();
        this.votes = new ArrayList<>();
    }

    public UUID getId() { return commentId; }
    public User getAuthor() { return author; }
    public String getContent() { return content; }
    public Date getCreatedAt() { return createdAt; }
    public Commentable getParent() { return parent; }
    public List<Comment> getComments() { return replies; }

    public void addComment(Comment comment) {
        replies.add(comment);
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    @Override
    public List<Vote> getVotes() {
        return this.votes;
    }

    @Override
    public void addVote(Vote vote) {
        this.votes.add(vote);
    }

    @Override
    public void removeVote(Vote vote) {
        this.votes.remove(vote);
    }
}
