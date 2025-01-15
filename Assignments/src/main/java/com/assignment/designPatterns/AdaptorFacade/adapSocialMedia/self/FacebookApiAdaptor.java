package main.java.com.assignment.designPatterns.AdaptorFacade.adapSocialMedia.self;

import main.java.com.assignment.designPatterns.AdaptorFacade.adapSocialMedia.self.external.FacebookApi;
import main.java.com.assignment.designPatterns.AdaptorFacade.adapSocialMedia.self.external.FacebookPost;

import java.util.ArrayList;
import java.util.List;

public class FacebookApiAdaptor implements SocialMediaAdapter{
    private FacebookApi facebookApi;
    public FacebookApiAdaptor(){
        facebookApi = new FacebookApi();
    }
    @Override
    public void makePost(SocialMediaPost socialMediaPost) {
        facebookApi.postFacebookStatus(socialMediaPost.getUserId(),
                                       socialMediaPost.getStatus());
    }

    @Override
    public List<SocialMediaPost> getPosts(SocialMediaPost socialMediaPost) {
        List<FacebookPost> facebookPosts = facebookApi.fetchFacebookPosts(socialMediaPost.getUserId(), socialMediaPost.getTimestamp());
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();
        for(FacebookPost facebookPost : facebookPosts){
            socialMediaPosts.add(
                    SocialMediaPost
                            .getBuilder()
                            .setId(facebookPost.getId())
                            .setStatus(facebookPost.getStatus())
                            .setUserId(facebookPost.getUserId())
                            .setTimestamp(facebookPost.getTimestamp())
                            .builde()
            );
        }
        return socialMediaPosts;
    }
}
