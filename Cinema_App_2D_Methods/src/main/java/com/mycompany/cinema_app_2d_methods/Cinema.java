
package com.mycompany.cinema_app_2d_methods;

public class Cinema {
    /*
    Small cinema has 3 rows of seats & 4 seats per row
    Each seat stores one of the following values:
        A: Available
        B: Booked
    */
    //Create a 2D Array that will be 3x4
    /*dataType[][] arrayName = {{},
                                                         {},  
                                                        };
  */

//Method that will return the 2D array
public char[][] creatingSeatingPlan(){    
  //2D array for the seating plan
    char[][] seats = {
                                    {'A', 'B', 'A', 'A'},
                                    {'B', 'B', 'A', 'A'},       
                                    {'A', 'A', 'A', 'B'}
                                };
              return seats;                  
}

//Method receives a 2D array - count of Booked Seats
public int countBookedSeats(char[][] seats)
{
    int booked = 0; //accumulator variable
    //outer loop: look at the row of the 2D
    for(int row = 0; row < seats.length; row++)
    {//outer loop body
        //inner loop structure
            for(int column = 0; column < seats[row].length; column++)
            {//inner loop body
                    if(seats[row][column] == 'B')
                    {
                        booked++;
                    }
            }
    }
    return booked;
}
    
//Method that will display the seating plan (this method will receive the 2D arrY)
public void displaySeatingPlan(char [][] seats)
{
    System.out.println("CINEMA SEATING PLAN");
    System.out.println("---------------------------------");
    //create the loop structure that will display the seating plan
    for(int row = 0; row < seats.length; row++)
    {
         for(int column = 0; column < seats[row].length; column++)
         {
             System.out.print(seats[row][column] + " ");
         }
        System.out.println();
    }
}




    /*
  1.Method Signature: accessType ReturnType MethodName(parameters) 
  2.Method Body:  {}
  3.Return from the method: return variable; 
*/

}
