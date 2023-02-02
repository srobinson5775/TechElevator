package com.techelevator;

public class BankAccount {
//properties
    private String accountHolderName;
    private String accountNumber;
    private int balance;
//constructor 1
    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;//intital balance
    }
//constructor 2
    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }

    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }

}
