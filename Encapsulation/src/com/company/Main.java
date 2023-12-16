package com.company;

public class Main {

    public static void main(String[] args) {
	/*player Player = new player();
	Player.name= "Nitesh";
	Player.health= 20;
	Player.weapon="sword";

	int damage = 10;
	Player.loseHealth(damage);
        System.out.println("Remaining health : " + Player.healthRemaining());


		Player.loseHealth(11);
		Player.health= 200;
		System.out.println("Remaining health : " + Player.healthRemaining());
*/

        EnhancPlayer player = new EnhancPlayer("nitish",20,"Sword");
        System.out.println("initial health is " + player.getHitpoints());
	}
}
