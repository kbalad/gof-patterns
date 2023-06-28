package org.example.behavioral.visitor.visitor;

import org.example.behavioral.visitor.element.JsonElement;
import org.example.behavioral.visitor.element.XmlElement;

public class PrinterVisitor implements Visitor {

    @Override
    public void visit(JsonElement e) {
        System.out.println("JSON: " + e.getElementName());
    }

    @Override
    public void visit(XmlElement e) {
        System.out.println("XML: " + e.getElementName());
    }

}
