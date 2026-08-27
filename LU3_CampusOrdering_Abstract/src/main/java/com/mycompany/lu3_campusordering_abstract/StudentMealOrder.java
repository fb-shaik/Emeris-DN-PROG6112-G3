package com.mycompany.lu3_campusordering_abstract;

/**
 * Concrete subclass representing a student order eligible for a discount[cite: 7].
 * Inherits core properties from CampusOrder and adds discount-handling logic[cite: 7].
 */
public class StudentMealOrder extends CampusOrder {

    // Subclass-specific attribute[cite: 7]
    private double discountPercentage;

    /**
     * Passes common order details to the superclass constructor and assigns 
     * the subclass-specific discount[cite: 7].
     */
    public StudentMealOrder(String studentName, String foodItem, double price, double discountPercentage) {
        super(studentName, foodItem, price);
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Implements the abstract method calculateFinalPrice() to deduct the 
     * percentage-based student discount from the base price[cite: 7].
     */
    @Override
    public double calculateFinalPrice() {
        double discountAmount = getPrice() * (discountPercentage / 100.0);
        return getPrice() - discountAmount;
    }

    /**
     * Formats and prints a summary receipt of the order details and final pricing[cite: 7].
     */
    public void printOrder() {
        System.out.println();
        System.out.println("Campus Food Order");
        System.out.println("--------------------------------");
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Food Item: " + getFoodItem());
        System.out.printf("Original Price: R%.2f%n", getPrice());
        System.out.printf("Discount: %.0f%%%n", getDiscountPercentage());
        System.out.printf("Final Price: R%.2f%n", calculateFinalPrice());
        System.out.println("---------------------------------");
    }
}