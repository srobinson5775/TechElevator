package com.techelevator;

public class BankingAppDemo {
    //makes it runnable psvm
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Tony Stark", "123456");
        //bankAccount.getAccountHolderName() = "Mistaken Person";//you want to prevent direct access


        System.out.println(bankAccount.getAccountHolderName());

        BankAccount checkingAccount = new CheckingAccount("Tony Stark", "123456C", 500);
        bankAccount.withdraw(100);

        System.out.println(bankAccount.getBalance());
    }


}
