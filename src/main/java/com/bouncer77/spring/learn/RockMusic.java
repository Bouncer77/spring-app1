package com.bouncer77.spring.learn;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 28.08.2020
 */

public class RockMusic implements Music {

    private String name;

    public RockMusic(String name) {
        this.name = name;
    }

    @Override
    public String getSong() {
        return name;
    }
}
