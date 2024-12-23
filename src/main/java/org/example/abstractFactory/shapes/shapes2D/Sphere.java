package org.example.abstractFactory.shapes.shapes2D;

import org.example.abstractFactory.shapes.Shape;


public class Sphere implements Shape {
    @Override
    public String getName() {
        return "Sphere";
    }

    @Override
    public String drawShape() {
        return "Drawing 1D shape : " + this.getName();
    }
}
