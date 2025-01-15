package src.main.java.com.assignment.designPatterns.observerStrategy.videoStreamingQuality.self;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();
    Video adjust(Video video);
}