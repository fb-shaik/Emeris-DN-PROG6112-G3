/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EmployeeTrainingReport;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get information
        System.out.print("Enter employee name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter department: ");
        String department = input.nextLine();

        System.out.print("Enter training total: ");
        int trainingTotal = input.nextInt();

        // Create object
        EmployeeTrainingReport report =
                new EmployeeTrainingReport(
                        employeeName,
                        department,
                        trainingTotal);

        // Display report
        report.printTrainingReport();

        input.close();
    }
}