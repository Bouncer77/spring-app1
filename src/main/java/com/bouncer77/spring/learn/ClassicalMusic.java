package com.bouncer77.spring.learn;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 28.08.2020
 */

public class ClassicalMusic implements Music {

    private String name;

    // factory-method
    public static ClassicalMusic getInstance(String name) {
        return new ClassicalMusic(name);
    }

    private ClassicalMusic(String name) {
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
