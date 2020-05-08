package com.pointer.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getVolume());

        System.out.println(musicPlayer.getName());
        ClassicalMusic classicalMusic= context.getBean("classicalMusic",ClassicalMusic.class);

        context.close();
    }
}
