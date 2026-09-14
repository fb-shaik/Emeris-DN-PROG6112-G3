
package com.mycompany.lu4_bookingapp_customexceptions;

import exceptions.*; 
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BookingSystem {
    //Global declared 
    Scanner input = new Scanner(System.in);
    ArrayList<Event> events = new ArrayList<>();
    
    
    public BookingSystem()
    {
        events.add (new Event(101, "Writers Conference", 20, 250));
        events.add(new Event(102, "Music Festival", 150, 100));
        events.add(new Event(103, "Tech Expo", 75, 150)); 
    }
   
    public void start()
    {
        boolean running = true;
        while (running)
        {
            System.out.println("\nEvent Booking System");
            System.out.println("1. View Events");
            System.out.println("2. Book Tickets");
            System.out.println("3. Exit");
            
            int choice = readInt("Choose: ");
            switch (choice)
            {
                case 1: viewEvents();
                break;
                case 2: bookTicket();
                break;
                case 3: running = false;
                default: System.out.println("Invalid Option");
            }
        }
        System.out.println("Program Ended");
        input.close();
    
    }

    private int readInt(String message) {
  while (true)
  {     try 
            {
                    System.out.println(message);
                    int number = input.nextInt();
                    input.nextLine();
                    return number;
            }
  
        catch(InputMismatchException e)
                {
                    System.out.println("Please enter a valid number.");
                    input.nextLine(); 
                }
  }
    
    
    }

    private void viewEvents() {
        System.out.println("\n=====EVENTS=====");
        for(Event event : events)
        {
            event.displayEvent();
        }
    }

   private void bookTicket() {

        viewEvents();

        int eventId = readInt(
            "\nEnter Event ID: "
        );

        try {

            Event event = findEvent(eventId);

            System.out.println(
                "Selected: " +
                event.getEventName()
            );

            int quantity = readInt(
                "Number of tickets: "
            );

            event.bookTickets(quantity);

            double total =
                quantity *
                event.getTicketPrice();

            System.out.println(
                "\nBooking successful!"
            );

            System.out.println(
                "Event: " +
                event.getEventName()
            );

            System.out.println(
                "Tickets: " +
                quantity
            );

            System.out.printf(
                "Total: R%.2f%n",
                total
            );

        } catch (EventNotFoundException e) {

            System.out.println(
                "ERROR: " +
                e.getMessage()
            );

        } catch (InvalidTicketQtyException e) {

            System.out.println(
                "ERROR: " +
                e.getMessage()
            );

        } catch (NotEnoughTicketsException e) {

            System.out.println(
                "ERROR: " +
                e.getMessage()
            );
        }
    }

    private Event findEvent(int id)
            throws EventNotFoundException {

        for (Event event : events) {

            if (event.getEventId() == id) {
                return event;
            }
        }

        throw new EventNotFoundException(
            "Event not found."
        );
    }
    
    
}
