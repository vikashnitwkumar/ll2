package main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self;

import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.decoder.AudioDecoder;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.decoder.FLACDecoder;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.decoder.MP3Decoder;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.player.AudioPlayer;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.player.MP3Player;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.processor.AudioProcessor;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.processor.FLACAudioProcessor;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.processor.MP3AudioProcessor;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.MediaFormat;

public class MP3AudioFactory extends AudioFactory {
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }
    @Override
    public AudioProcessor getAudioProcessor(byte[] audioData) {
        return audioProcessor = new MP3AudioProcessor(audioData);
    }

    @Override
    public AudioPlayer getAudioPlayer(int volume, double playbackRate) {
        return  audioPlayer = new MP3Player(volume, playbackRate);
    }

    @Override
    public AudioDecoder getAudioDecoder(byte[] audioData) {
        return audioDecoder = new MP3Decoder(audioData);
    }
}