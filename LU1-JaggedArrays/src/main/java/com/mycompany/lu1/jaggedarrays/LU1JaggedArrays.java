package com.mycompany.lu1.jaggedarrays;

public class LU1JaggedArrays {

    public static void main(String[] args) {
        //create a jagged array
        //defined the number of rows; we will populate the row elements to define the column lenght 
        int [][] studentCourse = new int[3][];
        
        //First Course: Has 3 student enrolled.Represents R1 of the array 
        studentCourse[0] = new int []{30, 50, 75};//number of elements is the lenght of the array at this point 
        
        //Second Course: Has 5 students & represents R2 of the array
        studentCourse[1] = new int []{50, 35, 74, 89, 100}; //number of the elements represent array lenght at this point
        
        //Third Course: Has 2 students & represents R3 of the array
        studentCourse[2] = new int[]{60, 87}; //number of elements represents the array lenght at this point
        
        
        //Access & print the jagged array to display its contents
        //For Course [] there are [] students registered
        
//OuterLoop: Rows - Course Number 
        for(int i = 0; i < studentCourse.length ; i++)
        {
                System.out.println("Course " +  (i + 1) + " has " + studentCourse[i].length + " students" );
            
            //InnerLoop: Columns - Number of Students
                for( int j = 0; j < studentCourse[i].length; j++)
                {
                        System.out.println(studentCourse[i][j] + " ");
                }
                System.out.println();
        }
        
    }
}

/*
Jagged / Ragged Array
- We can set the row & adjust the column lenght so that we create an uneven matrix/table
- dataType [R][] arrayName = {
                                {e1, e2,e3,e4}, //r
                                {e1,e2}, //r
                                {e1,e2,e3,e4,e5,e6}, //r
                                {e1,e2,e3}, //r
                             }; 

**2D array: - Row & Columns
            - Set number of R&C 
            - dataType [r][c] arrayName = new dataType[Size of R][Size of C];
*/