package org.example.creational.factory.factories;

import org.example.creational.factory.shapes.Shape;
import org.example.creational.factory.shapes.Square;


public class SquareFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        // Some logic before object instantiation.
        return new Square();
    }
}
