package com.codecool.levidombi.anthill;

import java.util.Random;

public enum Direction {
    UP(1),
    LEFT(-1),
    DOWN(-1),
    RIGHT(1),
    ;
    private int dir;

    Direction(int i) {
        this.dir = i;
    }

    public int getDir() {
        return this.dir;
    }
    public static Direction get_RandomDir(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

