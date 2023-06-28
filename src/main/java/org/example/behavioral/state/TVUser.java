package org.example.behavioral.state;

public class TVUser {
    public static void main(String[] args) {

        TVControllerContext context = new TVControllerContext();

        context.setState(new TVOffState());
        context.doAction();

        context.setState(new TVOnState());
        context.doAction();

    }
}
