package com.company;

public class Main {

    public static void main(String[] args) {
        int switchvalue =1;
        switch (switchvalue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println(":value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or 4 or 5");
                break;

            default:
                System.out.println("was not 1 or 2 or 3 or 4 or 5");
                break;
        }
    }
}
