
package com.mycompany.lu1_enum_demo;
import java.util.Scanner;

public class LU1_Enum_Demo
{
    /*
        An enum stores a fixed collection of related constants.

        In this application, the Day enum stores the seven valid
        days of the week.
    */
    public enum Day
    {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args)
    {
        // Create a Scanner object to capture keyboard input.
        Scanner input = new Scanner(System.in);

        // Display the application heading.
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("       DAYS OF THE WEEK");
        System.out.println("++++++++++++++++++++++++++++");

        /*
            The values() method returns all the constants declared
            inside the Day enum.

            The constants are returned and stored in an array.

            Array positions:
            days[0] = MONDAY
            days[1] = TUESDAY
            days[2] = WEDNESDAY
            ...
            days[6] = SUNDAY
        */
        Day[] days = Day.values();

        // Display the menu.
        System.out.println("\nSelect a day:");

        for (int index = 0; index < days.length; index++)
        {
            /*
                Array positions begin at 0.

                We add 1 to the index so that the menu is displayed
                from 1 to 7 instead of 0 to 6.
            */
            System.out.println((index + 1) + ". " + days[index]);
        }

        // Variable used to store the user's menu selection.
        int choice;

        /*
            Use a loop to ensure that the user enters a valid menu
            number between 1 and 7.
        */
        while (true)
        {
            System.out.print("\nEnter your choice (1-7): ");

            // Check whether the user entered a whole number.
            if (input.hasNextInt())
            {
                choice = input.nextInt();

                // Check whether the number is within the valid range.
                if (choice >= 1 && choice <= days.length)
                {
                    // Exit the loop when the input is valid.
                    break;
                }
                else
                {
                    System.out.println(
                        "Invalid choice. Please select a number from 1 to 7."
                    );
                }
            }
            else
            {
                System.out.println(
                    "Invalid input. Please enter a whole number."
                );

                /*
                    Remove the invalid value from the Scanner
                    before asking the user again.
                */
                input.next();
            }
        }

        /*
            Convert the user's menu number into the corresponding
            enum constant.

            We subtract 1 because array positions begin at 0.

            Example:
            User enters 1
            days[1 - 1]
            days[0]
            MONDAY
        */
        Day selectedDay = days[choice - 1];

        System.out.println("\nYou selected: " + selectedDay);

        /*
            A switch statement can work directly with enum constants.

            Each case represents one possible Day value.
        */
        switch (selectedDay)
        {
            case MONDAY:
                System.out.println("Monday is the start of the working week.");
                break;

            case TUESDAY:
                System.out.println("Tuesday is the second day of the working week.");
                break;

            case WEDNESDAY:
                System.out.println("Wednesday is the middle of the working week.");
                break;

            case THURSDAY:
                System.out.println("Thursday is almost the end of the working week.");
                break;

            case FRIDAY:
                System.out.println("Friday is the final day of the working week.");
                break;

            case SATURDAY:
                System.out.println("Saturday is part of the weekend.");
                break;

            case SUNDAY:
                System.out.println("Sunday is a day to rest and prepare for Monday.");
                break;
        }

        // Close the Scanner when it is no longer required.
        input.close();
    }
}

/*
    ENUM NOTES
    ----------

    enum means enumeration.

    An enum is a special Java type used to represent a fixed
    collection of related constants.

    Enum syntax:

    accessSpecifier enum EnumName
    {
        CONSTANT_ONE,
        CONSTANT_TWO,
        CONSTANT_THREE
    }

    Example:

    public enum Day
    {
        MONDAY,
        TUESDAY,
        WEDNESDAY
    }

    Benefits of using enums:

    - Provides better validation.
    - Prevents spelling errors.
    - Makes code clearer.
    - Provides type safety.
    - Makes applications easier to maintain.
    - Works well with switch statements.
    - Keeps related constants in one central place.
*/