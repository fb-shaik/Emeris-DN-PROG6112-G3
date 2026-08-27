package com.mycompany.lu2_zoo_application_super;

/**
 * Concrete subclass representing a Lion[cite: 12].
 * Inherits from Animal and introduces a coat color attribute[cite: 12].
 */
public class Lion extends Animal {

    // Subclass-specific attribute[cite: 12]
    private String colour;

    /**
     * Passes shared data to the Animal superclass constructor using super()[cite: 12].
     */
    public Lion(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
    }

    /**
     * Overrides the generic animal sound with a lion-specific roar[cite: 12].
     */
    @Override
    public void makeSound() {
        System.out.println("Roar!!!");
    }

    /**
     * Unique action exclusive to the Lion class[cite: 12].
     */
    public void hunt() {
        System.out.println("The lion is hunting with the pack!");
    }
}