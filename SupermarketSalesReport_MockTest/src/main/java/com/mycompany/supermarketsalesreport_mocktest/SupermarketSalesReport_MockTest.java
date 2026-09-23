/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermarketsalesreport_mocktest;

import java.util.Scanner;

/**
 *
 * @author FS
 */
public class SupermarketSalesReport_MockTest {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // 1D array containing the branch names
        String[] branches = {
            "Cape Town",
            "Johannesburg",
            "Durban"
        };

        // 1D array containing the category names
        String[] categories = {
            "Food",
            "Household"
        };

        // 2D array to store sales
        // Rows = branches
        // Columns = Food and Household
        int[][] sales = new int[3][2];

        // 1D array to store the total sales for each branch
        int[] totals = new int[3];

        // -------------------------------
        // INPUT
        // -------------------------------

        // Loop through each branch
        for (int i = 0; i < branches.length; i++) {

            // Loop through each category
            for (int j = 0; j < categories.length; j++) {

                System.out.print("Enter the number of "
                        + categories[j] + " items sold for "
                        + branches[i] + ": ");

                sales[i][j] = input.nextInt();
            }
        }

        // -------------------------------
        // DISPLAY SALES REPORT
        // -------------------------------

        System.out.println();
        System.out.println("SUPERMARKET SALES REPORT");
        System.out.println("-------------------------------------------");
        System.out.printf("%-18s %-10s %-10s%n",
                "BRANCH", "FOOD", "HOUSEHOLD");

        for (int i = 0; i < branches.length; i++) {

            System.out.printf("%-18s %-10d %-10d%n",
                    branches[i],
                    sales[i][0],
                    sales[i][1]);
        }

        // -------------------------------
        // CALCULATE TOTALS
        // -------------------------------

        for (int i = 0; i < branches.length; i++) {

            // Add Food + Household sales
            totals[i] = sales[i][0] + sales[i][1];
        }

        // -------------------------------
        // DISPLAY TOTALS
        // -------------------------------

        System.out.println();
        System.out.println("SUPERMARKET SALES TOTALS FOR EACH BRANCH");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < branches.length; i++) {

            System.out.printf("%-18s %d%n",
                    branches[i], totals[i]);
        }

        // -------------------------------
        // FIND HIGHEST TOTAL
        // -------------------------------

        // Assume the first branch has the highest sales
        int highestIndex = 0;

        for (int i = 1; i < totals.length; i++) {

            if (totals[i] > totals[highestIndex]) {
                highestIndex = i;
            }
        }

        // Display branch with most items sold
        System.out.println();
        System.out.println("BRANCH WITH THE MOST ITEMS SOLD: "
                + branches[highestIndex]);

        input.close();
    }
}