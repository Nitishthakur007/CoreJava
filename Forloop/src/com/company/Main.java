package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " + Calculateinterest(10000.0, 2.0));
        System.out.println("10000 at 3% interest = " + Calculateinterest(10000.0, 3.0));
        System.out.println("10000 at 4% interest = " + Calculateinterest(10000.0, 4.0));
        System.out.println("10000 at 5% interest = " + Calculateinterest(10000.0, 5.0));

        System.out.println("************************************");


        for(int i = 2; i <= 10 ; i++){
            //System.out.println("Loop "+ i + " hello");
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",Calculateinterest(10000.0, i)));


        }
        System.out.println("************************************");


        for(int i = 8; i >= 2 ; i--){
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",Calculateinterest(10000.0, i)));


        }

        System.out.println("************************************");



        System.out.println(isPrime(5));




        System.out.println("************************************");
        int count = 0;
        for(int i = 10 ; i < 50; i++){
             if(isPrime(i)){
                count++;
                 System.out.println("Number "+ i + " is a prime number");
                 if(count == 10){
                     System.out.println("Exiting the loop");
                     break;
                 }
             }
        }

    }

    //*******************************************************************************//


    public static double Calculateinterest(double amount, double interestrate){
        return (amount * (interestrate/100));
    }

    //*******************************************************************************************//
    public static boolean isPrime(int n){
        if(n==1){
            return false;

        }
        for(int i =2; i<=(long)Math.sqrt(n); i++){
        //for(int i =2; i<= n/2; i++){
            System.out.println("Looping " + i);
            if(n % i == 0){
                return false;
            }

        }
        return true;
    }

    //************************************************************************************//

}
