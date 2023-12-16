package com.company;

public class Main {

    public static void main(String[] args) {
	    VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer(20000, "person2@mail.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("rahul", 50000, "Rahul@mail.com");
        System.out.println(person3.getName());



    }
}
