package com.company;

public class EnhancPlayer {
    private String name;
    private int hitpoints = 100;
    private String weapon;

    public EnhancPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100){
            this.hitpoints = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitpoints = this.hitpoints - damage;
        if (this.hitpoints <= 0){
            System.out.println("player is Knocked out");
            // reduce the number of lives remaining
        }

    }

    public int getHitpoints() {
        return hitpoints;
    }
}
