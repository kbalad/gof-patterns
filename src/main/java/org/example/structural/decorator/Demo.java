package org.example.structural.decorator;

public class Demo {
    public static void main(String[] args) {
        ChristmasTree tree = new ChristmasTreeImpl();
        String res = new BubbleLights(new BubbleLights(tree)).decorate();
        System.out.println(res);
    }
}
