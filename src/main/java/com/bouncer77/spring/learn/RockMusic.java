package com.bouncer77.spring.learn;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 28.08.2020
 */

public class RockMusic implements Music {

    private String name;

    // factory-method
    public static RockMusic getInstance(String name) {
        return new RockMusic(name);
    }

    private RockMusic(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSong() {
        return name;
    }
}
