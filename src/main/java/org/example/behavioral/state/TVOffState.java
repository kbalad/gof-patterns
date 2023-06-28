package org.example.behavioral.state;

public class TVOffState implements State {
    @Override
    public void doAction() {
        System.out.println("TV turned on");
    }
}
