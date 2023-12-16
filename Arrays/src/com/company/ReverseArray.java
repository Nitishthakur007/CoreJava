package com.company;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {40,55,35,30,65,28,68,70,25,39};
        // reverse(array);
       // optimizedReverse(array);
          reverseCopy(array);
    }

    private static int[] reverse(int[] array){
        System.out.println("Array before reverse --->" + Arrays.toString(array));
        int[] tempArray = new int[array.length];
        int counter = 0;
        int iter = 1;
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println("Iteration number: " + iter);
            tempArray[counter] = array[i];
            counter++;
            iter++;

        }
        System.out.println("Array After reverse: " + Arrays.toString(tempArray));
        return tempArray;
    }

    private static void optimizedReverse(int[]array){
        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        System.out.println("Array before reverse --->" + Arrays.toString(array));

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("-----> " + Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array){
        System.out.println("Array before reverse --->" + Arrays.toString(array));
        int[] reverseArray = new int[array.length];
        int maxIndex = array.length - 1;

        for (int el:array) {
           reverseArray[maxIndex--] = el;
        }
        System.out.println("Array After reverse: " + Arrays.toString(reverseArray));
        return reverseArray;
    }
}
