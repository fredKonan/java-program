package com.techelevator;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountHolderName, String accountNumber){
        super(accountHolderName,accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber,int balance){
        super(accountHolderName, accountNumber,balance);
    }

    public int withdraw(int amountToWithDraw) {
        if(amountToWithDraw<0)
            return this.balance;
        if(this.balance-amountToWithDraw>=150)
            return this.balance-=amountToWithDraw;
        if(this.balance-amountToWithDraw<150 &&this.balance-amountToWithDraw>=0)
            return this.balance-=(amountToWithDraw+2);
        else
            return this.balance;
    }
}
