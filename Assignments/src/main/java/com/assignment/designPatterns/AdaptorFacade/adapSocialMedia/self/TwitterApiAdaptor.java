package main.java.com.assignment.designPatterns.AdaptorFacade.adapSocialMedia.self;

import main.java.com.assignment.designPatterns.AdaptorFacade.adapSocialMedia.self.external.TwitterApi;
import main.java.com.assignment.designPatterns.AdaptorFacade.adapSocialMedia.self.external.TwitterTweet;

import java.util.ArrayList;
import java.util.List;

public class TwitterApiAdaptor implements SocialMediaAdapter{
    private TwitterApi twitterApi;
    public TwitterApiAdaptor() {
        twitterApi = new TwitterApi();
    }

    @Override
    public void makePost(SocialMediaPost socialMediaPost) {
        twitterApi.tweet(socialMediaPost.getUserId(), socialMediaPost.getTweet());
    }

    @Override
    public List<SocialMediaPost> getPosts(SocialMediaPost socialMediaPost) {
        List<TwitterTweet> twitterTweets = twitterApi.getTweets(socialMediaPost.getUserId());
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();
        for(TwitterTweet twitterTweet : twitterTweets){
            socialMediaPosts.add(
                            SocialMediaPost
                            .getBuilder()
                            .setId(twitterTweet.getId())
                            .setTweet(twitterTweet.getTweet())
                            .setUserId(twitterTweet.getUserId())
                            .builde()
                            );
        }
        return socialMediaPosts;
    }

}
