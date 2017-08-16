package com.account;

/**
 * Created by kloupos on 05/01/2017.
 */
public class Main {
    public static void main (String args[]) {
        /*
        1. Create a new class for bank account
        2. Create new fields for account name, balance, customer name, email and phone number
        3. Create getters - setters for each field
        4. Create 2 methods
        -To update balance field
        -To deduct from balance field

         */

//        Account bobsAccount = new Account("12345", 8.5, "Kostas", "kostas@kostas.gr", "2310622452");
//        System.out.println("Initial balance is: "+bobsAccount.getBalance());
//        bobsAccount.withdraw(100.0);
//        bobsAccount.deposit(30.0);
//        bobsAccount.withdraw(20.0);
//        System.out.println(bobsAccount.getBalance());

        /*
        Create a new class VipCustomer
         3 fields, name, credit limit and email
         Create 3 constructors
         1st. Empty should call the constructor with 3 params in default
         2nd. Pass 2 values, third is default
         3rd. Save all fields
         Create getters only for this using code generations
         */

        VipAccount account1 = new VipAccount("Kostas",222.54);
        System.out.println(account1.getEmail());
    }
}
