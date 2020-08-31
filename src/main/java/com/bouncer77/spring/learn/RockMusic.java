package com.bouncer77.spring.learn;

import org.springframework.stereotype.Component;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 28.08.2020
 */

@Component("rockMusicId")
public class RockMusic implements Music {

    private String name;

    public RockMusic() {
        this.name = "ROCK! ROCK!";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSong() {
        return name;
    }
}
