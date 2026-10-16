
package com.mycompany.lu5_schooltuckshop_app;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class LU5_SchoolTuckShop_App {

    public static void main(String[] args) {
      
        try{
            //1. Create a filewriter (write the first two items)
            FileWriter writer = new FileWriter("stock.txt");
            writer.write("Chicken Mayo Sandwich\n");
            writer.write("Orange Juice\n");
            writer.close();//Close the writer
    
           //Create another Filewrite (in append mode) + Add 'Chocolate Muffin' to the text file
           FileWriter appendWriter = new FileWriter("stock.txt", true);     
                appendWriter.write("Chocolate Muffin\n");
                appendWriter.close();
                
//Create a FileReader
FileReader reader = new FileReader("stock.txt");        
        //    System.out.println("Today's Sold Out Items:");
            //System.out.println("---------------------------------");
            
            int character;
            while ((character = reader.read()) != -1)
            {
                System.out.print((char) character);
                reader.close();
            }
            
        }
        
        catch(IOException e)
        {
            System.out.println("File Error!");
        }
        
        
    }
}
