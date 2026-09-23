/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ComputerRepairReport;

/**
 *
 * @author FS
 */
import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get information from user
        System.out.print("Enter computer type: ");
        String computerType = input.nextLine();

        System.out.print("Enter technician name: ");
        String technician = input.nextLine();

        System.out.print("Enter total repairs: ");
        int repairTotal = input.nextInt();

        // Create object
        ComputerRepairReport report =
                new ComputerRepairReport(
                        computerType,
                        technician,
                        repairTotal);

        // Display report
        report.printRepairReport();

        input.close();
    }
}