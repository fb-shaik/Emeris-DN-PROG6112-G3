package com.mycompany.lu2.inheritance_demo_animals;

/**
 * Concrete subclass representing a Dog.
 * 
 * CORE OOP CONCEPTS:
 * - Subclass / Child Class: Inherits all non-private state and behavior from Animal[cite: 17, 20].
 * - Specialization: Adds unique attributes (breed, isTrained) and methods (fetchBall, guardHouse) 
 *   exclusive to canines[cite: 17, 20].
 */
public class Dog extends Animal {

    // Subclass-exclusive attributes[cite: 17, 20]
    String breed;
    boolean isTrained;

    /**
     * Action unique to dogs: fetches a ball[cite: 20].
     */
    public void fetchBall() {
        System.out.println(name + " is happily fetching the ball"); //[cite: 20]
    }

    /**
     * Action unique to dogs: wags tail[cite: 20].
     */
    public void wagTail() {
        System.out.println(name + " is wagging its tail with excitement!"); //[cite: 20]
    }

    /**
     * Action unique to dogs: guards property[cite: 20].
     */
    public void guardHouse() {
        System.out.println(name + " is guarding the house & watching for strangers!"); //[cite: 20]
    }
}