package org.example.creational.singleton;

public enum EnumSingleton {

    INSTANCE("Initial class info");

    private final String info;

    EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }
}
