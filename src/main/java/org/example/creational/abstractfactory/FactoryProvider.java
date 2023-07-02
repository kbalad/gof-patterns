package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.animal.AnimalFactory;
import org.example.creational.abstractfactory.color.ColorFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        if ("Animal".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }

        return null;
    }

}
