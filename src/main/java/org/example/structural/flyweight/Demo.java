package org.example.structural.flyweight;

public class Demo {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        String[] colors = new String[] {"red", "blue", "red"};
        for (String color: colors) {
            Vehicle car = factory.createVehicle(color);
            System.out.println("cur car: " + car.getColor());
            car.start();
            car.stop();
            System.out.println();
        }
    }
}
