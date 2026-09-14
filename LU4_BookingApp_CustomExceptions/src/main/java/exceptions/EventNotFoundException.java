package exceptions;

public class EventNotFoundException extends Exception {

    public EventNotFoundException(String message) {
        super(message);
        //gives access to the Parent class (Exception) default message when an exception happens
    }

}
