package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();


    public Accountable[] getAccounts() {
        return this.accounts.toArray((new Accountable[this.accounts.size()]));
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }

    public boolean isVip() {

        int totalBalance = 0;

        for (Accountable account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance >= 25000;

    }

}