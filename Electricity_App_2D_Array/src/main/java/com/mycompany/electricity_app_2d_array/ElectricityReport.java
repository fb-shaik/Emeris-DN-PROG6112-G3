
package com.mycompany.electricity_app_2d_array;
public class ElectricityReport {

    // Constants
    private static final int DAYS_IN_WEEK = 5;
    private static final int HIGH_USAGE_LIMIT = 120;

    // Private fields
    private String[] apartmentNames;
    private int[][] electricityUsage;

    // Constructor
    public ElectricityReport(String[] apartmentNames, int[][] electricityUsage) {
        this.apartmentNames = apartmentNames;
        this.electricityUsage = electricityUsage;
    }

    // Validates all apartment names and electricity usage values
    public boolean validateData() {

        if (apartmentNames == null) {
            System.out.println("Error: Apartment names cannot be empty.");
            return false;
        }

        if (electricityUsage == null) {
            System.out.println("Error: Electricity usage data cannot be empty.");
            return false;
        }

        // Check that apartment names match the number of rows
        if (apartmentNames.length != electricityUsage.length) {
            System.out.println(
                    "Error: The number of apartment names must match "
                    + "the number of electricity usage rows.");
            return false;
        }

        for (int apartmentIndex = 0;
             apartmentIndex < apartmentNames.length;
             apartmentIndex++) {

            // Check apartment name
            if (apartmentNames[apartmentIndex] == null
                    || apartmentNames[apartmentIndex].trim().isEmpty()) {

                System.out.println(
                        "Error: Apartment name at position "
                        + (apartmentIndex + 1)
                        + " cannot be empty.");
                return false;
            }

            // Check that usage data exists
            if (electricityUsage[apartmentIndex] == null) {
                System.out.println(
                        "Error: Usage data is missing for "
                        + apartmentNames[apartmentIndex] + ".");
                return false;
            }

            // Check that each apartment has five usage values
            if (electricityUsage[apartmentIndex].length != DAYS_IN_WEEK) {
                System.out.println(
                        "Error: " + apartmentNames[apartmentIndex]
                        + " must have exactly five usage values.");
                return false;
            }

            // Check that usage values are not negative
            for (int dayIndex = 0;
                 dayIndex < DAYS_IN_WEEK;
                 dayIndex++) {

                if (electricityUsage[apartmentIndex][dayIndex] < 0) {
                    System.out.println(
                            "Error: Electricity usage cannot be negative for "
                            + apartmentNames[apartmentIndex] + ".");
                    return false;
                }
            }
        }

        return true;
    }

    // Calculates the total usage for an apartment
    public int calculateApartmentTotal(int apartmentIndex) {

        int total = 0;

        for (int dayIndex = 0;
             dayIndex < DAYS_IN_WEEK;
             dayIndex++) {

            total += electricityUsage[apartmentIndex][dayIndex];
        }

        return total;
    }

    // Calculates the average usage for an apartment
    public double calculateApartmentAverage(int apartmentIndex) {

        int total = calculateApartmentTotal(apartmentIndex);

        return (double) total / DAYS_IN_WEEK;
    }

    // Finds the apartment with the highest total usage
    public int findHighestUsageApartment() {

        int highestApartmentIndex = 0;
        int highestTotal = calculateApartmentTotal(0);

        for (int apartmentIndex = 1;
             apartmentIndex < apartmentNames.length;
             apartmentIndex++) {

            int currentTotal =
                    calculateApartmentTotal(apartmentIndex);

            if (currentTotal > highestTotal) {
                highestTotal = currentTotal;
                highestApartmentIndex = apartmentIndex;
            }
        }

        return highestApartmentIndex;
    }

    // Displays the weekly electricity usage report
    public void displayUsageReport() {

        System.out.println("WEEKLY ELECTRICITY USAGE REPORT");
        System.out.println(
                "--------------------------------------------------------------------------");

        System.out.printf(
                "%-15s %5s %5s %5s %5s %5s %7s %9s%n",
                "Apartment", "Mon", "Tue", "Wed",
                "Thu", "Fri", "Total", "Average");

        System.out.println(
                "--------------------------------------------------------------------------");

        for (int apartmentIndex = 0;
             apartmentIndex < apartmentNames.length;
             apartmentIndex++) {

            int total = calculateApartmentTotal(apartmentIndex);
            double average = calculateApartmentAverage(apartmentIndex);

            // Display apartment name
            System.out.printf(
                    "%-15s",
                    apartmentNames[apartmentIndex]);

            // Display daily electricity usage
            for (int dayIndex = 0;
                 dayIndex < DAYS_IN_WEEK;
                 dayIndex++) {

                System.out.printf(
                        "%5d",
                        electricityUsage[apartmentIndex][dayIndex]);
            }

            // Display total and average
            System.out.printf(
                    "%7d %9.2f",
                    total,
                    average);

            // Check for high usage
            if (total > HIGH_USAGE_LIMIT) {
                System.out.print(" HIGH USAGE");
            }

            System.out.println();
        }

        // Find apartment with highest usage
        int highestApartmentIndex = findHighestUsageApartment();

        System.out.println();
        System.out.println(
                "Apartment with the highest usage: "
                + apartmentNames[highestApartmentIndex]);

        System.out.println(
                "Total electricity usage: "
                + calculateApartmentTotal(highestApartmentIndex)
                + " kWh");
    }
}