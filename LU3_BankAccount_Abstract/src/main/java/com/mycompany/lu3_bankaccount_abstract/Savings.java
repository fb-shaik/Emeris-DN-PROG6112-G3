package com.mycompany.lu3_bankaccount_abstract;

/**
 * Concrete subclass representing a Savings account.
 * Inherits attributes and methods from BankAccount.
 */
public class Savings extends BankAccount {

    /**
     * Passes account details to the parent (BankAccount) constructor using super().
     */
    public Savings(String accountHolder, String accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    /**
     * Implements the inherited abstract method specifically for Savings accounts.
     */
    @Override
    public double calculateMonthlyFee() {
        return 20.00; // Fixed monthly fee for Savings accounts
    }
}