package com.codecool.levidombi.anthill;

import com.codecool.levidombi.anthill.ants.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Colony {
    private Queen queen;
    private List<Ant> antHorde;

    private int gametick;

    private  int workerCounter = 0;
    private  int droneCounter = 0;
    private  int soldierCounter = 0;
    public Colony() {
        this.queen = new Queen();
        this.antHorde = populate();
    }
    public void run() {
        for (gametick = 0; gametick < 13000; gametick++) {
            queen.lap(this);
            antHorde.forEach(Ant -> Ant.lap(this));
        }
        System.out.println(queen.toString());
        // no tostring needed
        System.out.println("workerCounter: " + workerCounter);
        System.out.println("droneCounter: " + droneCounter);
        System.out.println("soldierCounter: " + soldierCounter);
    }

    public Queen getQueen() {
        return queen;
    }

    private List<Ant> populate() {
        List<Ant> tempAntList = new ArrayList<>();
        Random random = new Random();
        int minVal = 4;
        for (int i = 0; i < random.nextInt(20) + minVal; i++) {
            tempAntList.add(new Worker());
            workerCounter++;
        }
        for (int i = 0; i < random.nextInt(20) + minVal; i++) {
            tempAntList.add(new Drone());
            droneCounter++;
        }
        for (int i = 0; i < random.nextInt(20) + minVal; i++) {
            tempAntList.add(new Soldier());
            soldierCounter++;
        }

        return tempAntList;
    }


    public int getGametick() {
        return gametick;
    }
}
