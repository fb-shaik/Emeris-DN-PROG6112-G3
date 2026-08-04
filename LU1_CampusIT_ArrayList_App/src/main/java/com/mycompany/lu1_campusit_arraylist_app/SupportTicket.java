
package com.mycompany.lu1_campusit_arraylist_app;

/*
    Represent the IT support request
    Ticket stores the following:
    - Unique ticket number
    - Name of the person requesting assistance
    - Problem category
    - Short desc. of the issue
    - Current ticket status

*/
public class SupportTicket {
    //create the fields - add in the access modifier (private) & dataType:
        private int ticketNumber;
        private String requesterName;
        private String category;
        private String probDescription;
        private boolean resolved;         
    
    //create a parameterised constructor: Every object needs to have the following when its being created
    public SupportTicket(int ticketNumber, String requesterName, String category, String probDescription) {
        this.ticketNumber = ticketNumber;
        this.requesterName = requesterName;
        this.category = category;
        this.probDescription = probDescription;
        this.resolved = false; //every new ticket is set as being unresolved 
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public String getCategory() {
        return category;
    }

    public String getProbDescription() {
        return probDescription;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setTicketNumber(int ticketNumber) {
        //ticket numbers must be greater than zero
        if(ticketNumber <=0)
        {
            System.out.println("Ticket number must be greater than zero!"); 
        }
        
        this.ticketNumber = ticketNumber;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProbDescription(String probDescription) {
        //decsription should be at least 10 characters in lenght
        if(probDescription == null || probDescription.trim().length() <10)
        {
            System.out.println("Problem Description should contain at least 10 characters!");
        }
        this.probDescription = probDescription.trim();
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    @Override
    public String toString() {
        return "Ticket Number: " + ticketNumber +
                "\nRequester Name: " + requesterName +
                "\nCategory: " + category + 
                "\nProblem: " + probDescription +
                "\nStatus: " + isResolved();
    }

}
