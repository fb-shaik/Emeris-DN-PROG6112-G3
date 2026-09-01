
package com.mycompany.lu_paymentapp_interface;


public class LU3_PaymentApp_Interface {

    public static void main(String[] args) {
        
        CreditCardPayment creditCard = new CreditCardPayment();
        
        iPayment payPal = new PayPal(); // also creates an object for the PayPal class
        
        iPayment crypto = new Cryptocurrency();
        
        creditCard.processPayment(1000.00);
        System.out.println(creditCard.getPaymentStatus());
        
        payPal.processPayment(5000);
        System.out.println(payPal.getPaymentStatus());
        
        crypto.processPayment(100000);
        System.out.println(crypto.getPaymentStatus());
    }
}
/*
LU3 - Interfaces
 - Essentially a contract for behaviour
 - It does not describe exactly how something works
 - It describe what something must be able to do
 - We will always prefix the interface name with i
 - It tells the implementing classes which behaviours/methods
    they are required to provide
    
 Keyword: implements
 
*/