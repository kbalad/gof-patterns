package org.example.behavioral.state;

public class TVOnState implements State {
    @Override
    public void doAction() {
        System.out.println("TV turned off");
    }
}
