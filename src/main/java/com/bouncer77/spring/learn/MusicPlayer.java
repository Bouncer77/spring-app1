package com.bouncer77.spring.learn;

import org.springframework.stereotype.Component;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 31.08.2020
 */

@Component
public class MusicPlayer {

    private Music music = null;

    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    /*public MusicPlayer(Music music) {
        this.music = music;
    }*/

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                '}';
    }
}
