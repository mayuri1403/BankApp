package org.example.model;

public class BankAccount {

    private String accountName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance="+balance+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj!=null||getClass()!=obj.getClass()) return false;;

        BankAccount that = (BankAccount)obj;
        return this.accountNumber.equals(that.accountNumber);



















    }
}