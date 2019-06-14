package com.codecool.levidombi.anthill.ants;

import com.codecool.levidombi.anthill.Colony;
import com.codecool.levidombi.anthill.Direction;

import java.util.Random;

public class Drone extends Ant {
    private int stayCounter;

    public Drone() {
    }

    public void lap(Colony colony) {
        if (stayCounter == 0) {
            if (getDistanceFromOrigo() > 3) {
                move(checker());
            } else {
                if (colony.getQueen().mating()) {
                    System.out.println("HALLELUJA " + colony.getGametick());
                    stayCounter = 10;

                } else {
                    System.out.println("D'OH " + colony.getGametick());
                    kickedInTheNuts();
                }
            }
        } else {
            stayCounter--;
            if (stayCounter == 0){
                kickedInTheNuts();
            }
        }
    }

    private Direction checker() {
        if (this.y_position < 0) {
            return Direction.UP;
        } else if (this.y_position > 0) {
            return Direction.DOWN;
        } else if (this.x_position < 0) {
            return Direction.RIGHT;
        } else {
            return Direction.LEFT;
        }
    }



    private void kickedInTheNuts(){
        Random random = new Random();
        this.x_position = random.nextInt(80)+21;
        this.y_position = 100 -x_position;
    }
}
