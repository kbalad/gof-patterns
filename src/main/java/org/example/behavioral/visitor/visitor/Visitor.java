package org.example.behavioral.visitor.visitor;

import org.example.behavioral.visitor.element.JsonElement;
import org.example.behavioral.visitor.element.XmlElement;

public interface Visitor {

    void visit(JsonElement e);
    void visit(XmlElement e);

}
