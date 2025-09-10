package practise.community_discussion_platform.manager;

import practise.community_discussion_platform.model.Community;
import practise.community_discussion_platform.model.CommunityPost;
import practise.community_discussion_platform.model.Post;
import practise.community_discussion_platform.model.User;

public class PostManager {

    // create standalone post by a user.
    public void post(final User user, final Post post) {

        user.addPost(post);
        System.out.println("Standalone post created by " + user.getUsername());
    }

    // create community posts
    public void post(final User user, final CommunityPost post,
                     final Community community) {
        user.addPost(post);
        community.addPost(post);
        System.out.println("Community post created by " + user.getUsername() +
                " in community: " + community.getName());
    }

    // edits an exiting post
    public void editPost(final Post post, final String newContent) {
        post.setContent(newContent);
        System.out.println("Post updated: " + post.getPostId());
    }
}
