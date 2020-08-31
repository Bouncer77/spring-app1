package com.bouncer77.spring.learn;

import org.springframework.stereotype.Component;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 28.08.2020
 */

@Component("classicalMusicId")
public class ClassicalMusic implements Music {

    private String name;

    public ClassicalMusic() {
        this.name = "Classical song name";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSong() {
        return name;
    }
}
