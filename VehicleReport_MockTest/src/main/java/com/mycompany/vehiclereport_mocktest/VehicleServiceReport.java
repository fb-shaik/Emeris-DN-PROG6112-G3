/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclereport_mocktest;

/**
 *
 * @author FS
 */
// VehicleServiceReport inherits from VehicleService
public class VehicleServiceReport extends VehicleService {

    // Constructor
    public VehicleServiceReport(String vehicleType,
                                String city,
                                int serviceTotal) {

        // Send the values to the parent class constructor
        super(vehicleType, city, serviceTotal);
    }

    // Method to print the service report
    public void printServiceReport() {

        System.out.println();
        System.out.println("VEHICLE SERVICE REPORT");
        System.out.println("----------------------------");

        System.out.println("VEHICLE TYPE: "
                + getVehicleType());

        System.out.println("CITY: "
                + getCity());

        System.out.println("TOTAL SERVICES: "
                + getServiceTotal());
    }
}