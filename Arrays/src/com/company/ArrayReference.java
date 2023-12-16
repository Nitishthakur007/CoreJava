package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayReference {

    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("myIntArray= " + Arrays.toString(anotherArray));

        myIntArray[0] = 5;
        modifyArray(myIntArray);
        System.out.println("myIntArray after modification = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after modification = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array [1] = 7;
    }
}
