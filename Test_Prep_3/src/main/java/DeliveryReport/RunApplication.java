/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DeliveryReport;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get information from user
        System.out.print("Enter driver name: ");
        String driverName = input.nextLine();

        System.out.print("Enter city: ");
        String city = input.nextLine();

        System.out.print("Enter total deliveries: ");
        int deliveryTotal = input.nextInt();

        // Create report object
        DeliveryReport report =
                new DeliveryReport(
                        driverName,
                        city,
                        deliveryTotal);

        // Display report
        report.printDeliveryReport();

        input.close();
    }
}