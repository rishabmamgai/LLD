package org.example.abstractFactory;

import org.example.abstractFactory.shapes.Shape;
import org.example.abstractFactory.shapes.shapes1D.Circle;
import org.example.abstractFactory.shapes.shapes1D.Rectangle;
import org.example.abstractFactory.shapes.shapes1D.Square;


public class Shapes1DFactory implements ShapeAbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return get1DShape(shape);
    }

    Shape get1DShape(String shape) {
        return switch (shape) {
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            case "Rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
