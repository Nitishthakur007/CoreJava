package com.company;

public class player {
    public String fullname;
    public int health;
    public String weapon;


     public void loseHealth(int damage){
         this.health = this.health- damage;
         if (this.health <= 0){
             System.out.println("player is Knocked out");
             // reduce the number of lives remaining
         }

     }

     public int healthRemaining(){
         return this.health;
     }
}
