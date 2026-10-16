package com.mycompany.lu5_randomaccess;

import java.io.*;
import java.util.Scanner;

public class LU5_RandomAccess {

    public static void main(String[] args) throws IOException
    {
        //create a scanner object to capture user input
        Scanner input = new Scanner(System.in);
        //create locker file with the sample data/records
        RandomAccessFile file = new RandomAccessFile("lockers.txt", "rw");
        
        //create an array that contains 5 learner names
        String [] learners = {
            "Alice",
            "Bob",
            "Charlie",
            "Dave",
            "Edward",};
        
        for(String learner : learners)
        {
            file.writeChars(String.format("%-20s", learners));
        }
        
        int recordSize = 40; //20 chars * 2 bytes
        int lockerNumber; 
        
        //create a do-while loop to prompt the user for a locker number 
        //return to the user the name of the assigned locker
        do{
            System.out.println("School Locker Look-Up");
            System.out.println("Enter a locker number (1-5) or 0 to exit");
            lockerNumber = input.nextInt();
            if(lockerNumber == 0)
            {
                System.out.println("GoodBye!");
                break;
            }
            if(lockerNumber <1 || lockerNumber > 5)
            {
                System.out.println("Invalid locker number");
                continue;
            }
            //look for the assigned name
            file.seek((lockerNumber - 1) * recordSize);
            String name = "";
            for(int i = 0; i < 20; i++)
            {
                name += file.readChar(); 
            }
            System.out.println("Locker" + lockerNumber + " belongs to " + name.trim());
        }while(lockerNumber !=0);
        
        file.close();
        input.close();
    
    }
}

/*RandomAccessFile class
    - allows us to jump directly to a specific position in a 
        file instead of reading everything from the beginning
*/