package org.example.factory;

import org.example.factory.shapes.Circle;
import org.example.factory.shapes.Rectangle;
import org.example.factory.shapes.Shape;
import org.example.factory.shapes.Square;


public class ShapeFactory {
    public Shape getShape(String shape) {
        return switch (shape) {
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            case "Rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
