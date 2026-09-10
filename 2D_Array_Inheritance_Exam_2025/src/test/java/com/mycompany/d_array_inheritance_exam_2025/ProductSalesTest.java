package com.mycompany.d_array_inheritance_exam_2025;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the ProductSales class using the AAA (Arrange, Act, Assert) pattern.
 */
public class ProductSalesTest {

    private ProductSales sales;
    private int[][] testSalesData;

    /**
     * Sets up common test fixtures before each test execution.
     */
    @BeforeEach
    public void setUp() {
        // Arrange - Instantiate target calculator class
        sales = new ProductSales();

        // Arrange - Standard dataset matching the report values
        // Total = 300 + 150 + 700 + 250 + 200 + 600 = 2200[cite: 6]
        // Count = 6 elements[cite: 6]
        // Average = 2200 / 6 = 366.666...[cite: 6]
        testSalesData = new int[][]{
            {300, 150, 700},
            {250, 200, 600}
        };
    }

    @Test
    public void testTotalSales() {
        // Arrange
        int expectedTotal = 2200; // Corrected from the invalid 5000 assertion[cite: 6]

        // Act - Invoke TotalSales with test dataset[cite: 6]
        int actualTotal = sales.TotalSales(testSalesData);

        // Assert - Verify calculated total equals expected sum[cite: 6]
        assertEquals(expectedTotal, actualTotal, "Total sales should equal the sum of all elements (2200).");
    }

    @Test
    public void testAverageSales() {
        // Arrange
        double expectedAverage = 366.67; // 2200 / 6 rounded to two decimal places[cite: 6]
        double delta = 0.01;            // Allowable margin of error for floating-point calculation[cite: 6]

        // Act - Invoke AverageSales with test dataset[cite: 6]
        double actualAverage = sales.AverageSales(testSalesData);

        // Assert - Verify calculated mean within tolerance threshold[cite: 6]
        assertEquals(expectedAverage, actualAverage, delta, "Average sales should be approximately 366.67.");
    }

    @Test
    public void testMaxSale() {
        // Arrange
        int expectedMax = 700; // Peak value in testSalesData (Row 0, Col 2)[cite: 6]

        // Act - Find maximum value across all quarters and years
        int actualMax = sales.MaxSale(testSalesData);

        // Assert - Verify correct identification of peak sale
        assertEquals(expectedMax, actualMax, "Max sale should correctly identify the highest value (700).");
    }

    @Test
    public void testMinSale() {
        // Arrange
        int expectedMin = 150; // Lowest value in testSalesData (Row 0, Col 1)[cite: 6]

        // Act - Find minimum value across all quarters and years
        int actualMin = sales.MinSale(testSalesData);

        // Assert - Verify correct identification of lowest sale
        assertEquals(expectedMin, actualMin, "Min sale should correctly identify the lowest value (150).");
    }
}