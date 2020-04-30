package com.pointer.springcourse;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind of Change";
    }

    private void doMyInit() {
        System.out.println("doing MY initialization");
    }
}
