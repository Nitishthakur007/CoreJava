package com.company;

import javax.swing.plaf.IconUIResource;
import java.security.PublicKey;

public class Main {

    public static void main(String[] args) {

        //System.out.println(charSearch("bookkeeper", 'o'));

        frequency("22245465564");

    }
    public static void frequency(String n){

        int number = Integer.parseInt(n);
        //Initializing the array
        int freq[] = new int[10];
        for (int i = 0; i < 10; i++){
            freq[i] = 0;
        }
        int digit;
        // calculate digit with frequency
        while(number > 0 ) {
            digit = number % 10;
            freq[digit]++;
            number = number / 10;
        }
        // Display DIgit with frequency
       // System.out.println("Digit \t" + "frequency");
        for(int i=0; i < 10; i++){
            if(freq[i] > 0){
                System.out.println(i + ": " + freq[i]);
            }
           // System.out.println(i + "\t" + freq[i]);
        }
    }




    public static int charSearch(String str, char ch){
        int count = 0;
        var chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                count += 1;
            }

        }
        return count;
    }


}
