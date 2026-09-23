/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.CellPhoneReport;

import java.util.Scanner;

/**
 *
 * @author FS
 */
public class Test_Prep_1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // 1D arrays
        String[] branches = {
            "Durban",
            "Cape Town",
            "Johannesburg"
        };

        String[] phoneTypes = {
            "Android",
            "iPhone"
        };

        // 2D array for sales
        int[][] sales = new int[3][2];

        // 1D array for totals
        int[] totals = new int[3];

        // Get sales from user
        for (int i = 0; i < branches.length; i++) {

            for (int j = 0; j < phoneTypes.length; j++) {

                System.out.print("Enter " + phoneTypes[j]
                        + " sales for " + branches[i] + ": ");

                sales[i][j] = input.nextInt();
            }
        }

        // Display sales report
        System.out.println();
        System.out.println("CELL PHONE SALES REPORT");
        System.out.println("-------------------------------------");
        System.out.printf("%-15s %-10s %-10s%n",
                "BRANCH", "ANDROID", "IPHONE");

        for (int i = 0; i < branches.length; i++) {

            System.out.printf("%-15s %-10d %-10d%n",
                    branches[i],
                    sales[i][0],
                    sales[i][1]);
        }

        // Calculate totals
        for (int i = 0; i < branches.length; i++) {

            totals[i] = sales[i][0] + sales[i][1];
        }

        // Display totals
        System.out.println();
        System.out.println("TOTAL SALES FOR EACH BRANCH");
        System.out.println("-------------------------------------");

        for (int i = 0; i < branches.length; i++) {

            System.out.println(branches[i] + ": " + totals[i]);
        }

        // Find branch with highest sales
        int highest = 0;

        for (int i = 1; i < totals.length; i++) {

            if (totals[i] > totals[highest]) {
                highest = i;
            }
        }

        System.out.println();
        System.out.println("BRANCH WITH THE MOST SALES: "
                + branches[highest]);

        input.close();
    }
}