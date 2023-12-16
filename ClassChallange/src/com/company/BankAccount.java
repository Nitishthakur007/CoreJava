package com.company;

public class BankAccount {

    // Fields
    public String AccountNumber;
    public double Balance;
    public  String CustomerName;
    public  String Email;
    public String PhoneNumber;


    //Empty Constructor
    public BankAccount(){
        System.out.println("Empty Constructor called");
    }


    // Constructor with Parameters
    public BankAccount(String AccountNumber, double Balance,
                       String CustomerName, String Email, String PhoneNumber){
        System.out.println("Account Constructor With Parameters Called");
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        this.CustomerName = CustomerName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;


    }

// Method
    public void Deposit(double Amount){
        this.Balance += Amount;
        System.out.println("Deposit of " + Amount + " is Successful. " +
                "New balance is: " + this.Balance);

    }


    // Method
    public  void withdrawl(double WithdrawlAmount){
        if(this.Balance - WithdrawlAmount < 0){
            System.out.println("Only " + this.Balance + " available. Withdrawl ot Processed due to insuffifient Balance");
        }else {
            this.Balance -= WithdrawlAmount;
            System.out.println("WithDrawl of " + WithdrawlAmount +
                    " successful, Your new balance: " + this.Balance);
        }
    }


    // Getters and Setters
    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


}
