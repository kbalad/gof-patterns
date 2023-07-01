package org.example.structural.composite;

class Triangle implements Shape {

    @Override
    public void draw(String color) {
        System.out.println("Draw triangle with color " + color);
    }

}
