package org.example.creational.factory.factories;

import org.example.creational.factory.shapes.Circle;
import org.example.creational.factory.shapes.Shape;


public class CircleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        // Some logic before object instantiation.
        return new Circle();
    }
}
