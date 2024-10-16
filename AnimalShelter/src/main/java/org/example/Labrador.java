package org.example;

public class Labrador extends Dog {
    @Override
    void makeSound() {
       super.makeSound();
       System.out.println("I'm Labrador");
    }
}
