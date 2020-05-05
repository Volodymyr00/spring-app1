package com.pointer.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Symfony #3");
        songs.add("Symfony #7");
        songs.add("Symfony #11");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
