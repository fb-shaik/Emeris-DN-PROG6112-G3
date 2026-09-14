/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rides;

public class BumperCars extends Ride {

    public BumperCars() {
        super("Bumper Cars", 6);
    }

    @Override
    public void checkSafety() {
        System.out.println("Seat belt checked!");
    }

    @Override
    public void startRide() {
        System.out.println("BEEP BEEP! Let's bump some cars!");
    }
}