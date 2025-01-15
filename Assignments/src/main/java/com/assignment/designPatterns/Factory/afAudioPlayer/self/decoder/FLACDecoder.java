package main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.decoder;


import main.java.com.assignment.designPatterns.Factory.sfAudioPlayer.self.MediaFormat;

public class FLACDecoder extends AudioDecoder {

    public FLACDecoder(byte[] audioData) {
        super(audioData);
    }

    @Override
    public main.java.com.assignment.designPatterns.Factory.sfAudioPlayer.self.MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public byte[] decode() {
        // Implement FLAC decoding logic
        System.out.println("Decoding FLAC audio data...");
        // Decoding process
        return getAudioData();
    }
}