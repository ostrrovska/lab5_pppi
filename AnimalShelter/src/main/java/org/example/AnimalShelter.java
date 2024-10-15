package org.example;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    List<Animal> animals;

    public AnimalShelter() {
        this.animals = new ArrayList<>();
    }

    public <T extends Animal> void addAnimal(T animal) {
        //needs to be done by someone
    }

    public void printAnimalSound(){
        //needs to be done by someone
    }
}
