package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i<=1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " is divisible by both 3 & 5");
                sum += i;
                // System.out.println("sum : "+ sum);
                count++;
                //System.out.println("count : "+ count);
            }
            if (count >= 5) {
                System.out.println("We have found first 5 numbers");
                break;
            }
        }
        System.out.println("The sum of first 5 number divisible by both 3 & 5 is : " + sum );

    }
}
