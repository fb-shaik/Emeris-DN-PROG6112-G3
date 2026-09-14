package com.mycompany.lu4_assertdemo;

import java.util.Scanner; 
public class LU4_AssertDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Assert Demo
        int age = 20;
        System.out.println("Age: " + age);
        
        //Programmer will assume age should never be negative
        assert age >=0 : "Age cannot be negative";
        System.out.println("Assert passed");
        
        //Exception Demo
        System.out.println("\nEnter a number to divide 100 by: ");
        int number = input.nextInt(); //capture & store the user provided value
        
        try
        {
                int answer = 100 / number;
                System.out.println("Answer: " + answer);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught!");
            System.out.println("You cannot divide by zero!");
        }
        
        input.close();
    }
}
/*
Assertion in Java 
- Used to check an assumption made by the developer/programmer
- Keyword: assert

eg.
int age = 20;
assert age >= 0; 

If the condition is true, the program runs normally
If the condition is false, Java throws an AssertionError

- mainly used for debugging/development purposes
- assert is by default disabled / switch-off

Exception (cannot be switched off - seen by the user)
- problems that occur while the program is running & this allows for an alternate
  run of the program to happen & course correct
*/