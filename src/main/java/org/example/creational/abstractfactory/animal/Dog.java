package org.example.creational.abstractfactory.animal;

public class Dog implements Animal {

    @Override
    public String makeSound() {
        return "bark";
    }

    @Override
    public String getName() {
        return "dog";
    }
}
