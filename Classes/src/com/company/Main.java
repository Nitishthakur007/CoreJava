package com.company;

public class Main {

    public static void main(String[] args) {
	Car porsche = new Car();
	Car holden = new Car();
	System.out.println("Model is "+porsche.getmodel());
	porsche.setModel("911");
	System.out.println("Model is "+porsche.getmodel());
		porsche.setModel("Carerra");
		System.out.println("Model is "+porsche.getmodel());
    }
}
