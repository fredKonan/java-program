package com.techelevator;

public class CreditCardAccount implements Accountable{
    private String accountHolder;
    private String accountNumber;
    protected int debt =0;

    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountHolder= accountHolder;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance(){
        return -getDebt();
    }
    public int getDebt() {
        return debt;
    }

    public int pay(int amountToPay){
        return debt-=amountToPay;

    }

    public int charge (int amountToCharge){
            return debt+=amountToCharge;
    }

}
