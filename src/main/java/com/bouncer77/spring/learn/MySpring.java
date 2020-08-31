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

        MusicPlayer musicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer);
        musicPlayer.playMusic();

        context.close();
    }
}
