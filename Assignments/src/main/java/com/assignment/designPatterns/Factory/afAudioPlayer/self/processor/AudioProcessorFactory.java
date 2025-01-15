package main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.processor;

import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.MediaFormat;

public class AudioProcessorFactory {
    public static AudioProcessor getAudioProcessor(byte[] audioData, MediaFormat mediaFormat){
        switch (mediaFormat){
            case MP3 :
                return new MP3AudioProcessor(audioData);
            case FLAC:
                return new FLACAudioProcessor(audioData);
            case WAV:
                return null;
            default:
                return null;
        }
    }
}
