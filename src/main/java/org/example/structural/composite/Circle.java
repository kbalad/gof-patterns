package org.example.structural.composite;

class Circle implements Shape {

    @Override
    public void draw(String color) {
        System.out.println("Draw circle with color " + color);
    }

}
