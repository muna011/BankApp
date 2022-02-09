package com.example.bank_app;

public class BankApp {
    public static void main(String[] args) {

        BankAccount customerAcct = new BankAccount(6000, 6000);
//      System.out.println(customerAcct.getCheckingBalance());
//      System.out.println(customerAcct.getSavingsBalance());
//      customerAcct.savingsWithdrawal(5000);
//      customerAcct.savingsWithdrawl(500);
//      System.out.println(customerAcct.getCheckingBalance());
//      System.out.println(customerAcct.getSavingsBalance());
//      customerAcct.transferToChecking(5000); //c: 11000, s: 1000
//      customerAcct.transferToSavings(7000); //c 2000, s 10000
//        customerAcct.checkingDeposit(100000); //106,000
        customerAcct.savingsDeposit(200000);//206,000
    }
}
