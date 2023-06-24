package org.example.behavioral.strategy;

public class FBMessenger implements MessengerStrategy {

    private static final String NAME = "Facebook";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void send(String msg) {
        System.out.printf("[%s] sending message: %s%n", NAME, msg);
    }
}
