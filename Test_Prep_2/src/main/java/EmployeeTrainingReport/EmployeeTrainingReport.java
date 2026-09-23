/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeTrainingReport;


public class EmployeeTrainingReport
        extends EmployeeTraining {

    // Constructor
    public EmployeeTrainingReport(String employeeName,
                                  String department,
                                  int trainingTotal) {

        super(employeeName, department, trainingTotal);
    }

    // Display report
    public void printTrainingReport() {

        System.out.println();
        System.out.println("EMPLOYEE TRAINING REPORT");
        System.out.println("-----------------------------");

        System.out.println("EMPLOYEE: "
                + getEmployeeName());

        System.out.println("DEPARTMENT: "
                + getDepartment());

        System.out.println("TRAINING TOTAL: "
                + getTrainingTotal());
    }
}