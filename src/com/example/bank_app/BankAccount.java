package com.example.bank_app;


public class BankAccount {
        private double checkingBalance = 0.00;
        private double savingsBalance = 0.00;
        private final double checkingOpeningDeposit;
        private final double savingsOpeningDeposit;

        public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit) {
            this.checkingOpeningDeposit = checkingOpeningDeposit;
            this.savingsOpeningDeposit = savingsOpeningDeposit;
            checkingBalance += this.checkingOpeningDeposit;
            savingsBalance += this.savingsOpeningDeposit;
        }

        public double getCheckingBalance() {
            return checkingBalance;
        }

        public double getSavingsBalance() {
            return savingsBalance;
        }

        public void checkingWithdrawl(double withdrawalAmount) {
            if (checkingBalance < withdrawalAmount) {
                System.out.println("Your account is insufficient for this transaction.");
                if (savingsBalance > withdrawalAmount) {
                    System.out.println("You need to do a balance transfer first.");
                }
            } else if (checkingBalance > withdrawalAmount) {
                checkingBalance -= withdrawalAmount;
            }
        }

        public void savingsWithdrawal(double withdrawalAmount) {
            if (savingsBalance < withdrawalAmount) {
                System.out.println("Your account is insufficient for this transaction.");
                if (checkingBalance > withdrawalAmount) {
                    System.out.println("You need to do a balance transfer first.");
                }
            } else if (savingsBalance > withdrawalAmount) {
                savingsBalance -= withdrawalAmount;
            }
         }

         public void transferToChecking(double transferAmount) {
            if (savingsBalance > transferAmount) {
                savingsBalance -= transferAmount;
                checkingBalance += transferAmount;
                System.out.println("Your transaction is successful.");
                System.out.println("Your new savings balance is: " + getSavingsBalance());
                System.out.println("Your new checking balance is: " + getCheckingBalance());
            } else if (savingsBalance < transferAmount) {
                System.out.println("Your account is insufficient for this transaction.");
            }
         }


    public void transferToSavings(double transferAmount) {
        if (checkingBalance > transferAmount) {
            checkingBalance -= transferAmount;
            savingsBalance += transferAmount;
            System.out.println("Your transaction is successful.");
            System.out.println("Your new checking balance is: " + getCheckingBalance());
            System.out.println("Your new savings balance is: " + getSavingsBalance());
        } else if (checkingBalance < transferAmount) {
            System.out.println("Your account is insufficient for this transaction.");
        }
    }


    public void checkingDeposit(double depositAmount) {
            checkingBalance += depositAmount;
            System.out.println("Your new checking balance is: " + getCheckingBalance());
    }

    public void savingsDeposit(double depositAmount) {
        savingsBalance += depositAmount;
        System.out.println("Your new savings balance is: " + getSavingsBalance());
    }





}
