package com.mycompany.lu2_game_characters_inheritance;

/**
 * Concrete subclass representing a specialized Warrior character[cite: 15, 16].
 * 
 * CORE OOP CONCEPTS:
 * - Inheritance: Extends GameCharacter using the 'extends' keyword[cite: 16].
 * - Method Overriding: Re-implements move() to add custom warrior behavior while 
 *   using 'super.move()' to preserve parent logic[cite: 16].
 * - Specialization: Adds unique attributes (ability, amour, weapon) and methods (fightStyle)[cite: 16].
 */
public class Warrior extends GameCharacter {

    // Attributes exclusive to Warrior[cite: 16]
    String ability;
    String amour;
    String weapon;

    public Warrior() {
        // Default constructor[cite: 16]
    }

    /**
     * Subclass-specific action utilizing the warrior's assigned weapon[cite: 16].
     */
    public void fightStyle() {
        System.out.println(name + "  attacks with a " + weapon + "!");
    }

    /**
     * Overrides the parent move() method[cite: 16].
     * Invokes the parent implementation via super.move() before adding custom behavior[cite: 16].
     */
    @Override
    public void move() {
        super.move(); // Executes parent class movement logic[cite: 16]
        System.out.println(name + " moves with speed & force!");
    }
}