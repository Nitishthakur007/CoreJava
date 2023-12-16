package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] myIntArray = new int[10];

    // Array is not resizable
        myIntArray[0] = 45;
       myIntArray[2] = 25;
      myIntArray[6] = 36;
      myIntArray[7] = 16;

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[8]);
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[9]);

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);

	double[] myDoubleArray = new double[10];
    myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);


        // The Array initializer

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first: " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of Array: " + arrayLength);
        System.out.println("Last: " + firstTen[arrayLength-1]);

        int[] newArray;
        newArray = new int[]{1,3,6,4,7,};
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Value at index "+ i + " is: " +newArray[i]);
        }

        System.out.println("******************************");
        // Enhanced for loop , For each loop
        for (int element:newArray) {
            System.out.println("Element Value:" + element);
        }
        System.out.println("******************************");
        System.out.println(Arrays.toString(newArray));

        System.out.println("******************************");

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }

        System.out.println("******************************");

        Object[] objectArray = new Object[4];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("world");
        objectArray[2] = new Integer(24);
        objectArray[3] = newArray;

        System.out.println("******************************");

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value at index "+ i + " is: " +array[i]);
        }
    }
}
