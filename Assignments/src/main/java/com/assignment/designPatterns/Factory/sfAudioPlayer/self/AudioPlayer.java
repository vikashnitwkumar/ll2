package main.java.com.assignment.designPatterns.Factory.sfAudioPlayer.self;

public abstract class AudioPlayer {
    protected int volume;
    protected double playBackRate;

    public abstract void play();

    public abstract void pause();

    public abstract void stop();

    public abstract MediaFormat supportsType();
}
