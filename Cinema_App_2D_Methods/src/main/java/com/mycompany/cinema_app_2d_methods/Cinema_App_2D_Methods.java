
package com.mycompany.cinema_app_2d_methods;
//Demo of using 2D arrays within methods
/*
    Small cinema has 3 rows of seats & 4 seats per row
    Each seat stores one of the following values:
        A: Available
        B: Booked

Create a program that generates the seating plan with the use of 
methods & display the seating plan
*/

public class Cinema_App_2D_Methods {

    public static void main(String[] args) {
        
        //create an object from the Cinema class
        //ClassName objectName = new ClassName();
            Cinema cinema = new Cinema();
            
        //receive the 2D array from a method
        char[][] seatingPlan = cinema.creatingSeatingPlan();
        
        //pass the 2D to the methods
        cinema.displaySeatingPlan(seatingPlan);
        
        int bookedSeats = cinema.countBookedSeats(seatingPlan);
        
        System.out.println("\nBooked Seats: " + bookedSeats);
        
    }
}
