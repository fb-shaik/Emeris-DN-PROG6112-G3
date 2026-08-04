package com.mycompany.lu1_campusit_arraylist_app;

import java.util.ArrayList; //import statement needed

/*
 * Manages the student IT help tickets.
 * The ArrayList can grow and shrink while the program is running.
 */
public class TicketManager {

    //ClassName<Type> arrayListName; 
    // The ArrayList stores SupportTicket objects.
    private ArrayList<SupportTicket> tickets;  //= new ArrayList();

    /**
     * Creates an empty ArrayList.
     */
    public TicketManager() {
        tickets = new ArrayList<>();
    }

    /**
     * Adds a ticket to the ArrayList.
     */
    public void addTicket(SupportTicket ticket) {

        tickets.add(ticket); //a new SupportTicket object has been added to the ArrayList called tickets

        System.out.println(
                "Ticket " + ticket.getTicketNumber()
                + " was added."
        );
    }

    /* Displays all tickets in the ArrayList.*/
    public void displayAllTickets() {
        System.out.println("\nSTUDENT IT HELP TICKETS");
        System.out.println("=======================");
        // Check whether the ArrayList is empty.
        if (tickets.isEmpty()) {
            System.out.println("No tickets have been added.");
            return;
        }
        // Visit and display every ticket in the ArrayList.
        for (SupportTicket ticket : tickets) {
            System.out.println(ticket);
            System.out.println("-----------------------");
        }
    }
    /* Searches for a ticket using its ticket number. @return the matching ticket, or null if it is not found*/
    public SupportTicket findTicket(int ticketNumber) {
        // Check each ticket stored in the ArrayList.
        for (SupportTicket ticket : tickets) {
            if (ticket.getTicketNumber() == ticketNumber) {
                return ticket;
            }
        }
        // null means that the ticket was not found.
        return null;
    }

   /*Marks a ticket as resolved.*/
public void resolveTicket(int ticketNumber) {
    // Search for the ticket using its ticket number.
    SupportTicket ticket = findTicket(ticketNumber);
    // Check whether the ticket was found.
    if (ticket == null) {
        System.out.println("Ticket not found.");
    } else {
        // Change the resolved field to true.
        ticket.setResolved(true);
        System.out.println(
                "Ticket " + ticketNumber + " has been resolved."
        );
    }
}

    /**
     * Returns the number of tickets stored. The size() method returns the number of objects currently stored in the ArrayList.
     */
    public int getNumberOfTickets() {
        return tickets.size();
    }
    
    /**
     * Removes a ticket from the ArrayList.
     */
    public void removeTicket(int ticketNumber) {

        // Search for the required ticket.
        SupportTicket ticket = findTicket(ticketNumber);

        if (ticket == null) {
            System.out.println("Ticket not found.");
        } else {

            // Remove the ticket object from the ArrayList.
            tickets.remove(ticket);

            System.out.println("Ticket removed.");
        }
    }
}