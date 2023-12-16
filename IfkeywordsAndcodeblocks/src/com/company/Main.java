package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	boolean gameover = true;
	int score = 800;
	int levelCompleted = 5;
	int bonus = 100;

	/*if(score < 5000 && score > 1000) {
		System.out.println("your score was less than 5000 but greater than 1000");
	}
	else if(score < 1000){
		System.out.println("your score was less than 1000");
	}
	else {
		System.out.println("got here");
	}*/


	if (gameover){
		int finalscore = score + (levelCompleted * bonus);
		System.out.println("Your final score was : " + finalscore);
	}

	/*boolean gameover1 = true;
	int score2 = 10000;
	int level = 8;
	int bonus2 = 200;

		if (gameover1){
			int finalscore = score2 + (level * bonus2);
			System.out.println("Your final score was : " + finalscore);
		}
*/

		gameover = true;
		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		if (gameover) {
			int finalscore = score + (levelCompleted * bonus);
			System.out.println("Your final score was : " + finalscore);
		}
    }
}
