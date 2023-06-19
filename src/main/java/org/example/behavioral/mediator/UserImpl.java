package org.example.behavioral.mediator;

public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println("[SEND] User " + name + " message \"" + msg + "\".");
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("[RECV] User " + name + " message \"" + msg + "\".");
    }
}
