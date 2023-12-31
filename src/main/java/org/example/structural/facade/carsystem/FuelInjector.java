package org.example.structural.facade.carsystem;

public class FuelInjector {
    private final FuelPump fuelPump = new FuelPump();

    public void on(){
        System.out.println("Fuel injector ready to inject fuel.");
    }

    public void inject() {
        fuelPump.pump();
        System.out.println("Fuel injected.");
    }

    public void off() {
        System.out.println("Stopping Fuel injector..");
    }
}
