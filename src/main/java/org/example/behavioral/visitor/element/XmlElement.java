package org.example.behavioral.visitor.element;

import org.example.behavioral.visitor.visitor.Visitor;

public class XmlElement extends Element {

    public XmlElement(String elementName) {
        super(elementName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
