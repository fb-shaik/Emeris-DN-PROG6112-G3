package com.mycompany.lu2.inheritance_demo_animals;

/**
 * Concrete subclass representing a Bird[cite: 19].
 * 
 * CORE OOP CONCEPTS:
 * - Inheritance: Utilizes the 'extends' keyword to inherit common Animal attributes[cite: 19].
 * - Specialization: Introduces flight characteristics (wingSpan, canFly, beakType) and actions[cite: 19].
 */
public class Bird extends Animal {

    // Subclass-exclusive attributes[cite: 19]
    double wingSpan;
    boolean canFly;
    String beakType;

    /**
     * Action unique to birds: flying[cite: 19].
     */
    public void fly() {
        System.out.println(name + " is flying"); //[cite: 19]
    }

    /**
     * Action unique to birds: flapping wings[cite: 19].
     */
    public void flapWings() {
        System.out.println(name + " is flapping its wings"); //[cite: 19]
    }

    /**
     * Action unique to birds: nest building[cite: 19].
     */
    public void buildNest() {
        System.out.println(name + " is building a nest"); //[cite: 19]
    }
}