package org.example.factory.factories;

import org.example.factory.shapes.Circle;
import org.example.factory.shapes.Shape;


public class CircleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        // Some logic before object instantiation.
        return new Circle();
    }
}
