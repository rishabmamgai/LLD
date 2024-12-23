package org.example.abstractFactory;

import org.example.abstractFactory.shapes.Shape;


public interface ShapeAbstractFactory {
    Shape getShape(String shape);
}
