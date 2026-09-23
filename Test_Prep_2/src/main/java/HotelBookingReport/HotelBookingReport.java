/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package HotelBookingReport;

import java.util.Scanner;

public class HotelBookingReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Hotel names
        String[] hotels = {
            "Durban",
            "Pretoria",
            "Cape Town"
        };

        // Room types
        String[] roomTypes = {
            "Standard",
            "Deluxe"
        };

        // Store bookings
        int[][] bookings = new int[3][2];

        // Store total bookings
        int[] totals = new int[3];

        // Get bookings from user
        for (int i = 0; i < hotels.length; i++) {

            for (int j = 0; j < roomTypes.length; j++) {

                System.out.print("Enter " + roomTypes[j]
                        + " bookings for " + hotels[i] + ": ");

                bookings[i][j] = input.nextInt();
            }
        }

        // Display report
        System.out.println();
        System.out.println("HOTEL BOOKING REPORT");
        System.out.println("-------------------------------------");

        System.out.printf("%-15s %-10s %-10s%n",
                "HOTEL", "STANDARD", "DELUXE");

        for (int i = 0; i < hotels.length; i++) {

            System.out.printf("%-15s %-10d %-10d%n",
                    hotels[i],
                    bookings[i][0],
                    bookings[i][1]);
        }

        // Calculate totals
        for (int i = 0; i < hotels.length; i++) {

            totals[i] = bookings[i][0] + bookings[i][1];
        }

        // Display totals
        System.out.println();
        System.out.println("TOTAL BOOKINGS FOR EACH HOTEL");
        System.out.println("-------------------------------------");

        for (int i = 0; i < hotels.length; i++) {

            System.out.println(hotels[i] + ": " + totals[i]);
        }

        // Find hotel with highest bookings
        int highest = 0;

        for (int i = 1; i < totals.length; i++) {

            if (totals[i] > totals[highest]) {
                highest = i;
            }
        }

        System.out.println();
        System.out.println("HOTEL WITH THE MOST BOOKINGS: "
                + hotels[highest]);

        input.close();
    }
}