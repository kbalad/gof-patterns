package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TopicSubject implements Subject {

    private final List<Observer> observers;
    private final Object mutex = new Object();
    private final String topicName;

    private String msg;
    private boolean changed;

    public TopicSubject(String name) {
        observers = new ArrayList<>();
        topicName = name;
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new IllegalArgumentException("registered observer is null!");
        }
        synchronized (mutex) {
            if (observers.contains(observer)) {
                System.out.println("observer " + observer + " already registered!");
            } else {
                observers.add(observer);
                System.out.println("Add observer " + observer + " for topic " + topicName);
            }
        }
    }

    @Override
    public void unregister(Observer observer) {
        synchronized (mutex) {
            observers.remove(observer);
        }
        System.out.println("Delete observer " + observer + " for topic " + topicName);
    }

    @Override
    public Object getUpdate(Observer observer) {
        return msg;
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersCopy = Collections.emptyList();
        synchronized (mutex) {
            if (changed) {
                observersCopy = new ArrayList<>(observers);
                changed = false;
            }
        }
        for (Observer observer: observersCopy) {
            observer.update();
        }
    }

    @Override
    public String getName() {
        return topicName;
    }

    public void postMessage(String msg) {
        System.out.printf("[%s] posting new message: %s%n", topicName, msg);
        this.msg = msg;
        this.changed = true;
        notifyObservers();
    }
}
