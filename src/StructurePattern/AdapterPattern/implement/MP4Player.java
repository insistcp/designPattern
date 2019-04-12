package StructurePattern.AdapterPattern.implement;

import StructurePattern.AdapterPattern.interfaces.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("ply Vlc fileName == " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
