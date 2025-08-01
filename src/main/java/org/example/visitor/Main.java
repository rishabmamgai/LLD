package org.example.visitor;

import org.example.visitor.shapes.Circle;
import org.example.visitor.shapes.Square;
import org.example.visitor.visitors.AreaVisitor;
import org.example.visitor.visitors.PerimeterVisitor;


public class Main {
    public static void main(String[] args) {
        AreaVisitor areaVisitor = new AreaVisitor();
        PerimeterVisitor perimeterVisitor = new PerimeterVisitor();

        Square square1 = new Square(4);
        square1.visit(areaVisitor);

        Circle circle1 = new Circle(7);
        circle1.visit(perimeterVisitor);

        Circle circle2 = new Circle(14);
        circle2.visit(areaVisitor);

        Square square2 = new Square(8);
        square2.visit(perimeterVisitor);
    }
}
