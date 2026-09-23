/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package MovieTicketSales;

import java.util.Scanner;

public class MovieTicketSales {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Cinema locations
        String[] cinemas = {
            "Durban",
            "Johannesburg",
            "Cape Town"
        };

        // Ticket types
        String[] ticketTypes = {
            "Adult",
            "Child"
        };

        // Store ticket sales
        int[][] sales = new int[3][2];

        // Store totals
        int[] totals = new int[3];

        // Get sales
        for (int i = 0; i < cinemas.length; i++) {

            for (int j = 0; j < ticketTypes.length; j++) {

                System.out.print("Enter " + ticketTypes[j]
                        + " tickets for " + cinemas[i] + ": ");

                sales[i][j] = input.nextInt();
            }
        }

        // Display report
        System.out.println();
        System.out.println("MOVIE TICKET SALES REPORT");
        System.out.println("--------------------------------------");

        System.out.printf("%-15s %-10s %-10s%n",
                "CINEMA", "ADULT", "CHILD");

        for (int i = 0; i < cinemas.length; i++) {

            System.out.printf("%-15s %-10d %-10d%n",
                    cinemas[i],
                    sales[i][0],
                    sales[i][1]);
        }

        // Calculate totals
        for (int i = 0; i < cinemas.length; i++) {

            totals[i] = sales[i][0] + sales[i][1];
        }

        // Display totals
        System.out.println();
        System.out.println("TOTAL TICKETS FOR EACH CINEMA");
        System.out.println("--------------------------------------");

        for (int i = 0; i < cinemas.length; i++) {

            System.out.println(cinemas[i] + ": " + totals[i]);
        }

        // Find highest
        int highest = 0;

        for (int i = 1; i < totals.length; i++) {

            if (totals[i] > totals[highest]) {
                highest = i;
            }
        }

        System.out.println();
        System.out.println("CINEMA WITH THE MOST TICKETS SOLD: "
                + cinemas[highest]);

        input.close();
    }
}