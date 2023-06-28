package org.example.behavioral.visitor;

import org.example.behavioral.visitor.element.Element;
import org.example.behavioral.visitor.element.JsonElement;
import org.example.behavioral.visitor.element.XmlElement;
import org.example.behavioral.visitor.visitor.PrinterVisitor;
import org.example.behavioral.visitor.visitor.Visitor;

import java.util.List;

public class ElementProcessor {
    public static void main(String[] args) {
        List<Element> list = List.of(
                new JsonElement("head"),
                new JsonElement("blah"),
                new XmlElement("end")
        );

        Visitor printer = new PrinterVisitor();
        for (Element e: list) {
            e.accept(printer);
        }
        System.out.println("===============");

        Visitor counter = new CounterVisitor();
        for (Element e: list) {
            e.accept(counter);
        }
        System.out.println("===============");
    }
}
