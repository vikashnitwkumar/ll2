package main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.decoder;


import main.java.com.assignment.designPatterns.Factory.sfAudioPlayer.self.MediaFormat;

public abstract class AudioDecoder {

    private final byte[] audioData;

    public AudioDecoder(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] decode();
}