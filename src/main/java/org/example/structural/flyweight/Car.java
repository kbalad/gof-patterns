package org.example.structural.flyweight;

class Car implements Vehicle {

    private final Engine engine;
    private final String color;

    public Car(Engine engine, String color) {
        this.engine = engine;
        this.color = color;

        // expensive operation
        try {
            Thread.sleep(2000);
            System.out.println("Created new car with color: " + color);
        } catch (InterruptedException e) {
            throw new RuntimeException("Error while creating new car", e);
        }
    }

    @Override
    public void start() {
        System.out.println("Car is starting!");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping!");
        engine.stop();
    }

    @Override
    public String getColor() {
        return color;
    }
}
