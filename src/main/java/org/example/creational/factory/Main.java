package org.example.creational.factory;

import org.example.creational.factory.factories.CircleFactory;
import org.example.creational.factory.factories.RectangleFactory;
import org.example.creational.factory.factories.ShapeFactory;
import org.example.creational.factory.factories.SquareFactory;


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
