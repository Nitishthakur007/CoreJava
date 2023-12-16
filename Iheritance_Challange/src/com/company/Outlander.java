package com.company;

public class Outlander extends Car{
    private int roadServiceMonths;

    public Outlander( int roadServiceMonths) {
        super("Outlander", "4WD", 5,5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int NewVelocity = getCurrentVelocity() + rate;
        if(NewVelocity == 0){
            stop();
            changeGear(1);
        }else if (NewVelocity > 0 && NewVelocity <=10){
            changeGear(1);
        }else if (NewVelocity > 10 && NewVelocity <=20) {
            changeGear(2);
        }else if (NewVelocity > 20 && NewVelocity <=30) {
            changeGear(3);
        }else if (NewVelocity > 30 && NewVelocity <=40) {
            changeGear(4);
        }else if (NewVelocity > 40 && NewVelocity <=60) {
            changeGear(5);
        }else{
            changeGear(6);
        }

        if(NewVelocity>0){
            changeVelocity(NewVelocity,getCurrentDirection());
        }
    }
}
