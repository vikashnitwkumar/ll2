package main.java.com.assignment.designPatterns.Factory.sfAudioPlayer.self;

public class AudioPlayerFactory {
    public static AudioPlayer getPlayer(MediaFormat mediaFormat, int volume, double playBackRate){
        switch (mediaFormat){
            case WAV :  return
                    new WAVPlayer(volume, playBackRate);
            case FLAC: return new FLACPlayer(volume, playBackRate);
            case MP3: return new MP3Player(volume,playBackRate);
            default: return null;
        }
    }
}
