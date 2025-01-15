package src.main.java.com.assignment.designPatterns.observerStrategy.videoStreamingQuality.self;

public class LowQualityAdjustmentStrategy implements QualityAdjustmentStrategy{
    @java.lang.Override
    public VideoQuality supportsType() {
        return VideoQuality.LOW;
    }

    @java.lang.Override
    public Video adjust(Video video) {
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        return video;
    }
}