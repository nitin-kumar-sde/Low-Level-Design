package practise.community_discussion_platform.model;

public class StandalonePost extends Post {

    public StandalonePost(String postId, User author, String content) {
        super(author, content);
    }

    @Override
    public String getPostType() {
        return "StandalonePost";
    }
}
