package org.example.service;

import org.example.model.BankAccount;

public interface BankAccountService {

    void createAccount(BankAccount bankAccount);
    void deposit(String accountNumber, double depositAmount);
    void withdraw(String accountNumber, double withdrawAmount);
    void transfer(String fromAccountNumber, String toAccountNumber, double amount);
    BankAccount getBankAccount(String accountNumber);
}