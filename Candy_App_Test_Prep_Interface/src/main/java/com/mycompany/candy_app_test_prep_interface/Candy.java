package com.mycompany.candy_app_test_prep_interface;

// Abstract Class: Cannot be instantiated directly with 'new Candy()'.
// It implements ICandy, passing the obligation of displayCandyInfo() down to its subclasses.
public abstract class Candy implements ICandy {
    
    // Instance variables shared by all candies
    String name;      // Name of the candy
    double price;     // Unit price
    int quantity;     // Stock quantity on hand

    // Parameterized constructor to initialize common fields
    public Candy(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Standard getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}