package com.account;

/**
 * Created by kloupos on 05/01/2017.
 */
public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account(String number, double balance, String name, String email, String phone) {
        System.out.println("Creating Account constructor");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit added: "+ depositAmount +" Balance is now: " + this.balance);
    }

    public void withdraw(double depositAmount){
        if(this.balance - depositAmount <= 0) {
            System.out.println(this.balance + " available. Withdraw not accepted");
        } else {
            this.balance -= depositAmount;
            System.out.println("Withdraw of " + this.balance + "processed");
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
