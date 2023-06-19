package org.example.behavioral.mediator;

class Main {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User u1 = new UserImpl(mediator, "u1");
        mediator.addUser(u1);

        User u2 = new UserImpl(mediator, "u2");
        mediator.addUser(u2);

        User u3 = new UserImpl(mediator, "u3");
        mediator.addUser(u3);

        User u4 = new UserImpl(mediator, "u4");
        mediator.addUser(u4);

        u1.send("Hi everyone");
    }

}
