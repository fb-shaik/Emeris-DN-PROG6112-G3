package com.mycompany.lu3_bankaccount_abstract;

/**
 * Superclass representing a generic bank account.
 * 
 * CORE OOP CONCEPTS:
 * - Abstract Class: Acts as a blueprint for subclasses (Savings, Cheque). It cannot 
 *   be instantiated directly (i.e., you cannot do 'new BankAccount()').
 * - Common State: All accounts share accountHolder, accountNumber, and balance.
 * - Abstract Methods: Forces all derived subclasses to provide their own 
 *   specific implementation (e.g., calculateMonthlyFee).
 * - Concrete Methods: Provides shared, reusable behavior (e.g., displayBalance).
 */
public abstract class BankAccount {
    // Instance variables shared by all account types
    String accountHolder; 
    String accountNumber; 
    double balance;       

    /**
     * Initializes common account attributes.
     */
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    /**
     * Abstract method: Declares the contract for fee calculation without a body.
     * Syntax: accessSpecifier abstract returnType methodName();
     * Every concrete subclass MUST implement this method.
     */
    public abstract double calculateMonthlyFee();
    
    /**
     * Concrete method: Provides a default implementation shared by all subclasses.
     */
    public void displayBalance() {
        System.out.println("Balance: R" + balance);
    }
}