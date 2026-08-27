package com.mycompany.lu2_zoo_application_super;

public class LU2_Zoo_Application_Super {

    public static void main(String[] args) {
        // 1. Initialize the Zoo collection manager[cite: 13]
        Zoo zoo = new Zoo();

        // 2. Instantiate specific child objects[cite: 13]
        Lion lion = new Lion("Simba", 5, "White");
        Elephant elephant = new Elephant("Dumbo", 10, true);
        Giraffe giraffe = new Giraffe("Melman", 7, 150.56);

        // 3. Register animals into the zoo (upcasting to Animal)[cite: 8, 13]
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(giraffe);

        // 4. Polymorphically display info and trigger distinct sounds[cite: 8, 13]
        zoo.showAllAnimals();

        // 5. Direct invocation on a specific subclass instance[cite: 13]
        elephant.makeSound();
    }
}