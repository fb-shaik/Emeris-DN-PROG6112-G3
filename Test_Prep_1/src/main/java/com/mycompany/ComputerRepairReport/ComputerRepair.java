/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ComputerRepairReport;

public abstract class ComputerRepair
        implements IComputerRepair {

    // Variables
    private String computerType;
    private String technician;
    private int repairTotal;

    // Constructor
    public ComputerRepair(String computerType,
                          String technician,
                          int repairTotal) {

        this.computerType = computerType;
        this.technician = technician;
        this.repairTotal = repairTotal;
    }

    // Get methods
    @Override
    public String getComputerType() {
        return computerType;
    }

    @Override
    public String getTechnician() {
        return technician;
    }

    @Override
    public int getRepairTotal() {
        return repairTotal;
    }
}