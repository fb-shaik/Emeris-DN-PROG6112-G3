
package exceptions;


public class InvalidTicketQtyException extends Exception
{
 //constructor for the child class
    public InvalidTicketQtyException(String message)
    {
        super(message);
      //gives access to the Parent class (Exception) default message when an exception happens
    }
            
 }
