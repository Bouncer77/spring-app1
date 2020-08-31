package com.bouncer77.spring.learn;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 28.08.2020
 */

public interface Music {
    String getSong();

    default void doMyMusicInit() {
        System.out.println("Initialization Music");
    }

    default void doMyMusicDestroy() {
        System.out.println("Destroy Music");
    }
}
