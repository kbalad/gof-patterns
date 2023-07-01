package org.example.structural.composite;

public class Demo {
    public static void main(String[] args) {
        Drawing d = new Drawing();
        d.add(new Circle());
        d.add(new Triangle());
        d.draw("red");

        d.clear();
        d.add(new Circle());
        d.draw("blue");
    }
}
