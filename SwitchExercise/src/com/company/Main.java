package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	char mychar = 'E';
	switch (mychar) {
        case 'A':
            System.out.println("Character value is A");
            break;
        case 'B':
            System.out.println("Character value is B");
            break;
        case 'C':case 'D':case 'E':
            System.out.println("Character value is "+ mychar);
            break;

        default:
            System.out.println("Not A, B, C, D and E character");
            break;

    }

    String month = "JaNUaRy";
	switch(month.toLowerCase()){
        case "january":
            System.out.println("Month is " + month);
            break;
        case "june":
            System.out.println("Month is " + month);
            break;

        default:
            System.out.println("Not january an d july");
            break;

    }

    }
}
