/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiclereport_mocktest;

import java.util.Scanner;

/**
 *
 * @author FS
 */
public class VehicleReport_MockTest {

    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

        // Ask the user for the vehicle type
        System.out.print("Enter the vehicle type: ");
        String vehicleType = input.nextLine();

        // Ask the user for the city
        System.out.print("Enter the city: ");
        String city = input.nextLine();

        // Ask the user for the total number of services
        System.out.print("Enter the total number of services: ");
        int serviceTotal = input.nextInt();

        // Create the VehicleServiceReport object
        VehicleServiceReport report =
                new VehicleServiceReport(
                        vehicleType,
                        city,
                        serviceTotal);

        // Print the report
        report.printServiceReport();

        input.close();
    }
}