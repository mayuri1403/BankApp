package org.example;
import org.example.model.BankAccount;
import org.example.service.BankAccountService;
import org.example.service.RealBankAccountService;

class Main {
    public static void main(String[] args) {

        BankAccountService service=new RealBankAccountService();

        BankAccount account1=new BankAccount("Mayuri","123456",75000);
        BankAccount account2=new BankAccount("Jane Smith","123412",75000);
        service.createAccount(account1);
        service.createAccount(account2);

        service.deposit("123456", 500);
        System.out.println(account1);
        service.withdraw("123412", 500);
        System.out.println(account2);


        System.out.println("Hello Mayuri");
        /* System.out.println("Account Details: "+account);

         //deposit money
         account.setBalance(account.getBalance()+5000);
         System.out.println("Balance is now: "+account.getBalance());

         //withdraw money
         account.setBalance(account.getBalance()-5000);
         System.out.println("Balance is now: "+account.getBalance());*/
    }
}
