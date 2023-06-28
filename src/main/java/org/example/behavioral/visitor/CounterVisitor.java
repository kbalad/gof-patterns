package org.example.behavioral.visitor;

import org.example.behavioral.visitor.element.JsonElement;
import org.example.behavioral.visitor.element.XmlElement;
import org.example.behavioral.visitor.visitor.Visitor;

public class CounterVisitor implements Visitor {

    @Override
    public void visit(JsonElement e) {
        System.out.println("JSON: " + e.getElementName().length());
    }

    @Override
    public void visit(XmlElement e) {
        System.out.println("XML: " + e.getElementName().length());
    }
}
