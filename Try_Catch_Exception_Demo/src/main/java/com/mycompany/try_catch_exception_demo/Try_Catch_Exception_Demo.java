package com.mycompany.try_catch_exception_demo;

import java.util.Scanner;

public class Try_Catch_Exception_Demo {

    // Global Scanner instance for reading console inputs across all methods
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Flag to control the menu loop lifecycle
        boolean running = true;

        System.out.println("=== TRY-CATCH DEMO APPLICATION ===");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Basic Try-Catch (ArithmeticException)");
            System.out.println("2. Array Index Out Of Bounds Exception");
            System.out.println("3. Null Pointer Exception");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            try {
                // Parse input to integer; throws NumberFormatException if user enters non-numeric text
                int choice = Integer.parseInt(input.nextLine().trim());

                switch (choice) {
                    case 1:
                        basicTryCatch();
                        break;
                    case 2:
                        arrayOutOfBound();
                        break;
                    case 3:
                        nullPointerException();
                        break;
                    case 0:
                        running = false;
                        System.out.println("Good-bye!");
                        break;
                    default:
                        System.out.println("Invalid selection. Please choose an option between 0 and 3.");
                }
            } catch (NumberFormatException e) {
                // Catches non-numeric inputs for the menu selection gracefully
                System.out.println("Input Error: Please enter a valid number from the menu.");
            }
        }

        // Close the scanner resource when the application finishes
        input.close();
    }

    /**
     * Demonstrates handling ArithmeticException (divide by zero)
     * and NumberFormatException during user input parsing.
     */
    static void basicTryCatch() {
        System.out.println("\n--- Basic Try/Catch (Division) ---");

        try {
            System.out.print("Enter numerator (first number): ");
            int a = Integer.parseInt(input.nextLine().trim());

            System.out.print("Enter denominator (second number): ");
            int b = Integer.parseInt(input.nextLine().trim());

            // Protected code: division will throw ArithmeticException if b == 0
            int result = a / b;
            System.out.println("Result: " + a + " / " + b + " = " + result);

        } catch (ArithmeticException e) {
            // Triggered when attempting to divide an integer by zero
            System.out.println("Arithmetic Error: Cannot divide by zero.");
            System.out.println("Reason: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Triggered if the user inputs non-numeric characters for 'a' or 'b'
            System.out.println("Input Error: Please enter valid integers.");
        }
    }

    /**
     * Demonstrates handling ArrayIndexOutOfBoundsException
     * when accessing an index outside the valid array range.
     */
    static void arrayOutOfBound() {
        System.out.println("\n--- Array Index Out Of Bounds Demo ---");

        int[] numbers = {10, 24, 56, 78, 90}; // Valid indices: 0 through 4

        try {
            int requestedIndex = 10;
            System.out.println("Attempting to access index " + requestedIndex + " of an array with length " + numbers.length + "...");
            
            // Protected code: index 10 exceeds the array bounds (0-4)
            int value = numbers[requestedIndex];
            System.out.println("Value at index: " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Triggered when an illegal array index is accessed
            System.out.println("Array Error: Index does not exist.");
            System.out.println("Detailed Message: " + e.getMessage());
        }
    }

    /**
     * Demonstrates handling NullPointerException
     * when invoking methods or properties on an uninitialized/null reference.
     */
    static void nullPointerException() {
        System.out.println("\n--- Null Pointer Exception Demo ---");

        String text = null; // Unassigned reference pointing to nothing

        try {
            System.out.println("Attempting to call .length() on a null String reference...");

            // Protected code: calling an instance method on 'null' will throw NullPointerException
            int length = text.length();
            System.out.println("Length of text: " + length);

        } catch (NullPointerException e) {
            // Triggered when accessing members of a null object reference
            System.out.println("Null Error: The object reference is null; operation cannot be performed.");
            System.out.println("Detailed Message: " + e.getMessage());
        }
    }
}