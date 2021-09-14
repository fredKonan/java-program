package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName,String accountNumber){
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName,String accountNumber, int balance){
        super(accountHolderName,accountHolderName,balance);
    }

    public int withdraw(int amountToWithdraw){
        if(amountToWithdraw<=0)
            return this.balance;
        if(this.balance-amountToWithdraw>=0)
            return this.balance-=amountToWithdraw;
        if(this.balance-amountToWithdraw>-100)
            return this.balance-=(amountToWithdraw+10);
        else
            return this.balance;
    }

}
