package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int number = scanner.nextInt();
            scanner.nextLine(); // handle next line character(Enter key)
            //Initializing the array
            int freq[] = new int[10];
            for (int i = 0; i < 10; i++) {
                freq[i] = 0;
            }
            int digit;
            // calculate digit with frequency
            while (number > 0) {
                digit = number % 10;
                freq[digit]++;
                number = number / 10;
            }
            // Display DIgit with frequency
            // System.out.println("Digit \t" + "frequency");
            for (int i = 0; i < 10; i++) {
                if (freq[i] > 0) {
                    System.out.println(i + ": " + freq[i]);
                }
                // System.out.println(i + "\t" + freq[i]);
            }
        }
    }
}
