
package com.mycompany.lu_paymentapp_interface;


public class PayPal  implements iPayment
{

    @Override
    public void processPayment(double amount) 
    {
        //PayPal specific payment processing logic
        System.out.println("Processing a PayPal payment for R: " + amount);
    }

    @Override
    public String getPaymentStatus() 
    {
        return "PayPal payment was not successful!";
    }
    
    
}
