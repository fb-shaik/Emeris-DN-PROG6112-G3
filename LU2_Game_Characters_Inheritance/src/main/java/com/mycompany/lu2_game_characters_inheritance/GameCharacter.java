package com.mycompany.lu2_game_characters_inheritance;

/**
 * Superclass representing a generic game character[cite: 14].
 * 
 * CORE OOP CONCEPTS:
 * - Base Class: Defines common attributes (name, health, level) and actions[cite: 14]
 *   inherited by specialized character types[cite: 15, 16].
 * - Method Overriding Target: Provides default implementations (such as move)[cite: 14] 
 *   that subclasses can extend or replace.
 */
public class GameCharacter {

    // Common attributes inherited by all character subclasses[cite: 14, 15]
    String name;
    int health;
    int level;

    /**
     * Default movement behavior shared by generic characters[cite: 14].
     */
    public void move() {
        System.out.println(name + " is moving");
    }

    /**
     * Standard attack action available to all characters[cite: 14, 15].
     */
    public void attack() {
        System.out.println(name + " attacks the enemy");
    }

    /**
     * Prints standard character statistics[cite: 14].
     */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Level: " + level);
    }
}