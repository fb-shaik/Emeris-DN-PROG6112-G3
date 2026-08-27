package com.mycompany.lu2_zoo_application_super;

/**
 * Concrete subclass representing an Elephant.
 * Inherits from Animal and introduces tusk status tracking[cite: 10].
 */
public class Elephant extends Animal {

    // Subclass-specific attribute[cite: 10]
    private boolean hasTusks;

    /**
     * Calls the superclass (Animal) constructor via super() and sets tusk status[cite: 10].
     */
    public Elephant(String name, int age, boolean hasTusks) {
        super(name, age);
        this.hasTusks = hasTusks; // Assigns the passed parameter value[cite: 10]
    }

    /**
     * Overrides the generic animal sound with an elephant-specific trumpet[cite: 10].
     */
    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }

    /**
     * Unique action exclusive to the Elephant class[cite: 10].
     */
    public void bath() {
        System.out.println("The elephant is taking a bath!");
    }
}