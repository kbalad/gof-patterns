package org.example.creational.singleton;

public class ClassSingleton {

    private static ClassSingleton INSTANCE;

    private ClassSingleton() { }

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ClassSingleton.class) {
                INSTANCE = new ClassSingleton();
            }
        }
        return INSTANCE;
    }

}
