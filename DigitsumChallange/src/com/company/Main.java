package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(sumDigits(1000));
        System.out.println(sumDigits(125));
        System.out.println(sumdigits(999));
    }

    /*public static int sumDigits(int number){
        int sum = 0;
        if (number <= 9) {
            return -1;
        }
        int leastsignificant = number % 10;
        //System.out.println("Least significant number: " + leastsignificant);
        int mostsignificant = number / 10;
        if (mostsignificant <= 9){
            return leastsignificant + mostsignificant;
        }else{
            while(mostsignificant >= 10 ){
                sum+= (mostsignificant % 10);
                mostsignificant = mostsignificant / 10;

            }
        }
        return sum + mostsignificant + leastsignificant;
    }*/




    public static int sumDigits(int number) {
        if (number <= 9) {
            return -1;
        }
        int sum = 0;
        int leastsignificant = number % 10;
        int mostsignificant = number / 10;
        while (mostsignificant >= 10) {
            sum += (mostsignificant % 10);
            mostsignificant = (mostsignificant / 10);
        }
        return sum + mostsignificant + leastsignificant;
    }


    private static int sumdigits(int number){
        if (number <= 9) {
            return -1;
        }
        int sum=0;
        while(number > 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
       return sum;
    }
}
