package org.example.structural.bridge.color;

public class Red implements Color {
    @Override
    public String fill() {
        return "filled with Red color";
    }

    @Override
    public String toString() {
        return "Red";
    }
}
