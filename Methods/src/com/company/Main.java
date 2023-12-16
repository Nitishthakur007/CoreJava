package com.company;

public class Main {

    public static void main(String[] args) {

        int highscore = calculatescore(true, 800,5, 100);
        System.out.println("Your final score was : " + highscore);

        highscore = calculatescore(true, 10000, 8, 200);
        System.out.println("Your final score was : " + highscore);

        int highscoreposition = calculateHighScorePosition(1500);
        displayHighScorePosition("Nitish",highscoreposition);

        highscoreposition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim",highscoreposition);

        highscoreposition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob",highscoreposition);

        highscoreposition = calculateHighScorePosition(50);
        displayHighScorePosition("smith",highscoreposition);


        // CORNER CASES can caused bugs

        highscoreposition = calculateHighScorePosition(1000);
        displayHighScorePosition("luis",highscoreposition);

        highscoreposition = calculateHighScorePosition(500);
        displayHighScorePosition("harry",highscoreposition);

        highscoreposition = calculateHighScorePosition(100);
        displayHighScorePosition("mathew",highscoreposition);

        highscoreposition = calculateHighScorePosition(99);
        displayHighScorePosition("tom",highscoreposition);










    }
    public static int calculatescore(boolean gameover, int score, int levelCompleted, int bonus){
        if (gameover) {
            int finalscore = score + (levelCompleted * bonus);
            finalscore += 2000;

            return finalscore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playername, int position){
        System.out.println(playername + " managed to get into position " + position + " On the high score table" );
    }

    public static int calculateHighScorePosition(int PlayerScore){
        /*if (PlayerScore >= 1000){
            return 1;
        }else if(PlayerScore >= 500 ) {
            return 2;
        }else if(PlayerScore >= 100) {
            return 3;
        }
        return 4;*/

        int position = 4; //assuming position 4 will be returned
        if (PlayerScore >= 1000) {
            position = 1;
        }else if (PlayerScore >= 500){
            position = 2;
        }else if(PlayerScore >= 100){
            position = 3;
        }
        return  position;
    }
}
