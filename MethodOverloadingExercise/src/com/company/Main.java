package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(157);





    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 && inches>=0 && inches <= 12){
            double result = (feet * 30.48) + (inches * 2.54);
            System.out.println(feet + " feet " + inches + " inches = " + result + " centimeters");
            return  result;

        }else{
            System.out.println("Invalid feet or inches value");
            return -1;
        }
    }



    public static double calcFeetAndInchesToCentimeters(double inches){
        if( inches >= 0 ){
            double feet = (int) inches / 12;
            double remainderinches = (int) inches % 12;
            System.out.println("feet: " + feet + " remaining inches: " + remainderinches);
            return  calcFeetAndInchesToCentimeters(feet,remainderinches);
        }else{
            System.out.println("Invalid inches value");
           return -1;
        }
    }
}
