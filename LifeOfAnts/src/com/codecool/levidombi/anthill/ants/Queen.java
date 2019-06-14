package com.codecool.levidombi.anthill.ants;

import com.codecool.levidombi.anthill.Colony;

import java.util.Random;

public class Queen extends Ant {
    private int timer;

    private int bitch_O_Meter;

    public Queen() {
        this.timer = 0;
        this.bitch_O_Meter = 0;
    }

    private boolean kurhato_e() {
        return timer == 0;
    }


    @Override
    public void lap(Colony colony) {
        if (this.timer > 0){
            timer--;
        }
    }

    public boolean mating() {
        if (kurhato_e()) {
            Random random = new Random();
            this.timer = random.nextInt(100)+100;
            bitch_O_Meter++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "com.codecool.levidombi.anthill.ants.Queen{" +
                "bitch_O_Meter=" + bitch_O_Meter +
                '}';
    }
}
