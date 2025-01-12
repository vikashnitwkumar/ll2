package main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self;

import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.decoder.AudioDecoder;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.player.AudioPlayer;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.processor.AudioProcessor;

public abstract class AudioFactory {
    protected AudioProcessor audioProcessor;
    protected AudioPlayer audioPlayer;
    protected AudioDecoder audioDecoder;
    public abstract MediaFormat supportsFormat();
    public abstract AudioProcessor getAudioProcessor(byte[] audioData);
    public abstract AudioPlayer getAudioPlayer(int volume, double playbackRate);
    public abstract AudioDecoder getAudioDecoder(byte[] audioData);
}