/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rides;

import safety.SafetyCheck;

public abstract class Ride implements SafetyCheck {

    protected String rideName;
    protected int minimumAge;

    public Ride(String rideName, int minimumAge) {

        // Programmer assumption
        assert minimumAge >= 0 : "Minimum age cannot be negative";

        this.rideName = rideName;
        this.minimumAge = minimumAge;
    }

    public abstract void startRide();

    public void checkAge(int age) {

        if (age < minimumAge) {
            throw new IllegalArgumentException(
                "You must be at least " + minimumAge +
                " years old for " + rideName + "."
            );
        }
    }

    public String getRideName() {
        return rideName;
    }
}