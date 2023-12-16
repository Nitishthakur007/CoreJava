package com.company;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallengeDescSort {
    public static void main(String[] args) {
        int[] intArray = getRandomArray(5);
        System.out.println(Arrays.toString(intArray));

        int[] sortedArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Before Sorted: " + Arrays.toString(sortedArray));
        Arrays.sort(sortedArray);
        System.out.println("After Sorted: " + Arrays.toString(sortedArray));


        int[] descSortedArray = sortIntegers(intArray);

    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(999);
        }
        return newInt;
    }

    private static int[] sortIntegers(int[] array){

        System.out.println("Array values before sorting --->" + Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    temp =sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag= true;
                    System.out.println("Sorting in progress --->" + Arrays.toString(sortedArray));
                }

            }

            System.out.println("Sorting Completed --->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
