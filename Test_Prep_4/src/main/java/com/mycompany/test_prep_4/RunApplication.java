/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_prep_4;


import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Student names
        String[] students = {
            "John",
            "Sarah",
            "Peter"
        };

        // Subject names
        String[] subjects = {
            "Programming",
            "Database"
        };

        // 2D array for marks
        int[][] marks = new int[3][2];

        // 1D array for student totals
        int[] totals = new int[3];

        // ---------------------------------
        // GET MARKS
        // ---------------------------------

        for (int i = 0; i < students.length; i++) {

            for (int j = 0; j < subjects.length; j++) {

                System.out.print("Enter "
                        + subjects[j]
                        + " mark for "
                        + students[i] + ": ");

                marks[i][j] = input.nextInt();
            }
        }

        // ---------------------------------
        // DISPLAY RESULTS
        // ---------------------------------

        System.out.println();
        System.out.println("STUDENT RESULTS REPORT");
        System.out.println("------------------------------------------");

        System.out.printf("%-15s %-15s %-15s%n",
                "STUDENT",
                "PROGRAMMING",
                "DATABASE");

        for (int i = 0; i < students.length; i++) {

            System.out.printf("%-15s %-15d %-15d%n",
                    students[i],
                    marks[i][0],
                    marks[i][1]);
        }

        // ---------------------------------
        // CALCULATE TOTALS
        // ---------------------------------

        for (int i = 0; i < students.length; i++) {

            totals[i] = marks[i][0] + marks[i][1];
        }

        // Display totals
        System.out.println();
        System.out.println("TOTAL MARKS FOR EACH STUDENT");
        System.out.println("------------------------------------------");

        for (int i = 0; i < students.length; i++) {

            System.out.println(
                    students[i] + ": " + totals[i]);
        }

        // ---------------------------------
        // FIND HIGHEST TOTAL
        // ---------------------------------

        int highest = 0;

        for (int i = 1; i < totals.length; i++) {

            if (totals[i] > totals[highest]) {
                highest = i;
            }
        }

        System.out.println();
        System.out.println(
                "STUDENT WITH THE HIGHEST TOTAL: "
                + students[highest]);

        // ---------------------------------
        // CREATE OBJECTS
        // ---------------------------------

        System.out.println();
        System.out.println("INDIVIDUAL STUDENT RESULTS");
        System.out.println("------------------------------------------");

        for (int i = 0; i < students.length; i++) {

            for (int j = 0; j < subjects.length; j++) {

                // Create an object using array data
                StudentResultReport report =
                        new StudentResultReport(
                                students[i],
                                subjects[j],
                                marks[i][j]);

                // Print the object's information
                report.printStudentResult();
            }
        }

        input.close();
    }
}