package com.mycompany.lu1_campusit_arraylist_app;

/**
 * Demonstrates how an ArrayList can be used to manage
 * student IT help tickets.
 */
public class LU1_CampusIT_ArrayList_App {

    public static void main(String[] args) {

        // Create the object that manages the tickets.
        TicketManager ticketManager = new TicketManager();

        //=================================================
        // CREATE STUDENT IT HELP TICKETS
        //=================================================

        SupportTicket ticket1 = new SupportTicket(
                101,
                "Alex Young",
                "Wi-Fi",
                "Cannot connect to the campus Wi-Fi."
        );

        SupportTicket ticket2 = new SupportTicket(
                102,
                "Peter Pan",
                "Password",
                "Forgot the password for the student portal."
        );

        SupportTicket ticket3 = new SupportTicket(
                103,
                "Lisa Daniels",
                "Software",
                "Microsoft Teams is not opening."
        );

        //=================================================
        // ADD TICKETS TO THE ARRAYLIST
        //=================================================

        ticketManager.addTicket(ticket1);
        ticketManager.addTicket(ticket2);
        ticketManager.addTicket(ticket3);

        //=================================================
        // DISPLAY ALL TICKETS
        //=================================================

        ticketManager.displayAllTickets();

        //=================================================
        // DISPLAY THE NUMBER OF STORED TICKETS
        //=================================================

        System.out.println(
                "\nNumber of tickets: "
                + ticketManager.getNumberOfTickets()
        );

        //=================================================
        // SEARCH FOR A TICKET
        //=================================================

        System.out.println("\nSEARCH FOR TICKET 102");
        System.out.println("=====================");

        SupportTicket foundTicket =
                ticketManager.findTicket(102);

        if (foundTicket == null) {
            System.out.println("Ticket not found.");
        } else {
            System.out.println(foundTicket);
        }

        //=================================================
        // RESOLVE A TICKET
        //=================================================

        System.out.println("\nRESOLVE TICKET 102");
        System.out.println("==================");

        ticketManager.resolveTicket(102);

        // Display the tickets to see the updated status.
        ticketManager.displayAllTickets();

        //=================================================
        // REMOVE A TICKET
        //=================================================

        System.out.println("\nREMOVE TICKET 103");
        System.out.println("=================");

        ticketManager.removeTicket(103);

        // Display the final list.
        ticketManager.displayAllTickets();

        System.out.println(
                "\nNumber of tickets remaining: "
                + ticketManager.getNumberOfTickets()
        );
    }
}