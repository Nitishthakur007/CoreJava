package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
    }


    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59 ){
            return "Invalid values";
        }
        int hours = minutes / 60 ;
        int min= minutes % 60 ;
        return hours + "H" + min + "M" + seconds + "S";



    }
}
