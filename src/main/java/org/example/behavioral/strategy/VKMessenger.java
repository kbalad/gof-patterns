package org.example.behavioral.strategy;

public class VKMessenger implements MessengerStrategy {

    private static final String NAME = "VK";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void send(String msg) {
        System.out.printf("[%s] sending message: %s%n", NAME, msg);
    }
}
