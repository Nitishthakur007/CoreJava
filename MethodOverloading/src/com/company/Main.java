package com.company;

public class Main {

    public static void main(String[] args) {
       int newscore= calculateScore("Nitish", 500);
        System.out.println("New score is: " + newscore );
        calculateScore(75);
        calculateScore();

        }

    public static int calculateScore(String playerName, int score){
        System.out.println("player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore( int score){
        System.out.println("Unnamed player "  + "scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player scored no points");
        return 0;
    }
}
