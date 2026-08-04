
package com.mycompany.arraysclass_demo;

import java.util.Arrays; //this allows access to the Arrays class methods
public class ArraysClass_Demo {

    public static void main(String[] args) {
        //Store five student test marks in an array
        int [] marks = {78, 56, 91, 69, 84}; 
        
        //display the original grades
        System.out.println("Original Grades");
        //System.out.println(marks); //printing the address of the array in memory
        System.out.println(Arrays.toString(marks));
        
        //sort the array in ascending order
        Arrays.sort(marks);
        System.out.println("\nSorted Marks");
        System.out.println(Arrays.toString(marks));
        
        System.out.println("Descending Order");
        for(int i = marks.length -1; i>=0; i--)
        {
            System.out.print(marks[i] + " ");
        }
        
        //create a copy of the sorted array 
        int [] copiedArray = Arrays.copyOf(marks, marks.length); //copies the whole array
        System.out.println("\nCopied Array (copyOf)");
        System.out.println(Arrays.toString(copiedArray));
        
        // Copy a range of elements (index 1 to 2)
        int [] rangeCopyArray = Arrays.copyOfRange(copiedArray, 1, 3); //copy based on the index range
        System.out.println("\nRange Copy Array (copyOfRange)");
        System.out.println(Arrays.toString(rangeCopyArray));
        
        //clone()
        int [] cloneMarks = marks.clone();
        System.out.println("\nCloned Array (clone)");
        System.out.println(Arrays.toString(cloneMarks));
        
        // Change the first element of the copied array
        copiedArray[0] = 100;
        System.out.println("\nAfter changing copiedArray:");
        System.out.println("Org Marks: " + Arrays.toString(marks)); //Changing the copied array does not change the original array.
        System.out.println("Copied Array: "  + Arrays.toString(copiedArray)); //copyOf() creates a new independent array.
        System.out.println("Clone Array: " + Arrays.toString(cloneMarks)); //clone() also creates a new independent array.
        
        
    }
}
/*
    Array = A fixed-size container; multiple values of the same data type.
    Arrays class = A utility class that helps you work with arrays
        - It contains many useful methods that make working with arrays easier
        - toolbox for arrays
        - sort(), toString(), binarySearch(), equals(), copyOf(), fill()
        - all the methods in the Arrays Class are static in nature
        - import java.util.Arrays; 
*/