package org.example.behavioural.visitor.visitors;

import org.example.behavioural.visitor.shapes.Circle;
import org.example.behavioural.visitor.shapes.Square;


public class PerimeterVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Perimeter of circle = " + (2 * (22/7) * circle.getRadius()));
    }

    @Override
    public void visit(Square square) {
        System.out.println("Perimeter of square = " + (4 * square.getSide()));
    }
}
