package org.example;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    List<Animal> animals;

    public AnimalShelter() {
        this.animals = new ArrayList<>();
    }

    public <T extends Animal> void addAnimal(T animal) {
        animals.add(animal);
    }

    public void printAnimalSound(){
        System.out.println("The animals in the shelter are: ");
    }
}
