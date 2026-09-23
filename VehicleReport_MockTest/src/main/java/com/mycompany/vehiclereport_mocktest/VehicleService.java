/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclereport_mocktest;

/**
 *
 * @author FS
 */

// Abstract class implements the interface
public abstract class VehicleService implements IVehicleService {

    // Variables to store the vehicle information
    private String vehicleType;
    private String city;
    private int serviceTotal;

    // Constructor
    public VehicleService(String vehicleType,
                          String city,
                          int serviceTotal) {

        this.vehicleType = vehicleType;
        this.city = city;
        this.serviceTotal = serviceTotal;
    }

    // Return the vehicle type
    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    // Return the city
    @Override
    public String getCity() {
        return city;
    }

    // Return the number of services
    @Override
    public int getServiceTotal() {
        return serviceTotal;
    }
}