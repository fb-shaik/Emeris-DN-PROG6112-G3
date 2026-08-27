package com.mycompany.lu2_zoo_application_super;

/**
 * Concrete subclass representing a Giraffe[cite: 11].
 * Inherits from Animal and introduces a height attribute[cite: 11].
 */
public class Giraffe extends Animal {

    // Subclass-specific attribute[cite: 11]
    private double height;

    /**
     * Passes shared data to the Animal superclass constructor and assigns height[cite: 11].
     */
    public Giraffe(String name, int age, double height) {
        super(name, age);
        this.height = height;
    }

    /**
     * Overrides the generic animal sound with a giraffe-specific hum[cite: 11].
     */
    @Override
    public void makeSound() {
        System.out.println("Hum!");
    }

    /**
     * Unique action exclusive to the Giraffe class[cite: 11].
     */
    public void graze() {
        System.out.println("The giraffe is grazing.....");
    }
}