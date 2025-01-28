package org.example.factory;

import org.example.factory.factories.CircleFactory;
import org.example.factory.factories.RectangleFactory;
import org.example.factory.factories.ShapeFactory;
import org.example.factory.factories.SquareFactory;


public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory1 = new CircleFactory();
        System.out.println(shapeFactory1.getShape().drawShape());

        ShapeFactory shapeFactory2 = new SquareFactory();
        System.out.println(shapeFactory2.getShape().drawShape());

        ShapeFactory shapeFactory3 = new RectangleFactory();
        System.out.println(shapeFactory3.getShape().drawShape());
    }
}
