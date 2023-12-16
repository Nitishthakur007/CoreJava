package com.company;

public class Main {

    public static void main(String[] args) {
        PrintDayOfTheWeek(-1);
        PrintDayOfTheWeek(0);

    }

    private static void PrintDayOfTheWeek(int day){
        switch (day) {
            case 0:
                System.out.println("Day of the week is Sunday");
                break;
            case 1:
                System.out.println("Day of the week is Monday");
                break;
            case 2:
                System.out.println("Day of the week is Tuesday");
                break;
            case 3:
                System.out.println("Day of the week is Wednesday");
                break;
            case 4:
                System.out.println("Day of the week is Thursday");
                break;
            case 5:
                System.out.println("Day of the week is Friday");
                break;
            case 6:
                System.out.println("Day of the week is Satday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }
}
