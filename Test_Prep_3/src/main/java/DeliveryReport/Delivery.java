/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryReport;

public abstract class Delivery implements IDelivery {

    // Variables
    private String driverName;
    private String city;
    private int deliveryTotal;

    // Constructor
    public Delivery(String driverName,
                    String city,
                    int deliveryTotal) {

        this.driverName = driverName;
        this.city = city;
        this.deliveryTotal = deliveryTotal;
    }

    // Get methods
    @Override
    public String getDriverName() {
        return driverName;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getDeliveryTotal() {
        return deliveryTotal;
    }
}