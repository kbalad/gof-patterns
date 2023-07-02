package org.example.creational.factory;

import org.example.creational.factory.material.IronMetal;
import org.example.creational.factory.material.Material;
import org.example.creational.factory.material.Oxygen2;
import org.example.creational.factory.material.Water;

public class MaterialFactory {

    public static Material getProbableMaterial(double density) {
        Material res;
        if (Double.compare(density, 1_000) == 0) {
            res = new Water();
        } else if (Double.compare(density, 7_860) == 0) {
            res = new IronMetal();
        } else if (Double.compare(density, 1.429) == 0) {
            res = new Oxygen2();
        } else {
            throw new IllegalArgumentException("No material for provided density!");
        }
        return res;
    }

}
