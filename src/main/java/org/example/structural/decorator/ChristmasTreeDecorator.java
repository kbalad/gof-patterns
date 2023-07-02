package org.example.structural.decorator;

public class ChristmasTreeDecorator implements ChristmasTree {

    private final ChristmasTree tree;

    public ChristmasTreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
