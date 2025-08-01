package org.example.visitor.visitors;

import org.example.visitor.shapes.Circle;
import org.example.visitor.shapes.Square;


public interface Visitor {
    void visit(Circle circle);
    void visit(Square square);
}
