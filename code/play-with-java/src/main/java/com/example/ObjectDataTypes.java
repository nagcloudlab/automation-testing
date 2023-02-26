package com.example;

class Account {

    static int numberOfAccounts=0;
    // State
    String number;
    double balance;
    String holderName;

    Account(String number, String holderName) {
        this.number = number;
        this.holderName = holderName;
        numberOfAccounts++;
    }

    // Behavior
    double getBalance() {
        return this.balance;
    }

}

public class ObjectDataTypes {
    public static void main(String[] args) {

        Account account1=new Account("AB12","Nag");
        Account account2=new Account("AB13","Riya");
        Account account3=new Account("AB14","Diya");

        account2.balance=1000.00;

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println(account3.getBalance());


        System.out.println(Account.numberOfAccounts);

    }
}
