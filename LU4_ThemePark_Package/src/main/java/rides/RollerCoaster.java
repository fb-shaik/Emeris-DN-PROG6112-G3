/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rides;

public class RollerCoaster extends Ride {

    public RollerCoaster() {
        super("Roller Coaster", 12);
    }

    @Override
    public void checkSafety() {
        System.out.println("Safety bar locked!");
    }

    @Override
    public void startRide() {
        System.out.println("WOOOOOO! Hold on tight!");
    }
}