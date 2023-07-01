package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String color) {
        for (Shape s: shapes) {
            s.draw(color);
        }
    }

    public void add(Shape s) {
        shapes.add(s);
    }

    public void clear() {
        System.out.println("Clear drawing");
        shapes = new ArrayList<>();
    }

}
