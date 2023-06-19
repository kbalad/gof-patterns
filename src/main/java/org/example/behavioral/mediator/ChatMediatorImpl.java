package org.example.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private final List<User> groupUsers;

    public ChatMediatorImpl() {
        this.groupUsers = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User from) {
        if (!groupUsers.contains(from)) {
            throw new IllegalArgumentException(String.format("The user %s is not in the group!", from));
        }

        for (User u: groupUsers) {
            // send messages to others
            if (!u.equals(from)) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        groupUsers.add(user);
    }
}
