package com.mycompany.lu2_game_characters_inheritance;

public class LU2_Game_Characters_Inheritance {

    public static void main(String[] args) {
        // --- 1. Direct Subclass Instantiation ---
        Warrior subZero = new Warrior();
        subZero.name = "Bi-Han";
        subZero.level = 90;
        subZero.health = 100;
        subZero.weapon = "Ice arrows";

        subZero.attack();       // Inherited method[cite: 14, 15]
        subZero.move();         // Overridden method[cite: 15, 16]
        subZero.displayInfo();  // Inherited method[cite: 14, 15]
        subZero.fightStyle();   // Subclass-exclusive method[cite: 15, 16]

        System.out.println();

        // --- 2. Second Subclass Instance ---
        Warrior scorpion = new Warrior();
        scorpion.name = "Hanzo";
        scorpion.level = 85;
        scorpion.health = 100;
        scorpion.weapon = "Spear";

        scorpion.attack();
        scorpion.move();
        scorpion.displayInfo();
        scorpion.fightStyle();

        System.out.println();

        // --- 3. Parent Class Instantiation ---[cite: 15]
        GameCharacter gc = new GameCharacter();
        gc.name = "Alex";
        gc.move(); // Executes base class move() without Warrior modifications[cite: 14, 15]

        System.out.println();

        // --- 4. Polymorphic Reference (Upcasting) ---[cite: 15]
        // Parent class reference pointing to a child class instance in memory[cite: 15]
        GameCharacter raiden = new Warrior(); 

        raiden.name = "Raiden";
        raiden.health = 100;
        raiden.level = 95;

        raiden.attack();
        raiden.displayInfo();

        // Dynamic Method Dispatch: Executes Warrior's overridden move() at runtime[cite: 15, 16]
        raiden.move();
    }
}