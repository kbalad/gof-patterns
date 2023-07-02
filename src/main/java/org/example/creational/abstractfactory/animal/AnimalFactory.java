package org.example.creational.abstractfactory.animal;

import org.example.creational.abstractfactory.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String sound) {
        return switch (sound) {
            case "meow" -> new Cat();
            case "bark" -> new Dog();
            default -> throw new IllegalArgumentException("no animal makes sound " + sound);
        };
    }
}
