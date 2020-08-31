package com.bouncer77.spring.learn;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 31.08.2020
 */

public class JazzMusic implements Music {

    private String name;

    // factory-method
    public static JazzMusic getInstance(String name) {
        return new JazzMusic(name);
    }

    private JazzMusic(String name) {
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
