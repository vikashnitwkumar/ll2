package main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.decoder;

import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.MediaFormat;


public class AudioDecoderFacory {
    public static AudioDecoder getAudioDecoder(byte[] audioData, MediaFormat mediaFormat){
        switch (mediaFormat){
            case MP3 :
                return new MP3Decoder(audioData);
            case FLAC:
                return new FLACDecoder(audioData);
            case WAV:
                return null;
            default:
                return null;
        }
    }
}
