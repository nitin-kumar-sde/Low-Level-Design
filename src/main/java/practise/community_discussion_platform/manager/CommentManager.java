package practise.community_discussion_platform.manager;


import practise.community_discussion_platform.model.*;
import java.util.*;

public class CommentManager {
    private final Map<UUID, Comment> comments = new HashMap<>();


    public Comment addComment(final User user, final String content,
                              final Commentable parent) {
        final Comment comment = new Comment(user, content, parent);
        comments.put(comment.getId(), comment);
        parent.addComment(comment);
        return comment;
    }

    public void editComment(UUID commentId, User requestingUser, String newContent) {
        final Comment comment = comments.get(commentId);
        if (comment == null) {
            throw new IllegalArgumentException("Comment not found.");
        }
        if (!comment.getAuthor().equals(requestingUser)) {
            throw new IllegalArgumentException("Unauthorized edit.");
        }
        comment.edit(newContent);
    }

    public void deleteComment(UUID commentId, User requestingUser) {
        final Comment comment = comments.get(commentId);
        if (comment == null) {
            throw new IllegalArgumentException("Comment not found.");
        }
        if (!comment.getAuthor().equals(requestingUser)) {
            throw new IllegalArgumentException("Unauthorized delete.");
        }

        comments.remove(commentId);

        comment.getParent().getComments().remove(comment);

    }

    public Comment getComment(UUID commentId) {
        return comments.get(commentId);
    }

    public Collection<Comment> getAllComments() {
        return comments.values();
    }
}

