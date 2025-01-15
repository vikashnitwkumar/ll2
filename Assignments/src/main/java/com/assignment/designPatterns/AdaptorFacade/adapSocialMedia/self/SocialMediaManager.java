package main.java.com.assignment.designPatterns.AdaptorFacade.adapSocialMedia.self;



import java.util.List;

public class SocialMediaManager {
    private  FacebookApiAdaptor facebookApiAdaptor= new FacebookApiAdaptor();
    private TwitterApiAdaptor twitterApiAdaptor = new TwitterApiAdaptor();
    public void getMessages(Long userId, Long timestamp, String platform) {
        SocialMediaPost socialMediaPost = SocialMediaPost.getBuilder().setUserId(userId)
                .setTimestamp(timestamp).builde();
        if (platform.equals("facebook")) {
            List<SocialMediaPost> posts = facebookApiAdaptor.getPosts(socialMediaPost);
        } else if (platform.equals("twitter")) {
            List<SocialMediaPost> tweets = twitterApiAdaptor.getPosts(socialMediaPost);
        }
//        testing;
        // Convert the posts/tweets to a common format
    }
}