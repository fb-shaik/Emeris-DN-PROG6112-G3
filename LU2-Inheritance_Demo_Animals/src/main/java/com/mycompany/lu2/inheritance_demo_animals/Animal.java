package com.mycompany.lu2.inheritance_demo_animals;

/**
 * Superclass representing the shared attributes and behaviors of all animals[cite: 17, 18].
 * 
 * CORE OOP CONCEPTS:
 * - Code Reusability: Common fields (name, age, weight) and methods (sleep, eat) are defined 
 *   once here rather than duplicated across individual animal classes[cite: 17, 18].
 * - Superclass / Base Class: Serves as the foundation that specialized child classes 
 *   (e.g., Dog, Bird) inherit from using the 'extends' keyword.
 */
public class Animal {

    // Common attributes shared across all animal types[cite: 17, 18]
    String name;
    int age;
    double weight;          // Weight measured in kilograms[cite: 18]

    boolean hasLimbs;
    int numberOfLimbs;

    String skinType;        // e.g., Fur, feathers, scales[cite: 18]
    String diet;            // e.g., Carnivore, herbivore, omnivore[cite: 18]
    String habitat;         // e.g., Domestic Home, forest, ocean[cite: 17, 18]
    String teethType;       // e.g., Sharp canines, flat molars[cite: 17, 18]
    boolean isNocturnal;    // True if active primarily at night[cite: 18]
    String wayOfMovement;   // e.g., Walks & Runs, fly, swim[cite: 17, 18]
    String sound;           // e.g., Barks, chirps[cite: 17, 18]

    /**
     * Prints the generic resting behavior[cite: 18].
     */
    public void sleep() {
        System.out.println(name + " is sleeping"); //[cite: 18]
    }

    /**
     * Prints dietary information using the assigned diet type[cite: 18].
     */
    public void eat() {
        System.out.println(name + " has a " + diet + " diet"); //[cite: 18]
    }

    /**
     * Prints movement behavior using the assigned movement type[cite: 18].
     */
    public void move() {
        System.out.println(name + " can " + wayOfMovement); //[cite: 18]
    }

    /**
     * Outputs the vocalization associated with the animal[cite: 18].
     */
    public void makeSound() {
        System.out.println(name + " " + sound); //[cite: 18]
    }

    /**
     * Displays a complete breakdown of all current animal properties[cite: 18].
     */
    public void displayInfo() {
        System.out.println("Animal Information: "); //[cite: 18]
        System.out.println("----------------------------"); //[cite: 18]
        System.out.println("Name: " + name); //[cite: 18]
        System.out.println("Age: " + age + " years"); //[cite: 18]
        System.out.println("Weight: " + weight + " kg"); //[cite: 18]
        System.out.println("Has Limbs: " + hasLimbs); //[cite: 18]
        System.out.println("Number of Limbs: " + numberOfLimbs); //[cite: 18]
        System.out.println("Skin Type: " + skinType); //[cite: 18]
        System.out.println("Diet Type: " + diet); //[cite: 18]
        System.out.println("Habitat: " + habitat); //[cite: 18]
        System.out.println("Teeth Type: " + teethType); //[cite: 18]
        System.out.println("Nocturnal: " + isNocturnal); //[cite: 18]
        System.out.println("Movement: " + wayOfMovement); //[cite: 18]
        System.out.println("Type of Sound: " + sound); //[cite: 18]
    }
}