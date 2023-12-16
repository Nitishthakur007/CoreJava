package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousresult = result;
        result = result - 1;
        System.out.println(previousresult + " - 1 = " + result);

        previousresult= result;
        result= result * 10;
        System.out.println(previousresult + " * 10 = " + result);

        previousresult= result;
        result= result/5;
        System.out.println(previousresult + " / 5 = " + result);

        previousresult= result;
        result = result % 3;
        System.out.println(previousresult + " % 3 = " + result);

        previousresult= result;
        result= result + 1;
        System.out.println("Result is now : " + result);
        result++;
        System.out.println("Result is now : " + result);
        result--;
        System.out.println("Result is now : " + result);

        result += 2;
        System.out.println("Result is now : " + result);

        result *= 10;
        System.out.println("Result is now : " + result);

        result -= 10;
        System.out.println("Result is now : " + result);

        result /= 10;
        System.out.println("Result is now : " + result);


        boolean isalien= false;
        if (isalien == false)
            System.out.println("It is not an alien");

        int topScore = 80;
        if(topScore <= 100)
            System.out.println("you got the high score");

        int secondtopscore = 81;
        if ((topScore > secondtopscore) && (topScore < 100))
            System.out.println("greater than  second top score and less than 100");

        if ((topScore > 90) || (secondtopscore <= 90))
            System.out.println("One of these test is true");

        int newvalue = 50;
        if(newvalue==50)
            System.out.println("This is true");

        boolean iscar= false;
        if (iscar)
            System.out.println("This is not supposed to happen");


        iscar=true;
        boolean wascar = iscar ? true : false;
        if(wascar)
            System.out.println("wascar is true");



        double mydouble1 = 20;
        double mydouble2 = 80;
        double result1= (mydouble1 + mydouble2) * 25;
        System.out.println("Result1 is: " + result1);
        double result2= result1 % 40;
        System.out.println("the remainder is: " + result2);
        if (result2 <=20)
            System.out.println("Total was over the limit");



    }
}
