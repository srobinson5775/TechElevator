package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolder, String accountNumber){
        super(accountHolder, accountNumber);
    }

    public CheckingAccount(String accountHolder, String accountNumber, int balance){
        super(accountHolder, accountNumber, balance);
    }


    @Override
    public int withdraw(int amountToWithdraw){
        //only if balance less the amount to withdraw > -100 then allow.
        if(getBalance() - amountToWithdraw > -100){
            super.withdraw(amountToWithdraw);

        }//after that condition is checked you need to see
        //if balance falls below 0, assess 10 dollar fee
        if (getBalance() < 0){
            super.withdraw(10);
        }
        return getBalance();
    }



}
