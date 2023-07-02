package org.example.creational.factory.material;

public class Water implements Material {
    @Override
    public double getDensityKgM() {
        return 1000;
    }

    @Override
    public String toString() {
        return "Water{}";
    }
}
