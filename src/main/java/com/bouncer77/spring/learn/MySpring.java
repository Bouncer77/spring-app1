package com.bouncer77.spring.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 28.08.2020
 */

public class MySpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Music rock = context.getBean("rockMusicId", RockMusic.class);
        Music classical = context.getBean("classicalMusicId", ClassicalMusic.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.setMusic(rock);
        musicPlayer.playMusic();

        musicPlayer.setMusic(classical);
        musicPlayer.playMusic();

        context.close();
    }
}
