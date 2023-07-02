package org.example.structural.bridge;

import org.example.structural.bridge.color.Blue;
import org.example.structural.bridge.color.Red;
import org.example.structural.bridge.shape.Circle;
import org.example.structural.bridge.shape.Shape;
import org.example.structural.bridge.shape.Triangle;

public class Demo {
    public static void main(String[] args) {
        Shape shape = new Triangle(new Red());
        System.out.println(shape.draw());

        shape = new Circle(new Blue());
        System.out.println(shape.draw());

    }
}
