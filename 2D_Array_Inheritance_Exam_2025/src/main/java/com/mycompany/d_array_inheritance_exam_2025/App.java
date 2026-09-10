
package com.mycompany.d_array_inheritance_exam_2025;


public class App {

    public static void main(String[] args) {
        //1D array - Store the quarter headings
        String [] quaters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};
      
        //1D arry - Stores the year headings
        String [] years = {"YEAR 1", "YEAR 2"}; 
        
        //2D array - Store the product sales across the year & quarter
        //Each ROW represent a year
        //Each COLUMN represent a quarter
        int [][] productSales = {
                                                 //  0        1     2
                                                    {300, 150, 700},  //0  
                                                    {250, 200, 600}   //1
                                                };
    //[1][2]: 600
    //[0][1]: 150
    
               // -----------------------------------------------------
        // CREATE OBJECT
        // -----------------------------------------------------

        // Create an object of the ProductSales class.
        // We use this object to call the calculation methods.
        ProductSales sales = new ProductSales();


        // -----------------------------------------------------
        // DISPLAY SALES TABLE
        // -----------------------------------------------------

        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println();

        // Print blank space before the quarter headings.
        System.out.printf("%-12s", "");

        // Print each quarter heading.
        for (int col = 0; col < quaters.length; col++) {
            System.out.printf("%-12s", quaters[col]);
        }

        System.out.println();


        // Print each year and its sales values.
        for (int row = 0; row < productSales.length; row++) {

            // Print the current year.
            System.out.printf("%-12s", years[row]);

            // Print the sales values for the current year.
            for (int col = 0; col < productSales[row].length; col++) {
                System.out.printf("%-12d", productSales[row][col]);
            }

            System.out.println();
        }


        // -----------------------------------------------------
        // DISPLAY CALCULATED RESULTS
        // -----------------------------------------------------

        System.out.println();
        System.out.println("--------------------------------");

        // Call methods from the ProductSales object.
        System.out.println(
                "Total sales:   " + sales.TotalSales(productSales)
        );

        // %.0f rounds the displayed average to zero decimal places,
        // matching the sample report where 366.67 displays as 367.
        System.out.printf(
                "Average sales: %.0f%n",
                sales.AverageSales(productSales)
        );

        System.out.println(
                "Maximum sale:  " + sales.MaxSale(productSales)
        );

        System.out.println(
                "Minimum sale:  " + sales.MinSale(productSales)
        );
    }
}