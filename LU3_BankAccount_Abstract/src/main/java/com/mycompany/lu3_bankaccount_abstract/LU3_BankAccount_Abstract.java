package com.mycompany.lu3_bankaccount_abstract;

public class LU3_BankAccount_Abstract {

    public static void main(String[] args) {
        // INVALID: Abstract classes cannot be instantiated directly:
        // BankAccount account = new BankAccount("Alex", "000", 1000); // Compile-time Error

        // 1. Instantiate concrete subclasses
        Savings savings = new Savings("Alice", "123", 5000.00);
        Cheque cheque = new Cheque("Bob", "124", 6500.00);
        
        // 2. Execute inherited concrete method (shared logic)
        savings.displayBalance();
        cheque.displayBalance();
        
        // 3. Execute overridden abstract method (subclass-specific logic)
        System.out.println("Savings fee: R" + savings.calculateMonthlyFee());
        System.out.println("Cheque fee: R" + cheque.calculateMonthlyFee());
    }
}