
package com.mycompany.lu5_seq_file_handling;

import java.io.*; //import all classess needed for file handling 
import java.nio.*;
import java.util.Scanner;
public class LU5_Seq_File_Handling {

    public static void main(String[] args) {
       //Create a scanner object to accept user input
       Scanner input = new Scanner(System.in);
       //name the text file used to store sales records
       String fileName = "sales.txt";
       //Display output on the console
        System.out.println("SCHOOL TUCK SHOP SALES");
        
        //Part1 - Write to a Sequential file
        //Records are saved one after the other
        //Each record will be saved on a seperate line
        
        try{
            //FileWriter - open the file for writing, has to be in append mode
        FileWriter fw = new FileWriter(fileName, true);
        //BufferedWriter allows us to write to the text, efficiently
        BufferedWriter bw = new BufferedWriter(fw);
        
        //ask user to enter product name
            System.out.print("Enter product name: ");
            String product = input.nextLine();
        //ask user to enter product price
            System.out.print("Enter product price: ");
            double price = input.nextDouble(); 
            
          //write the above record to the text file via the buffered writer object
          bw.write(product + " | R" + price); // the | symbol seperates product & price
          bw.newLine(); //moves the writer object to a new line in the text file
          
          //close the resources after writing to the file
          bw.close(); //ensures that the data is saved to the file 
          
          //inform the user that the sale was saved 
            System.out.println("Sale saved successfully!");
          
        }
        catch(IOException e)
        {
            System.out.println("Error occured when writing to the file");
        }
        
        //part 2 - Read a sequental file records
        System.out.println("Saved Sales");
      try {            // FileReader opens the existing text file so that its contents can be read.
            FileReader fr = new FileReader(fileName);
            // BufferedReader allows the program to read the file one line at a time.
            BufferedReader br = new BufferedReader(fr);
            // Declare a String variable to temporarily store each line (record) read from the file.
            String record;
            // Read records one at a time. readLine() reads the next line in the file.
            // When no more records exist, it returns null. The loop continues until the end of the file.
            while ((record = br.readLine()) != null) {
                // Split the record into separate fields using the "|" symbol as the separator.
                // Example record: Chips|15.0
                // details[0] = "Chips"
                // details[1] = "15.0"
                // The \\ is needed because split() uses regular expressions and 
                // | has a special meaning in regex.
                String[] details = record.split("\\|");
                // Extract the product name from the first position in the array.
                String product = details[0];
                // Extract the product price from the second position in the array.
                String price = details[1];
                // Display the saved product and price on the console.
                System.out.println(
                    "Product: " + product +
                    " | Price: R " + price
                );
            }
            // Close BufferedReader after reading.
            // This releases the file resources.
            br.close();

        }

        // Catch errors that may occur when reading
        // the file, such as the file not existing.
        catch (IOException e) {

            System.out.println("Error reading file.");

        }

    }
}
        
       
