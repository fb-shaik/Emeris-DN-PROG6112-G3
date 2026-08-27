package com.mycompany.lu3_bankaccount_abstract;

/**
 * Concrete subclass representing a Cheque/Current account.
 * Inherits attributes and methods from BankAccount.
 */
public class Cheque extends BankAccount {

    /**
     * Passes account details to the parent (BankAccount) constructor using super().
     */
    public Cheque(String accountHolder, String accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    /**
     * Implements the inherited abstract method specifically for Cheque accounts.
     */
    @Override
    public double calculateMonthlyFee() {
        return 50.00; // Fixed monthly fee for Cheque accounts
    }
}