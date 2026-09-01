
package com.mycompany.lu_paymentapp_interface;


public class Cryptocurrency  implements iPayment
{

    @Override
    public void processPayment(double amount) {
        //Crypto specific payment processing logic
        System.out.println("Processing Crypto payment for R: " + amount);
  }

    @Override
    public String getPaymentStatus() {
        return "Cryptocurrency payment successful!"; 
    }
    
}
