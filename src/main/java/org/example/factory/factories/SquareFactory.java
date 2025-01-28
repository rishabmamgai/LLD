package org.example.factory.factories;

import org.example.factory.shapes.Shape;
import org.example.factory.shapes.Square;


public class SquareFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        // Some logic before object instantiation.
        return new Square();
    }
}
