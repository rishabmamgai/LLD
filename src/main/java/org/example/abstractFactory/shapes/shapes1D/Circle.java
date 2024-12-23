package org.example.abstractFactory.shapes.shapes1D;

import org.example.abstractFactory.shapes.Shape;


public class Circle implements Shape {
    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public String drawShape() {
        return "Drawing 1D shape : " + this.getName();
    }
}
