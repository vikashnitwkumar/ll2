package src.main.java.com.assignment.designPatterns.observerStrategy.videoStreamingQuality.self;

import

public class Video {
    private String videoUrl;
    private VideoQuality videoQuality;
    private VideoCodec codec;
    private Integer bitrate;
Integer abc = new Integer();
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public VideoQuality getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }

    public VideoCodec getCodec() {
        return codec;
    }

    public void setCodec(VideoCodec codec) {
        this.codec = codec;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public Video(String videoUrl, VideoQuality videoQuality) {
        this.videoUrl = videoUrl;
        this.videoQuality = videoQuality;
    }
}