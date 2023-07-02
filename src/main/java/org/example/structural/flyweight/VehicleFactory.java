package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class VehicleFactory {

    private final Map<String, Vehicle> cars = new HashMap<>();

    public Vehicle createVehicle(String color) {
        return cars.computeIfAbsent(color, c -> new Car(new Engine(), c));
    }
}
