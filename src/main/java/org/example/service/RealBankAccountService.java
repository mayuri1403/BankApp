package org.example.service;
import java.util.List;
import java.util.ArrayList;
import org.example.model.BankAccount;

 public class RealBankAccountService implements BankAccountService{

    private List<BankAccount> account=new ArrayList<>();
    @Override
    public void createAccount(BankAccount bankAccount) {
        account.add(bankAccount);
        System.out.println("Account Created: "+bankAccount);
    }

    @Override
    public void deposit(String accountNumber, double depositAmount) {
        BankAccount account=this.findAccount(accountNumber);
        if(account!=null) {
            account.setBalance(account.getBalance()+depositAmount);
            System.out.println("Deposited:"+depositAmount);
        }
        else {
            System.out.println("Account not found");
        }
    }

    @Override
    public void withdraw(String accountNumber, double withdrawAmount) {
        BankAccount account=this.findAccount(accountNumber);
        if(account!=null) {
            account.setBalance(account.getBalance()-withdrawAmount);
            System.out.println("Withdraw "+withdrawAmount+" in "+accountNumber);
        }
        else {
            System.out.println("Account not found");
        }

    }

    @Override
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        BankAccount fromAccount=this.findAccount(fromAccountNumber);
        BankAccount toAccount=this.findAccount(toAccountNumber);

        if(fromAccount!=null && toAccount!=null) {
            fromAccount.setBalance(fromAccount.getBalance()-amount);
            toAccount.setBalance(toAccount.getBalance()+amount);
            System.out.println("Transferred"+amount+"from"+fromAccountNumber+"to"+toAccountNumber);
        }
        else {
            if(fromAccountNumber!=null) {
                System.out.println("from account not found");
            }else if(toAccountNumber!=null){
                System.out.println("to account not found");
            }
        }

    }

    @Override
    public BankAccount getBankAccount(String accountNumber) {
        BankAccount account=this.findAccount(accountNumber);
        if(account!=null) {
            return account;
        }else {
            System.out.println("Account not found");
            return null;
        }

    }

    private BankAccount findAccount(String accountNumber){
        // TODO Auto-generated method stub
        for(BankAccount acc:account) {
            if(acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

}
