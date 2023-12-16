package com.company;

public class Fish extends Animal{
    private  int gills;
    private int eyes;
    private  int fins;

    public Fish(String name,  int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private  void Rest(){

    }

    private void MoveMuscles(){

    }
    private void MoveBackFinn(){

    }

    private void Swim(int speed){
        MoveMuscles();
        MoveBackFinn();
        super.move(speed);
    }
}
