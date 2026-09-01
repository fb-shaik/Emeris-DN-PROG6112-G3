
package com.mycompany.lu_paymentapp_interface;

//Syntax: public class ClassName implements InterfaceName
public class CreditCardPayment implements iPayment {

    @Override
    public void processPayment(double amount)
    {
        //Credit-Card specific payment processing logic
        System.out.println("Processing credit card payment for R: " + amount);
    
    }

    @Override
    public String getPaymentStatus() 
    {//This method is specific to the Credi Card class
        return "Credit Card payment successful!";
    }
    
}
/*
    CreditCard implements the iPayment Interface
    By writing: implements iPayment
- We are telling Java that this class will provide method implementations 
   for methods declared inside of iPayment 

*/
