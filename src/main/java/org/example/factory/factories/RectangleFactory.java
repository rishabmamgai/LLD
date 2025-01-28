package org.example.factory.factories;

import org.example.factory.shapes.Rectangle;
import org.example.factory.shapes.Shape;


public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        // Some logic before object instantiation.
        return new Rectangle();
    }
}
