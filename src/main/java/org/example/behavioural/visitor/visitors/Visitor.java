package org.example.behavioural.visitor.visitors;

import org.example.behavioural.visitor.shapes.Circle;
import org.example.behavioural.visitor.shapes.Square;


public interface Visitor {
    void visit(Circle circle);
    void visit(Square square);
}
