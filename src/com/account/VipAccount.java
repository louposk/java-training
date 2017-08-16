package com.account;

/**
 * Created by kloupos on 05/01/2017.
 */
public class VipAccount {
    private String name;
    private double limit;
    private String email;

    public VipAccount(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public VipAccount() {
        this("Makis",11.0,"empty@account.gr");
        System.out.println("Empty Vip account created");
    }

    public VipAccount(String name, double limit) {
        this(name, limit, "3parameters@account.gr");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
