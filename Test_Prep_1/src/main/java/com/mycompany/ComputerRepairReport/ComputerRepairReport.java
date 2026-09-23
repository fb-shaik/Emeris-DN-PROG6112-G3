/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ComputerRepairReport;

public class ComputerRepairReport
        extends ComputerRepair {

    // Constructor
    public ComputerRepairReport(String computerType,
                                String technician,
                                int repairTotal) {

        super(computerType, technician, repairTotal);
    }

    // Print report
    public void printRepairReport() {

        System.out.println();
        System.out.println("COMPUTER REPAIR REPORT");
        System.out.println("---------------------------");

        System.out.println("COMPUTER TYPE: "
                + getComputerType());

        System.out.println("TECHNICIAN: "
                + getTechnician());

        System.out.println("TOTAL REPAIRS: "
                + getRepairTotal());
    }
}