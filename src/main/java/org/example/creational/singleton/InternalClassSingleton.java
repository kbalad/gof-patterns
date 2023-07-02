package org.example.creational.singleton;

public class InternalClassSingleton {

    private InternalClassSingleton() {
    }

    private static final class InternalClassSingletonHolder {
        public static final InternalClassSingleton instance = new InternalClassSingleton();
    }

    public static InternalClassSingleton getInstance() {
        return InternalClassSingletonHolder.instance;
    }

}
