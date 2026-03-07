package org.example.behavioural.visitor;

import org.example.behavioural.visitor.shapes.Circle;
import org.example.behavioural.visitor.shapes.Square;
import org.example.behavioural.visitor.visitors.AreaVisitor;
import org.example.behavioural.visitor.visitors.PerimeterVisitor;


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
