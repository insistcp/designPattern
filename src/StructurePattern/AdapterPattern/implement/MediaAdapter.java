package StructurePattern;

import StructurePattern.AdapterPattern.implement.MP4Player;
import StructurePattern.AdapterPattern.implement.VlcPlayer;
import StructurePattern.AdapterPattern.interfaces.AdvanceMediaPlayer;
import StructurePattern.AdapterPattern.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
