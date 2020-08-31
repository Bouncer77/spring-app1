package com.bouncer77.spring.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 28.08.2020
 */

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public MusicPlayer() {}

    // IoC
    /*public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }*/

    public void playMusic() {
        System.out.println("Playing: ");
        musicList.forEach(a -> System.out.println(a.getSong()));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musicListSize=" + musicList.size() +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    public void setMusicList(List musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }
}
