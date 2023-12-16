package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20 ,20, 5);
        Case theCase = new Case("B-400", "Dell", "240",dimensions);
        Monitor theMonitor = new Monitor("M-600","LG", 32, new Resolution(1980, 1080));
        MotherBoard theMotherBoard = new MotherBoard("MB-800", "Asus", 4,2, "V2.0");

        PC thePC = new PC(theCase,theMonitor,theMotherBoard);

        thePC.powerUp();
    }
}
