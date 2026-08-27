package com.mycompany.lu3_campusordering_abstract;

import java.util.Scanner;

public class LU3_CampusOrdering_Abstract {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Prompt and capture student and order input[cite: 6]
        System.out.println("Enter the student name: ");
        String studentName = input.nextLine();

        System.out.println("Enter the food item: ");
        String foodItem = input.nextLine();

        System.out.println("Enter the price of the food item : R");
        double price = input.nextDouble();

        System.out.println("Enter the student discount percentage: ");
        double discountPercentage = input.nextDouble();

        // 2. Instantiate the concrete subclass[cite: 6]
        StudentMealOrder order = new StudentMealOrder(studentName, foodItem, price, discountPercentage);

        // 3. Display the final calculated receipt[cite: 6]
        order.printOrder();

        // 4. Close resources[cite: 6]
        input.close();
    }
}