package com.company;

import java.util.Scanner;

public class MinElementChallange {

    public static void main(String[] args) {
       int[] array = readIntegers();
        System.out.println("Minimum number is: " + findMin(array));
    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of Integers, separated by commas:");
        String input = scanner.nextLine();

        String[] split  = input.split(",");
        int[] values = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            values[i]  = Integer.parseInt(split[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array){
        int minNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if(minNum > array[i]){
                minNum = array[i];
            }
        }
        return minNum;
    }
}
