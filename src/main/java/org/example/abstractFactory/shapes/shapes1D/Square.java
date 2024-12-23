package org.example.abstractFactory.shapes.shapes1D;

import org.example.abstractFactory.shapes.Shape;


public class Square implements Shape {
    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public String drawShape() {
        return "Drawing 1D shape : " + this.getName();
    }
}
