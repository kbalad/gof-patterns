package org.example.structural.bridge.shape;

import org.example.structural.bridge.color.Color;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Triangle draw with color: " + color.fill();
    }
}
