package org.example.creational.singleton;

public class Demo {
    public static void main(String[] args) {
        ClassSingleton singleton = ClassSingleton.getInstance();
        ClassSingleton singleton2 = ClassSingleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE.getInstance();
        System.out.println(enumSingleton.getInfo());

        InternalClassSingleton internalClassSingleton = InternalClassSingleton.getInstance();
        System.out.println(internalClassSingleton.hashCode());
    }
}
