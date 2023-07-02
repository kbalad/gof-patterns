package org.example.structural.facade;

public class Demo {
    public static void main(String[] args) {
        CarEngineFacade facade = new CarEngineFacade();
        System.out.println("================START");
        facade.startEngine();
        System.out.println("================STOP");
        facade.stopEngine();
        System.out.println("================END");
    }
}
