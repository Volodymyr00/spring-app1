package com.pointer.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
   private List<String>songs = new ArrayList<>();
    {
        songs.add("Wind of changes");
        songs.add("Humanity");
        songs.add("Fire");
    }


    @Override
    public List<String> getSongs() {
        return songs;
    }
}
