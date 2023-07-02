package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.animal.Animal;
import org.example.creational.abstractfactory.color.Color;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProvider.getFactory("Animal");

        System.out.println();
        System.out.println("Animals:");
        Animal animal = (Animal) factory.create("bark");
        System.out.println(animal.getName());

        animal = (Animal) factory.create("meow");
        System.out.println(animal.getName());

        factory = FactoryProvider.getFactory("Color");
        System.out.println();
        System.out.println("Colors:");

        Color color = (Color) factory.create("red");
        System.out.println(color.getColor());

        color = (Color) factory.create("brown");
        System.out.println(color.getColor());
    }
}
