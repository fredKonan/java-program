package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<Accountable>();

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Accountable[] getAccounts() {
        Accountable[] newArrays= new Accountable[accounts.size()];
        for(int i=0; i<accounts.size();i++){
            newArrays[i]=accounts.get(i);
        }
        return newArrays;
    }

    public void addAccount(Accountable newAccount){
       accounts.add(newAccount);
    }

    public int getBalance(){
        int finalBalance =0;
        for(int i=0;i<this.getAccounts().length;i++){
            finalBalance+=getAccounts()[i].getBalance();
        }
        return finalBalance;
    }

    public boolean isVip(){
        return getBalance()>=25000 ? true: false;
    }
}
