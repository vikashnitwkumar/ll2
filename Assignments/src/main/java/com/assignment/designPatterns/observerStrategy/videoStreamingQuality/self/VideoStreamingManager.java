package src.main.java.com.assignment.designPatterns.observerStrategy.videoStreamingQuality.self;

public class VideoStreamingManager {
    private Video video;
    private QualityAdjustmentStrategy qualityAdjustmentStrategy;
    public VideoStreamingManager(Video video, QualityAdjustmentStrategy qualityAdjustmentStrategy) {
        this.video = video;
        this.qualityAdjustmentStrategy = qualityAdjustmentStrategy;
    }

    public Video streamVideo() {

        if(qualityAdjustmentStrategy == null) {
            throw new IllegalArgumentException("Unsupported video quality!");
        }
        return qualityAdjustmentStrategy.adjust(video);
    }
}