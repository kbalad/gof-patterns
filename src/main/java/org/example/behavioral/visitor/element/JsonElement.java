package org.example.behavioral.visitor.element;

import org.example.behavioral.visitor.visitor.Visitor;

public class JsonElement extends Element {

    public JsonElement(String elementName) {
        super(elementName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
