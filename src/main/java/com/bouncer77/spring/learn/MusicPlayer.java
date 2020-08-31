package com.bouncer77.spring.learn;

import java.util.List;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 28.08.2020
 */

public class MusicPlayer {

    private List<Music> musicList;

    private String name;
    private int volume;

    public MusicPlayer(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing: ");
        musicList.forEach(a -> System.out.println(a.getSong()));
    }

    // init-method
    public void doMyInit() {
        System.out.println("Бин MusicPlayer инициализируется");
    }

    // destroy-method
    public void doMyDestroy() {
        System.out.println("Бин MusicPlayer уничтожается");
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musicListSize=" + musicList.size() +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
