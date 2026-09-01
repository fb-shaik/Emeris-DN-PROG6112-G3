
package com.mycompany.lu_paymentapp_interface;

public interface iPayment 
{
    //Abstract Method 1 - Process Payment
    public  void processPayment(double amount);
    //Any concrete class implementing iPayment must proivde the method body for
    //processPayment() that accepts a parameter of double data-type
    
    //Abstract Method 2 - PaymentStatus
    public abstract String getPaymentStatus();
    //Any concrete class implementing iPayment must provide a method 
    //called getPaymentStatus() that returns a String 
    
}
/*
INTERFACE: iPayment
- An interface defines a contract/common expectations 
- It tells the implementing classes which behaviour/methods they are required to provide
- In this program we have 3 payment types: 
    - Credit Card
    - PayPal
    - Cryptocurrency
-Each of the above processes payments differently, they all need to perform the same basic behaviours
    - process payment
    - return payment status
- Abstract methods are used along with interfaces, given that an 
    abstract method has no implementation (no method body) attached to it

*/
