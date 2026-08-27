
package com.mycompany.electricity_app_2d_array;

public class Electricity_App_2D_Array {

      public static void main(String[] args) {

        // Apartment names
        String[] apartmentNames = {
            "Apartment 1",
            "Apartment 2",
            "Apartment 3",
            "Apartment 4"
        };

        // Electricity usage from Monday to Friday
        int[][] electricityUsage = {
            {18, 20, 17, 22, 19},
            {25, 23, 26, 24, 28},
            {14, 16, 15, 18, 17},
            {30, 28, 32, 29, 31}
        };

        // Create ElectricityReport object
        ElectricityReport report =
                new ElectricityReport(
                        apartmentNames,
                        electricityUsage);

        // Validate the data before generating the report
        if (report.validateData()) {
            report.displayUsageReport();
        }
    }
}