package main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self;

import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.decoder.*;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.decoder.*;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.player.*;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.processor.*;
import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.processor.AudioProcessorFactory;

public class FLACAudioFactory extends AudioFactory{
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioProcessor getAudioProcessor(byte[] audioData) {
        return audioProcessor = AudioProcessorFactory.getAudioProcessor(audioData, MediaFormat.FLAC);
    }

    @Override
    public AudioPlayer getAudioPlayer(int volume, double playbackRate) {
        return  audioPlayer = AudioPlayerFactory.getAudioPlayer(volume, playbackRate, MediaFormat.FLAC);
    }

    @Override
    public AudioDecoder getAudioDecoder(byte[] audioData) {
        return audioDecoder = AudioDecoderFacory.getAudioDecoder(audioData, MediaFormat.FLAC);
    }
}