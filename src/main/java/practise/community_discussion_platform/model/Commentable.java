package practise.community_discussion_platform.model;

import java.util.List;
import java.util.UUID;

public interface Commentable {
    UUID getId();
    User getAuthor();
    List<Comment> getComments();
    void addComment(Comment comment);
}
