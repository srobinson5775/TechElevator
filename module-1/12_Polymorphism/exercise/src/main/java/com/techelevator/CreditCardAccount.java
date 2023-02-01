package com.techelevator;

public class CreditCardAccount implements Accountable{
    private String accountHolder;
    private String accountNumber;
    int debt = 0;

    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    int pay(int amountToPay){
        getBalance()

        return newTotalAmountOwed;
    }

}
