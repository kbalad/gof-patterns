package org.example.behavioral.strategy;

public class MessageSenderImpl implements MessageSender {

    @Override
    public void sendMessage(MessengerStrategy strategy, String msg) {
        strategy.send(msg);
    }

}
