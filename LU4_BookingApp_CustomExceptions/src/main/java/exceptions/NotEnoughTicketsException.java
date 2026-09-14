
package exceptions;


public class NotEnoughTicketsException extends Exception
{
    public NotEnoughTicketsException (String message)
    {
        super(message); 
        //gives access to the Parent class (Exception) default message when an exception happens
    }
}
