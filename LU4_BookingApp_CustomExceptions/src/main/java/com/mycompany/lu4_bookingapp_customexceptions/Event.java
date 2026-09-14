
package com.mycompany.lu4_bookingapp_customexceptions;

import exceptions.EventNotFoundException;
import exceptions.InvalidTicketQtyException;
import exceptions.NotEnoughTicketsException;

public class Event {
    //data fields (eventID, eventName, availableTickets, ticketPrice)
    //make sure all are private; use the appropriate data-type
    private int eventId;
    private String eventName;
    private int availableTickets;
    private double ticketPrice;
    
    //constructor for the class: The constructor should take all 4 fields as parameters
     public Event(int eventId, String eventName, int availableTickets, double ticketPrice) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.availableTickets = availableTickets;
        this.ticketPrice = ticketPrice;
    }
    
    //include getMethods for (EventID, EventName, AvalableTickets, TicketPrice)
   
    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
    
      //create methods for:
    //bookTickets(int quantity) method: make use of the custom exceptions 
    public void bookTickets(int quantity)
            throws InvalidTicketQtyException, NotEnoughTicketsException 
    {

        if (quantity <= 0) {
            throw new InvalidTicketQtyException(
                "Quantity must be greater than 0."
            );
        }

        if (quantity > availableTickets) {
            throw new NotEnoughTicketsException(
                "Not enough tickets available."
            );
        }

        availableTickets -= quantity;
    }
    
    //displayEvent() method
   public void displayEvent() {

        System.out.println(
            eventId + " - " +
            eventName + " - R" +
            ticketPrice + " - Tickets: " +
            availableTickets
        );
    }
}