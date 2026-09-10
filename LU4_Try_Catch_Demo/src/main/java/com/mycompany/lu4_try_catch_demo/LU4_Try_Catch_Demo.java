package com.mycompany.lu4_try_catch_demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LU4_Try_Catch_Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 500.00;

        try {
            System.out.println("===== SIMPLE ATM =====");
            System.out.printf("Current Balance: R%.2f%n", balance);
            System.out.print("Enter the amount you wish to withdraw: ");

            // Can throw InputMismatchException if the user enters non-numeric input
            double amount = input.nextDouble();

            // Business rule validation using manual exception triggering (throw)
            if (amount <= 0) {
                // Throws an exception caught directly by the catch(IllegalArgumentException) block
                throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
            }

            // Check if account has sufficient funds
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds. You cannot withdraw more than your balance.");
            }

            // Proceed with withdrawal if all checks pass
            balance -= amount;
            System.out.println("Withdrawal Successful!");
            System.out.printf("New Balance: R%.2f%n", balance);

        } catch (InputMismatchException e) {
            // Handles incorrect data types (e.g., entering "fifty" instead of 50)
            System.out.println("Error: Invalid input format. Please enter numeric values only.");

        } catch (IllegalArgumentException e) {
            // Handles user-defined domain logic failures triggered via throw
            System.out.println("Transaction Error: " + e.getMessage());

        } catch (Exception e) {
            // Fallback for any other unexpected runtime exceptions
            System.out.println("Unexpected Error: " + e.getMessage());

        } finally {
            // This block runs unconditionally to ensure clean resource disposal
            System.out.println("ATM session closed.");
            input.close();
        }
    }
}

/* ==========================================================================
   LEARNING UNIT 4: EXCEPTIONS AND ERROR HANDLING
   ==========================================================================

   1. ERRORS vs. EXCEPTIONS
   --------------------------------------------------------------------------
   - Errors:
       * Subclasses of java.lang.Error.
       * Represent severe, catastrophic system-level problems.
       * Applications cannot recover from them (e.g., OutOfMemoryError, StackOverflowError).
   - Exceptions:
       * Subclasses of java.lang.Exception.
       * Represent anomalous runtime events that a program can foresee, catch, and handle
         gracefully (e.g., user typo, missing file, illegal calculation).

   2. TRY - CATCH - FINALLY FLOW
   --------------------------------------------------------------------------
   - try:
       * Encloses code that carries a risk of throwing an exception during execution.
   - catch (SpecificException e):
       * Intercepts a particular exception type and executes recovery code.
       * Must be arranged from most specific (subclasses) to most general (parent classes).
   - finally:
       * Executes whether an exception was thrown or not.
       * Used for clean-up tasks (releasing database connections, closing scanner streams, etc.).

   3. 'throw' vs. 'throws'
   --------------------------------------------------------------------------
   - throw:
       * Action keyword used inside a method body to explicitly generate and dispatch an exception:
         e.g., throw new IllegalArgumentException("Invalid amount");
   - throws:
       * Method signature keyword that alerts calling code that the method might propagate 
         a checked exception without catching it internally:
         e.g., public void readFile(String path) throws IOException { ... }
   ========================================================================== */