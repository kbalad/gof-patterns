package org.example.structural.bridge.shape;

import org.example.structural.bridge.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Circle draw with color: " + color.fill();
    }
}
