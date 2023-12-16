package com.company;

public class Main {

    public static void main(String[] args) {
	    String mystring = "This is string";
        System.out.println(mystring);
        mystring= mystring + " and this is more";
        System.out.println(mystring);
        mystring = mystring + '\u00ae';
        System.out.println(mystring);

        String numberstring = "255.55";
        numberstring= numberstring + "49.05";
        System.out.println(numberstring);

        String laststring="10";
        int myint=50;
        laststring = laststring + myint;
        System.out.println(laststring);

    }
}
