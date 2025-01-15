package main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.processor;


import main.java.com.assignment.designPatterns.Factory.sfAudioPlayer.self.MediaFormat;

public abstract class AudioProcessor {

    private final byte[] audioData;

    public AudioProcessor(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] process();
}