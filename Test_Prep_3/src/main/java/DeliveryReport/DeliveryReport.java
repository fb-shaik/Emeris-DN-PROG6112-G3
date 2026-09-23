/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryReport;


public class DeliveryReport extends Delivery {

    // Constructor
    public DeliveryReport(String driverName,
                          String city,
                          int deliveryTotal) {

        super(driverName, city, deliveryTotal);
    }

    // Display report
    public void printDeliveryReport() {

        System.out.println();
        System.out.println("DELIVERY REPORT");
        System.out.println("-----------------------------");

        System.out.println("DRIVER: "
                + getDriverName());

        System.out.println("CITY: "
                + getCity());

        System.out.println("TOTAL DELIVERIES: "
                + getDeliveryTotal());
    }
}