package org.example.creational.abstractfactory.animal;

public class Cat implements Animal {

    @Override
    public String makeSound() {
        return "meow";
    }

    @Override
    public String getName() {
        return "cat";
    }
}
