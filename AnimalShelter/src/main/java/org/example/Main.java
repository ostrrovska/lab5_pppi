package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Labrador labrador = new Labrador();
        Cat cat = new Cat();
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.addAnimal(dog);
        animalShelter.addAnimal(labrador);
        animalShelter.addAnimal(cat);
        animalShelter.printAnimalSound();//needs to be tested when all methods are implemented
        //labrador.makeSound();// Test makeSound in Labrador
    }
}