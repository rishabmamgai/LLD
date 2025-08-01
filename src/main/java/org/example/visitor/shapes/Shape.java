package org.example.visitor.shapes;

import org.example.visitor.visitors.Visitor;


public interface Shape {
    void visit(Visitor visitor);
}
