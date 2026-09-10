// =============================================================================
// FILE 1: IProduct.java
// =============================================================================
package com.mycompany.d_array_inheritance_exam_2025;

/**
 * Interface defining the contract for sales calculation operations[cite: 4].
 * An interface contains only method signatures without bodies[cite: 4], requiring any
 * implementing class to provide the actual logic[cite: 4].
 */
public interface IProduct {

    /**
     * Calculates and returns the sum of all sales values in the 2D array[cite: 4].
     *
     * @param productSales 2D array of sales figures[cite: 4]
     * @return sum of all sales[cite: 4]
     */
    int TotalSales(int[][] productSales);

    /**
     * Calculates and returns the mean average of all sales values[cite: 4].
     *
     * @param productSales 2D array of sales figures[cite: 4]
     * @return average sales value as a double[cite: 4]
     */
    double AverageSales(int[][] productSales);

    /**
     * Finds and returns the highest sale recorded across all periods[cite: 4].
     *
     * @param productSales 2D array of sales figures[cite: 4]
     * @return highest sales value[cite: 4]
     */
    int MaxSale(int[][] productSales);

    /**
     * Finds and returns the lowest sale recorded across all periods[cite: 4].
     *
     * @param productSales 2D array of sales figures[cite: 4]
     * @return lowest sales value[cite: 4]
     */
    int MinSale(int[][] productSales);
}