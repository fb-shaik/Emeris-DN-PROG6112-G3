package com.mycompany.lu2_zoo_application_super;

import java.util.ArrayList;

/**
 * Manages an aggregation of Animal objects using an ArrayList.
 * Demonstrates polymorphism by treating all subclasses uniformly as Animal references[cite: 8].
 */
public class Zoo {

    // Dynamic collection holding any Animal or subclass instance[cite: 8]
    private ArrayList<Animal> animals = new ArrayList<>();

    /**
     * Adds an Animal (or any of its subclasses) to the zoo collection[cite: 8].
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * Iterates through the collection, invoking polymorphic methods on each animal[cite: 8].
     */
    public void showAllAnimals() {
        for (Animal animal : animals) {
            animal.displayInfo(); // Inherited shared method[cite: 8, 9]
            animal.makeSound();   // Dynamically dispatches the overridden subclass sound[cite: 8]
            System.out.println();
        }
    }
}