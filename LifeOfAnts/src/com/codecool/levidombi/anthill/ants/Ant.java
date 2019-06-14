package com.codecool.levidombi.anthill.ants;

import com.codecool.levidombi.anthill.Colony;
import com.codecool.levidombi.anthill.Direction;

public abstract class Ant {
    protected int x_position;
    protected int y_position;



    public void move(Direction direction){
        if(direction == Direction.DOWN || direction == Direction.UP){
            this.y_position += direction.getDir();
        }else {
            this.x_position += direction.getDir();
        }


    }
    public int getDistanceFromOrigo(){
        return  Math.abs(this.x_position) + Math.abs(this.y_position);
    }

    public void lap(Colony colony){}

}
