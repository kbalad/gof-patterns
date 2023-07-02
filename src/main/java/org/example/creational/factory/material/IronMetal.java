package org.example.creational.factory.material;

public class IronMetal implements Material {
    @Override
    public double getDensityKgM() {
        return 7_860;
    }

    @Override
    public String toString() {
        return "IronMetal{}";
    }
}
