// =============================================================================
// FILE 2: ProductSales.java
// =============================================================================
package com.mycompany.d_array_inheritance_exam_2025;

/**
 * Implements the IProduct contract to compute metrics over 2D sales data.
 */
public class ProductSales implements IProduct {

    /**
     * Iterates through every row and column to compute the grand total[cite: 5].
     */
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0; // Running total accumulator[cite: 5]

        // Outer loop traverses each year (rows)[cite: 5]
        for (int row = 0; row < productSales.length; row++) {
            // Inner loop traverses each quarter in the current year (columns)[cite: 5]
            for (int col = 0; col < productSales[row].length; col++) {
                total += productSales[row][col]; // Add the current cell value to total[cite: 5]
            }
        }
        return total; // Return the final computed total[cite: 5]
    }

    /**
     * Reuses TotalSales() to keep logic DRY, then divides by total cell count[cite: 5].
     */
    @Override
    public double AverageSales(int[][] productSales) {
        // Edge case safety: protect against empty or null arrays
        if (productSales == null || productSales.length == 0) {
            return 0.0;
        }

        // Reuse TotalSales to avoid redundant nested loops[cite: 5]
        int total = TotalSales(productSales);
        int numberOfSales = 0;

        // Count total elements across all rows (handles rectangular or jagged arrays)
        for (int row = 0; row < productSales.length; row++) {
            numberOfSales += productSales[row].length;
        }

        if (numberOfSales == 0) {
            return 0.0;
        }

        // Explicitly cast to double to prevent integer truncation during division[cite: 5]
        return (double) total / numberOfSales;
    }

    /**
     * Finds the maximum value across the 2D array[cite: 5].
     */
    @Override
    public int MaxSale(int[][] productSales) {
        // Initialize to lowest possible 32-bit integer so any valid data replaces it[cite: 5]
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] > max) {
                    max = productSales[row][col]; // Update max if current element is larger[cite: 5]
                }
            }
        }
        return max; // Return the peak sale value found[cite: 5]
    }

    /**
     * Finds the minimum value across the 2D array[cite: 5].
     */
    @Override
    public int MinSale(int[][] productSales) {
        // Initialize to highest possible 32-bit integer so any valid data replaces it[cite: 5]
        int min = Integer.MAX_VALUE;

        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] < min) {
                    min = productSales[row][col]; // Update min if current element is smaller[cite: 5]
                }
            }
        }
        return min; // Return the lowest sale value found[cite: 5]
    }
}