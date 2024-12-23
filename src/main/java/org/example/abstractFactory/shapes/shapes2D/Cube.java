package org.example.abstractFactory.shapes.shapes2D;

import org.example.abstractFactory.shapes.Shape;


public class Cube implements Shape {
    @Override
    public String getName() {
        return "Cube";
    }

    @Override
    public String drawShape() {
        return "Drawing 2D shape : " + this.getName();
    }
}
