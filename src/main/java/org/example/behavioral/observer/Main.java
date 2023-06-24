package org.example.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        TopicSubject topic = new TopicSubject("BROKER");

        Observer observer1 = new ObserverImpl("google");
        Observer observer2 = new ObserverImpl("yandex");
        Observer observer3 = new ObserverImpl("facebook");
        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        topic.register(observer1);
        topic.postMessage("msg1");
        System.out.println("========");

        topic.unregister(observer1);
        topic.register(observer2);
        topic.register(observer3);
        topic.postMessage("msg2");
        System.out.println("========");

        observer1.update();
    }
}
