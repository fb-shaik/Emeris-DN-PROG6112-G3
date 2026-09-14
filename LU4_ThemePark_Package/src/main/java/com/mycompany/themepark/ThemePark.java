/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.themepark;
import java.util.Scanner;

import rides.Ride;
import rides.BumperCars;
import rides.RollerCoaster;

public class ThemePark {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("      WELCOME TO FUN PARK");
        System.out.println("=============================");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("\nChoose your ride:");
        System.out.println("1. Bumper Cars");
        System.out.println("2. Roller Coaster");

        System.out.print("Choice: ");
        int choice = input.nextInt();

        Ride ride;

        if (choice == 1) {
            ride = new BumperCars();
        }
        else if (choice == 2) {
            ride = new RollerCoaster();
        }
        else {
            System.out.println("Invalid ride!");
            input.close();
            return;
        }

        try {

            ride.checkAge(age);

            System.out.println(
                "\nWelcome aboard " + ride.getRideName() + ", " + name + "!"
            );

            ride.checkSafety();

            ride.startRide();

        }
        catch (IllegalArgumentException e) {

            System.out.println("\nACCESS DENIED!");
            System.out.println(e.getMessage());
        }

        input.close();
    }
}