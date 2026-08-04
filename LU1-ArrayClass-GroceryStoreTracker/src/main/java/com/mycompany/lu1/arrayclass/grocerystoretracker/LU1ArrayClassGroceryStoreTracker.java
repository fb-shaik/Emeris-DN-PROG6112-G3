package com.mycompany.lu1.arrayclass.grocerystoretracker;

import java.util.Scanner; //Scanner class used for capturing input
import java.util.Arrays; //Arrays Class & its methods
public class LU1ArrayClassGroceryStoreTracker {

    public static void main(String[] args) {
        //Scanner obj to be used to receive input from the user 
        Scanner input = new Scanner(System.in);
        
        /*
            Create an array to store the prices of grocery items
            Each value represents the price of one item:
            Bread, Milk, Eggs, Rice, Apples
        */
            double [] groceryPrices = {1.85, 2.40, 3.15, 4.50, 2.50};
            
            //Display a heading for the start of the app
            System.out.println("GROCERY PRICE TRACKER");
            System.out.println("**********************");
        /*
            Arrays.toString(): Converts the array into a readable format
            Without Arrays.toString(), Java would display a memory reference 
            Instead of looking inside for the actual values stored
            */
            
        System.out.println("\nOriginal Grocery Prices:");
        //we don't need an object to access the Arrays Class methods as they are static in nature
        System.out.println(Arrays.toString(groceryPrices)); 
        
        /*
            Arrays.copyOf(): Create a new array containing the orignal array's data/element values
        */
            System.out.println("\nCopy of the Original Array created:");
            double [] copyArray = Arrays.copyOf(groceryPrices, groceryPrices.length); //arrayName, lenght to be copied
            System.out.println(Arrays.toString(copyArray));
            
            
            //Arrays.sort(): Arranges values in ascending order
            //Smalles values will appear first & largest value last
            System.out.println("\nSorted array values");
            Arrays.sort(copyArray);
            System.out.println(Arrays.toString(copyArray));
            
            
            int [] stockStatus = new int[5]; //matches the number of grocery items to check on stock status
            System.out.println("\nStock Status before update");
            //A value of 0 - Stock has not been updated
            System.out.println(Arrays.toString(stockStatus));
           //Arrays.fills() places the same value in every position
             Arrays.fill(stockStatus, 1);
             System.out.println("After the stock status has been adjusted: ");
             System.out.println(Arrays.toString(stockStatus));
    
             /*
                Arrays.equal(): compare values in two arrays
                The method returns true only when:
                    - both arrays are of the same lenght
                    - both arrays contain the same values
                    - values are in the same order
             groceryPrices is in the original order
             copyArray has been sorted from smallest to largest
             */
    
             boolean arrayMatch = Arrays.equals(groceryPrices, copyArray);
             System.out.println("\nAre the original & copy array identical? " + arrayMatch);
    
    
    }
}
