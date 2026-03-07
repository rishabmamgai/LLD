package org.example.behavioural.visitor.visitors;

import org.example.behavioural.visitor.shapes.Circle;
import org.example.behavioural.visitor.shapes.Square;


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
