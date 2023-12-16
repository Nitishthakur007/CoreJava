package com.company;

public class Main {

    public static void main(String[] args) {
    BankAccount Action = new BankAccount("12345", 0.00, "Nitish Thakur",
            "Nitishthakur@gmail.com", "0214085-02834-8");
    Action.Deposit(50);
    Action.withdrawl(100);
    Action.Deposit(50);
    Action.withdrawl(100);
    System.out.println(Action.getCustomerName());
    }
}
