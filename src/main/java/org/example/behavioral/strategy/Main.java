package org.example.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        MessageSender sender = new MessageSenderImpl();
        String msg = "hello world!";

        sender.sendMessage(new FBMessenger(), msg);
        sender.sendMessage(new VKMessenger(), msg);
    }

}
