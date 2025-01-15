package src.main.java.com.assignment.designPatterns.observerStrategy.videoStreamingQuality.self;

public class HIghQualityAdjustmentStrategy implements QualityAdjustmentStrategy{
    @java.lang.Override
    public VideoQuality supportsType() {
        return VideoQuality.HIGH;
    }

    @java.lang.Override
    public Video adjust(Video video) {
        video.setCodec(VideoCodec.VP9);
        video.setBitrate(2000);
        return video;
    }
}
