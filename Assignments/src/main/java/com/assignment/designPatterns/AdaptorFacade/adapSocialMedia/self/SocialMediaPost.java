package main.java.com.assignment.designPatterns.AdaptorFacade.adapSocialMedia.self;

public class SocialMediaPost {
    private String id;
    private String status;
    private Long userId;
    private Long timestamp;
    private String tweet;

    public SocialMediaPost(String id, String status, Long userId, Long timestamp, String tweet) {
        this.id = id;
        this.status = status;
        this.userId = userId;
        this.timestamp = timestamp;
        this.tweet = tweet;
    }

    public SocialMediaPost(){

    }
    public SocialMediaPost(SocialMediaPostBuilder socialMediaPostBuilder){
        this.id = socialMediaPostBuilder.getId();
        this.status = socialMediaPostBuilder.getStatus();
        this.tweet = socialMediaPostBuilder.getTweet();
        this.userId = socialMediaPostBuilder.getUserId();
        this.timestamp = socialMediaPostBuilder.timestamp;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getTweet() {
        return tweet;
    }


    public static SocialMediaPostBuilder getBuilder(){
        return new SocialMediaPostBuilder();
    }
    public static class SocialMediaPostBuilder{
        private String id;
        private String status;
        private Long userId;
        private Long timestamp;
        private String tweet;

        public String getId() {
            return id;

        }

        public SocialMediaPostBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public String getStatus() {
            return status;
        }

        public SocialMediaPostBuilder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Long getUserId() {
            return userId;
        }

        public SocialMediaPostBuilder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Long getTimestamp() {
            return timestamp;
        }

        public SocialMediaPostBuilder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public String getTweet() {
            return tweet;
        }

        public SocialMediaPostBuilder setTweet(String tweet) {
            this.tweet = tweet;
            return this;
        }

        public SocialMediaPost builde(){
            return new SocialMediaPost(this);
        }
    }
}