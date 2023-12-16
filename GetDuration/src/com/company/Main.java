package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(65, 65));
        System.out.println(getDurationString(3600));

    }


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid values";
        }
        int hours = minutes / 60;
        int min = minutes % 60;
        return hours + "H " + min + "M " + seconds + "S ";


    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid value";
        }

        int NewMinutes = seconds/60;
        int remainingSeconds = seconds % 60;
        return getDurationString(NewMinutes,remainingSeconds);
    }




}




