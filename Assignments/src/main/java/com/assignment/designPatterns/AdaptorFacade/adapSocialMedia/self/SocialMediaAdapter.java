package main.java.com.assignment.designPatterns.AdaptorFacade.adapSocialMedia.self;

import java.util.List;

public interface SocialMediaAdapter {
    public void makePost(SocialMediaPost socialMediaPost);
    List<SocialMediaPost> getPosts(SocialMediaPost socialMediaPost);
}