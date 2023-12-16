package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
       // int min = Integer.MAX_VALUE;
        //int min = 2147483647;
        int max = 0;
        //int max = -2147483648;
        //int max = Integer.MIN_VALUE;
        boolean first = true;

        while(true){
            System.out.println("Enter Number: " );
            boolean isAnint = scanner.hasNextInt();


            if(isAnint){

                int currentNumber = scanner.nextInt();

                if (first) {
                    first = false;
                    min = currentNumber;
                    max = currentNumber;
                }


                if(currentNumber > max){
                    max = currentNumber;
                }

                if(currentNumber < min){
                    min = currentNumber;
                }

            }else{
                System.out.println("Invalid input");
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Maximum number is: " + max);
        System.out.println("Maximum number is: " + min);
        scanner.close();
    }
}
