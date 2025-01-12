package main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.player;

import main.java.com.assignment.designPatterns.Factory.afAudioPlayer.self.MediaFormat;

public class AudioPlayerFactory {
    public static AudioPlayer getAudioPlayer(int volume, double playBackRate, MediaFormat mediaFormat){
        switch (mediaFormat){
            case MP3 :
                return new MP3Player(volume,playBackRate);
            case FLAC:
                return new FLACPlayer(volume, playBackRate);
            case WAV:
                return null;
            default:
                return null;
        }
    }
}
