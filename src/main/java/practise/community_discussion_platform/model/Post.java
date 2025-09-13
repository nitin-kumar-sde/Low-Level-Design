package practise.community_discussion_platform.model;

import practise.community_discussion_platform.model.vote.Votable;
import practise.community_discussion_platform.model.vote.Vote;

import java.util.*;

public abstract class Post implements Commentable, Votable {
    private final UUID postId;
    private final User author;
    private  String content;
    private final Date createdAt;
    private final List<Comment> comments;
    private final List<Vote> votes;

    public Post(User author, String content) {
        this.postId = UUID.randomUUID();
        this.author = author;
        this.content = content;
        this.createdAt = new Date();
        this.comments = new ArrayList<>();
        this.votes = new ArrayList<>();
    }
    public UUID getPostId() {
        return postId;
    }

    public UUID getId() { return postId; }

    public User getAuthor() { return author; }
    public String getContent() { return content; }
    public Date getCreatedAt() { return createdAt; }
    public List<Comment> getComments() { return comments; }
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void setContent(String content) {
        this.content = content;
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

    public abstract String getPostType();
}

