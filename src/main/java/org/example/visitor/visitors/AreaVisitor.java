package org.example.visitor.visitors;

import org.example.visitor.shapes.Circle;
import org.example.visitor.shapes.Square;


public class AreaVisitor implements Visitor {

    @Override
    public void visit(Circle circle) {
        System.out.println("Area of circle = " + ((22/7) * (Math.pow(circle.getRadius(), 2))));
    }

    @Override
    public void visit(Square square) {
        System.out.println("Area of square = " + Math.pow(square.getSide(), 2));
    }
}
