package com.src.zen.JavaPractices.task02;

public class Account {
    private double balance;

    public Account() {
        balance = 0;
    }

    public Account(double initialeAmountdeposited) {
        balance = initialeAmountdeposited;
    }

    public static void main(String[] args) {
        Account account = new Account(100);
        account.deposit(2000);
        account.currentBalance();
        account.withdraw(200);
        account.currentBalance();
        account.withdraw(20000);

    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void withdraw(int withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
        } else {
            System.out.println("Insufficient Balance Amount");
        }
    }

    public void currentBalance() {
        System.out.println("Current Balance : " + balance);
    }

}
