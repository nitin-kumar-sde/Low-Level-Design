package practise.community_discussion_platform.model;


public class CommunityPost extends Post {

    private final Community community;

    public CommunityPost(User author, String content, Community community) {
        super(author, content);
        this.community = community;
    }

    public Community getCommunity() {
        return community;
    }

    @Override
    public String getPostType() {
        return "CommunityPost in " + community.getName();
    }
}
