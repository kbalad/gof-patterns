package org.example.behavioral.state;

public class TVControllerContext implements State {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        state.doAction();
    }
}
