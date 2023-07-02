package org.example.creational.abstractfactory.color;

import org.example.creational.abstractfactory.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String color) {
        return switch(color) {
            case "red" -> new Red();
            case "brown" -> new Brown();
            default -> throw new IllegalArgumentException("no such color is defined");
        };
    }
}
