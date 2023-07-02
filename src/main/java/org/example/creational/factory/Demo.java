package org.example.creational.factory;

import org.example.creational.factory.material.Material;

public class Demo {
    public static void main(String[] args) {
        Material material;
        double[] densities = new double[] {1000, 1.429, 7860};
        for (double d: densities) {
            material = MaterialFactory.getProbableMaterial(d);
            System.out.println(material + " density: " + material.getDensityKgM() + " kg/m3");
        }
    }
}
