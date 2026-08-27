package com.mycompany.lu2_zoo_application_super;

/**
 * Superclass representing a generic animal[cite: 9].
 * 
 * CORE OOP CONCEPTS:
 * - Inheritance: Provides base properties (name, age) and behaviors (eat, displayInfo) 
 *   that all subclasses will inherit[cite: 9, 12].
 * - Encapsulation: Private instance variables restrict direct access, safeguarding data[cite: 9].
 * - Method Overriding Target: Provides a default makeSound() implementation intended 
 *   to be overridden by specific animal subclasses[cite: 8, 9, 11, 12].
 */
public class Animal {

    // Common fields inherited by all subclasses[cite: 9]
    private String name;
    private int age;

    /**
     * Initializes the common properties of an animal[cite: 9].
     * Uses 'this' to distinguish instance variables from constructor parameters[cite: 9].
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Generic sound method; overridden by derived animal classes for specific sounds[cite: 8, 9, 11, 12].
     */
    public void makeSound() {
        System.out.println("Some generic animal sounds.......");
    }

    /**
     * Simulates the animal eating using its specific name[cite: 9].
     */
    public void eat() {
        System.out.println(name + " is eating.");
    }

    /**
     * Displays the standard metadata for the animal[cite: 9].
     */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}