package com.company;

public class Bedroom {
    private String Name;
    private wall wall1;
    private wall wall2;
    private wall wall3;
    private wall wall4;
    private Celling celling;
    private Bed bed;
    private Lamp lamp;


    public Bedroom(String name, wall wall1, wall wall2, wall wall3, wall wall4, Celling celling, Bed bed, Lamp lamp) {
        Name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.celling = celling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom --> Making Bed");
        bed.make();
    }
}
