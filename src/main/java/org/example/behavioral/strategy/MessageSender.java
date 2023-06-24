package org.example.behavioral.strategy;

public interface MessageSender {

    void sendMessage(MessengerStrategy strategy, String msg);
    
}
