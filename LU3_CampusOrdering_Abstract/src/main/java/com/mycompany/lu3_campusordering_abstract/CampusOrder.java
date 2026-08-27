package com.mycompany.lu3_campusordering_abstract;

/**
 * Superclass representing a generic campus food order[cite: 5].
 * 
 * CORE OOP CONCEPTS:
 * - Encapsulation: Fields are kept private to protect data integrity, accessible 
 *   only through public getter methods[cite: 5].
 * - Abstract Class: Defines the baseline attributes for any order but cannot be 
 *   instantiated directly[cite: 5].
 * - Abstract Method: Declares calculateFinalPrice() to ensure that every subclass 
 *   provides its own pricing calculation[cite: 5].
 */
public abstract class CampusOrder {
    // Encapsulated fields shared across all campus orders[cite: 5]
    private String studentName;
    private String foodItem;
    private double price;

    /**
     * Initializes the common order attributes[cite: 5].
     */
    public CampusOrder(String studentName, String foodItem, double price) {
        this.studentName = studentName;
        this.foodItem = foodItem;
        this.price = price;
    }

    // --- Getter Methods ---[cite: 5]

    public String getStudentName() {
        return studentName;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Abstract method: Contract requiring all concrete subclasses to define 
     * how their final price is calculated (e.g., applying discounts, surcharges)[cite: 5].
     */
    public abstract double calculateFinalPrice();
}