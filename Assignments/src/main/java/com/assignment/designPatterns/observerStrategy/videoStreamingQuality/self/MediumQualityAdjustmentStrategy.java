package src.main.java.com.assignment.designPatterns.observerStrategy.videoStreamingQuality.self;

public class MediumQualityAdjustmentStrategy implements QualityAdjustmentStrategy{
    @java.lang.Override
    public VideoQuality supportsType() {
        return VideoQuality.MEDIUM;
    }

    @java.lang.Override
    public Video adjust(Video video) {
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        return video;
    }
}