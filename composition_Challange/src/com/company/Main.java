package com.company;

public class Main {

    public static void main(String[] args) {
        wall wall1 = new wall("west");
        wall wall2 = new wall("east");
        wall wall3 = new wall("south");
        wall wall4 = new wall("north");

        Celling celling = new Celling(12, 55);
        Bed bed = new Bed("King", 4 , 3 , 2 , 2);
        Lamp lamp = new Lamp("classic",false, 4);

        Bedroom bedroom = new Bedroom("Nitish", wall1,wall2,wall3,wall4, celling,bed,lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();

    }
}
