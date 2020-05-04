package com.pointer.springcourse;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final int id;
    private MusicPlayer musicPlayer;

    public Computer(int id, MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer@ " +id+ musicPlayer.playMusic();
    }
}
