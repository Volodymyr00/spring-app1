package com.pointer.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic1=context
                .getBean("musicBean",ClassicalMusic.class);

        System.out.println(classicalMusic1.getSong());


        /*MusicPlayer firstMusicPlayer= context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondMusicPlayer= context.getBean("musicPlayer",MusicPlayer.class);

        boolean comparison = firstMusicPlayer== secondMusicPlayer;

        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
       // System.out.println(musicPlayer.getName());
        // System.out.println(musicPlayer.getVolume());
*/
    context.close();
    }
}
