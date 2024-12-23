package org.example.abstractFactory;

import org.example.abstractFactory.shapes.Shape;


public class ShapeFactory {
    ShapeAbstractFactory factory;
    Shape shape;

    public ShapeFactory(ShapeAbstractFactory shapeFactory, String shape) {
        this.factory = shapeFactory;
        this.shape = this.factory.getShape(shape);
    }

    public String drawShape() {
        return shape.drawShape();
    }
}
