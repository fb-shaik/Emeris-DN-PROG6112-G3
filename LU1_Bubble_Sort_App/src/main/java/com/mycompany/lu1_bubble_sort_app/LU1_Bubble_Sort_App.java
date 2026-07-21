package com.mycompany.lu1_bubble_sort_app;
//Bubble Sort - Sorting algorithm that repeatedly cpmpares two neighbouring values

public class LU1_Bubble_Sort_App {

    public static void main(String[] args) {
        
        //array of numbers - random list
        //dataType ArrayName [Size] = {e1, e2, e3, e4};
        
        int [] numbers = {8,4,5,1,20,9,12}; //size has been set to 7 elements
        
        //Bubble sort will use a nested structure to do the sorting
        // 2 Loops (Outer Loop & Inner Loop)
        //Selection Statement - single selection
    
        //Outer Loop: Repeat for each pass
        for(int pass = 0; pass < numbers.length - 1; pass++)
        {//outer loop body
            
            //inner loop: compare neighbouring numbers
                for( int index = 0; index < numbers.length - 1 - pass; index++)
                {//inner loop body
                    
                  //Selection Statement - Swap if the left number is larger  
                    if( numbers[index] > numbers[index + 1])
                    {
                        int temp = numbers[index]; //this is to ensure we don't lose / wipe-out an value
                        numbers[index] = numbers[index + 1];
                        numbers[index + 1] = temp;
                    }
                }
        }
       System.out.println("Sorted Array");
        //for-each loop / for-in loop - display the sorted array
        for(int number : numbers)
        {
            System.out.print(number + " ");
        }
            
    }
}