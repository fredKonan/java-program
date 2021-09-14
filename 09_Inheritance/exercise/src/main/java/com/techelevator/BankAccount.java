package com.techelevator;

public class BankAccount {
    private   String accountHolderName;
    private  String accountNumber;
    protected int balance=0; ;


    public BankAccount(String accountHolderName, String accountNumber, int balance){
        this.accountHolderName= accountHolderName;
        this.accountNumber= accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }


    public int getBalance() {
        return this.balance;
    }

    public  String getAccountHolderName(){
        return this.accountHolderName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int deposit(int amountToDeposit){
        return balance +=amountToDeposit;
    }

    public int withdraw(int amountToWithdraw){
        return (balance -= amountToWithdraw);
    }

}

