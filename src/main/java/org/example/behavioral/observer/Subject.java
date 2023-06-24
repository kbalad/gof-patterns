package org.example.behavioral.observer;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);

    Object getUpdate(Observer observer);
    void notifyObservers();

    String getName();
}
