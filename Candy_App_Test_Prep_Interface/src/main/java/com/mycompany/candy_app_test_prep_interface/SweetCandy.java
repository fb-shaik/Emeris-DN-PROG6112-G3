package com.mycompany.candy_app_test_prep_interface;

import javax.swing.JOptionPane;

// Concrete class extending the abstract Candy class
public class SweetCandy extends Candy {
    
    // Specialized field unique to SweetCandy
    String flavour;

    // Constructor: Uses super() to initialize base Candy attributes
    public SweetCandy(String name, double price, int quantity, String flavour) {
        super(name, price, quantity); // Calls the parent constructor in Candy
        this.flavour = flavour;
    }

    // Getter for the specialized field
    public String getFlavour() {
        return flavour;
    }
    
    // Implements the abstract displayCandyInfo() method required by ICandy
    @Override
    public void displayCandyInfo() {
        String report = "CANDY INFORMATION\n" +
                        "------------------------------------------\n\n" +     
                        "CANDY NAME: " + getName() + "\n" +
                        "PRICE: R" + String.format("%.2f", getPrice()) + "\n" +
                        "QUANTITY: " + getQuantity() + "\n" +
                        "FLAVOUR: " + getFlavour() + "\n\n" +
                        "------------------------------------------";
        
        // Displays formatted report using a GUI popup dialog
        JOptionPane.showMessageDialog(null, report, "Candy Information", JOptionPane.INFORMATION_MESSAGE);
    }
}