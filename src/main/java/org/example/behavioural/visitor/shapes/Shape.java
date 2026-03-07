package org.example.behavioural.visitor.shapes;

import org.example.behavioural.visitor.visitors.Visitor;


public interface Shape {
    void visit(Visitor visitor);
}
