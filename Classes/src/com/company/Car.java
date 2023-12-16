package com.company;

import java.util.Locale;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    // Method setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carerra") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }


    }
    // getter
    public String getmodel(){
        return this.model;
    }

}
