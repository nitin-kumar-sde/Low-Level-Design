package practise.community_discussion_platform.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Community {

    private final UUID communityId;
    private String name;
    private String description;
    private final User createdBy;
    private final List<User> members;
    private final List<CommunityPost> posts;

    public Community(String name, String description, User createdBy) {
        this.communityId = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.createdBy = createdBy;
        this.members = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.members.add(createdBy);
    }

    public UUID getCommunityId() {
        return communityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public List<User> getMembers() {
        return Collections.unmodifiableList(members);
    }

    public void addMember(User user) {
        if (!members.contains(user)) {
            members.add(user);
        }
    }

    public void removeMember(User user) {
        members.remove(user);
    }

    public List<CommunityPost> getPosts() {
        return Collections.unmodifiableList(posts);
    }

    public void addPost(CommunityPost post) {
        posts.add(post);
    }

    public void removePost(CommunityPost post) {
        posts.remove(post);
    }
}
