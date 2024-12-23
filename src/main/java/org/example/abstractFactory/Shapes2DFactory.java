package org.example.abstractFactory;

import org.example.abstractFactory.shapes.Shape;
import org.example.abstractFactory.shapes.shapes2D.Cube;
import org.example.abstractFactory.shapes.shapes2D.Cuboid;
import org.example.abstractFactory.shapes.shapes2D.Sphere;


public class Shapes2DFactory implements ShapeAbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return get2DShape(shape);
    }

    Shape get2DShape(String shape) {
        return switch (shape) {
            case "Circle" -> new Sphere();
            case "Square" -> new Cube();
            case "Rectangle" -> new Cuboid();
            default -> null;
        };
    }
}
