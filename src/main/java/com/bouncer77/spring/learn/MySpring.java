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

        MusicPlayer mp1 = context.getBean("MusicPlayer", MusicPlayer.class);
        MusicPlayer mp2 = context.getBean("MusicPlayer", MusicPlayer.class);

        mp1.setName("Music Player 1");
        mp1.setVolume(77);

        mp2.setName("Music Player 2");

        System.out.println(mp1);
        mp1.playMusic();
        System.out.println();

        System.out.println(mp2);
        mp2.playMusic();
        System.out.println();

        System.out.println("mp1 == mp2 ? " + (mp1 == mp2));


        context.close();
    }
}
