package com.company;

public class VipCustomer {
    private  String  Name;
    private double CreditLimit;
    private String Email;


    public VipCustomer(){
        this("default_name", 10000, "Default_Email");
        System.out.println("Empty Constructor Called.");
    }

    public VipCustomer(double creditLimit, String email) {
        this("Nitish", creditLimit,email);
    }

    public VipCustomer(String name, double creditLimit, String email) {
        Name = name;
        CreditLimit = creditLimit;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmail() {
        return Email;
    }
}
