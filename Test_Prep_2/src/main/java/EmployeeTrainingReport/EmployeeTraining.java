/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeTrainingReport;

public abstract class EmployeeTraining
        implements IEmployeeTraining {

    // Variables
    private String employeeName;
    private String department;
    private int trainingTotal;

    // Constructor
    public EmployeeTraining(String employeeName,
                            String department,
                            int trainingTotal) {

        this.employeeName = employeeName;
        this.department = department;
        this.trainingTotal = trainingTotal;
    }

    // Get methods
    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public int getTrainingTotal() {
        return trainingTotal;
    }
}