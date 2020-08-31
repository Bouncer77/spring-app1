package com.bouncer77.spring.learn;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 31.08.2020
 */

public class JazzMusic implements Music {

    private String song;

    public JazzMusic(String song) {
        this.song = song;
    }

    @Override
    public String getSong() {
        return song;
    }
}
