package org.example.structural.bridge.color;

public class Blue implements Color {
    @Override
    public String fill() {
        return "filled with Blue color";
    }

    @Override
    public String toString() {
        return "Blue";
    }
}
