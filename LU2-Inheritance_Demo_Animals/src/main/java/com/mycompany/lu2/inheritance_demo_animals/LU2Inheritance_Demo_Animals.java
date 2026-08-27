package com.mycompany.lu2.inheritance_demo_animals;

public class LU2Inheritance_Demo_Animals {

    public static void main(String[] args) {
        // ==========================================
        // 1. Instantiating and configuring a Child Object (Dog)
        // ==========================================
        Dog myDog = new Dog(); //

        // Populating inherited fields from the parent Animal class[cite: 17]
        myDog.name = "Buddy"; //[cite: 17]
        myDog.age = 4; //[cite: 17]
        myDog.weight = 18.5; //[cite: 17]
        myDog.hasLimbs = true; //[cite: 17]
        myDog.numberOfLimbs = 4; //[cite: 17]
        myDog.skinType = "Fur"; //[cite: 17]
        myDog.diet = "Carnivore"; //[cite: 17]
        myDog.habitat = "Domestic Home"; //[cite: 17]
        myDog.teethType = "Sharp Canines"; //[cite: 17]
        myDog.isNocturnal = false; //[cite: 17]
        myDog.wayOfMovement = "Walks & Runs"; //[cite: 17]
        myDog.sound = "Barks"; //[cite: 17]

        // Populating subclass-exclusive fields[cite: 17]
        myDog.breed = "Golden Retriever"; //[cite: 17]
        myDog.isTrained = false; //[cite: 17]

        // Executing inherited methods from Animal[cite: 17]
        System.out.println("==== Inherited Methods (Dog) ====");
        myDog.displayInfo(); //[cite: 17]
        myDog.eat(); //[cite: 17]
        myDog.sleep(); //[cite: 17]
        myDog.makeSound(); //[cite: 17]
        myDog.move(); //[cite: 17]

        // Executing subclass-exclusive methods[cite: 17]
        System.out.println("\n==== Exclusive Methods (Dog) ====");
        myDog.fetchBall(); //[cite: 17]
        myDog.guardHouse(); //[cite: 17]

        // ==========================================
        // 2. Instantiating a Parent Object (Animal)
        // ==========================================
        System.out.println("\n==== Direct Parent Instance (Animal) ====");
        Animal myAnimal = new Animal(); //[cite: 17]
        myAnimal.name = "Generic Wildlife";
        myAnimal.diet = "Herbivore";
        myAnimal.age = 10; //[cite: 17]
        myAnimal.eat(); //[cite: 17]

        // ==========================================
        // 3. Instantiating a second Child Object (Bird)
        // ==========================================
        System.out.println("\n==== Child Instance (Bird) ====");
        Bird myBird = new Bird(); //[cite: 17]
        myBird.name = "Blu";          // Inherited attribute[cite: 17]
        myBird.wingSpan = 10.0;       // Subclass-exclusive attribute[cite: 17]

        myBird.sleep();               // Inherited method[cite: 17]
        myBird.buildNest();           // Subclass-exclusive method[cite: 17]
    }
}