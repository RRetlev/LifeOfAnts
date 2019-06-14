package com.codecool.levidombi.anthill.ants;

import com.codecool.levidombi.anthill.Colony;
import com.codecool.levidombi.anthill.Direction;

public class Worker extends Ant {
    public Worker() {
    }




    @Override
    public void lap(Colony colony) {
        move(Direction.get_RandomDir());
    }
}
