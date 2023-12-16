package com.company;

public class VariableArguments {
    public static void main(String... args) {
        System.out.println("Hello world again");

        String[] splitStrings = "Hello world again".split(" ");
        System.out.println("_".repeat(20));
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello", "world", "again");


        System.out.println("_".repeat(20));
        printText();


        System.out.println("_".repeat(20));
        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));



    }

    private static void printText(String... textList) {

        for(String t: textList) {
            System.out.println(t);
        }
    }
}
