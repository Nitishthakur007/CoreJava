package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // int has a width of 32
       /* int myminvalue= -2147483648;
        int mymaxvalue= 2147483647;
        int mytotal = (myminvalue/2);
        System.out.println("mytotal=" + mytotal);


        // byte has a width of 8
        byte mybyte= -128;
        byte mynewbyte = (byte) (mybyte/2);
        System.out.println("mynewbyte=" + mynewbyte);

        // short has a width of 16
        short myshortvalue = 32767;
        short newshort = (short) (myshortvalue/2);


        // long has a width of 64
        long mylongvalue= 100L;  */

        byte mybyte=  74;
        System.out.println(mybyte);
        short myshort= 814;
        System.out.println(myshort);
        int myint= 498;
        System.out.println(myint);
        long mylong= 50000L + 10L * (mybyte + myshort + myint);
        System.out.println(mylong);

    }
}
