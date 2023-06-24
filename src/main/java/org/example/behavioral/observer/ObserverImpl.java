package org.example.behavioral.observer;

public class ObserverImpl implements Observer {

    private final String name;
    private Subject subject;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) subject.getUpdate(this);
        String subjectName = subject.getName();

        if (msg == null) {
            System.out.printf("[%s] got new message from subject %s%n", name, subjectName);
        } else {
            System.out.printf("[%s] got message from subject %s: %s%n", name, subjectName, msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "ObserverImpl{" +
            "name='" + name + '\'' +
            '}';
    }
}
