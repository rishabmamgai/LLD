package org.example.creational.factory.factories;

import org.example.creational.factory.shapes.Rectangle;
import org.example.creational.factory.shapes.Shape;


public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        // Some logic before object instantiation.
        return new Rectangle();
    }
}
