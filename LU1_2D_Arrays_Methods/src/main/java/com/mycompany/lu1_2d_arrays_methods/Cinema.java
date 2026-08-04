package com.mycompany.lu1_2d_arrays_methods;


public class Cinema {
    
    //Method that will return the 2D array
    public char[][] creatingSeatingPlan()
    {
        char [][] seats = {
                                        {'A', 'B','A', 'A'},
                                        {'B', 'B', 'A', 'A'},
                                        {'A', 'A', 'A', 'B'},
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
                    booked++; //Add to the tally of booked seats by a value of 1
                }
            } 
        }
            return booked;
    }
    
    //Method that will display the seating plan (this method will receive the 2D array)
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
    
    
    
    
}

/*
    1.Method Signature: accessType ReturnType MethodName(parameters) 
    2.Method Body:  {}
    3.Return from the method: return variable; 

*/