package com.mycompany.candy_app_test_prep_interface;

import javax.swing.JOptionPane; 

public class Candy_App_Test_Prep_Interface {
    public static void main(String[] args) {
        
        // 1. Gather user inputs via graphical dialogs
        String name = JOptionPane.showInputDialog("Enter the candy name:");
        
        // Convert string inputs to numeric data types
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the candy price:"));
        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the candy quantity:"));
        
        String flavour = JOptionPane.showInputDialog("Enter the candy flavour:");
        
        // 2. Instantiate the concrete SweetCandy object
        SweetCandy sweetCandy = new SweetCandy(name, price, qty, flavour);

        /* Polymorphism Example:
         * You can also reference the object using its parent class or interface:
         *   Candy candy = new SweetCandy(name, price, qty, flavour);
         *   ICandy iCandy = new SweetCandy(name, price, qty, flavour);
         */
        
        // 3. Display the final formatted report dialog
        sweetCandy.displayCandyInfo();
    }
}