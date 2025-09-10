package practise.community_discussion_platform.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class User {

    private final UUID userId;
    private String username;
    private final List<Post> posts;

    public User(final String username) {
        this.userId = UUID.randomUUID();
        this.username = username;
        this.posts = new ArrayList<>();
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Post> getPosts() {
        return Collections.unmodifiableList(posts);
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void removePost(Post post) {
        posts.remove(post);
    }

}
