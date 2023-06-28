package org.example.behavioral.visitor.element;

import org.example.behavioral.visitor.visitor.Visitor;

public abstract class Element {

    private final String elementName;

    protected Element(String elementName) {
        this.elementName = elementName;
    }

    public String getElementName() {
        return elementName;
    }

    public abstract void accept(Visitor visitor);

}
