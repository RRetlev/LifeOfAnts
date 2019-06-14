package com.codecool.levidombi.anthill.ants;

import com.codecool.levidombi.anthill.Colony;
import com.codecool.levidombi.anthill.Direction;

public class Soldier extends Ant {
    private int counter;


    public Soldier() {
        this.counter = 0;
    }


    @Override
    public void lap(Colony colony) {
        move(Direction.values()[counter++ % Direction.values().length]);
    }
}
