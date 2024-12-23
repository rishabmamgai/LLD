package org.example.factory;

import org.example.factory.shapes.Shape;


public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Circle");
        System.out.println(shape.drawShape());
    }
}
