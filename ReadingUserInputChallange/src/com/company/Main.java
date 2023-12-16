package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        //while (true) {
        while(count <= 10){
            System.out.println("Enter Number #" + count);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
                /*if(count > 10){
                    break;
                }*/
            }else{
                System.out.println("Invalid input");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of numbers is: "+ sum);
        scanner.close();
    }
}
