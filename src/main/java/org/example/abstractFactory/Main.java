package org.example.abstractFactory;


public class Main {
    public static void main(String[] args) {
        ShapeAbstractFactory shapeAbstractFactory = new Shapes1DFactory();
        ShapeFactory shapeFactory = new ShapeFactory(shapeAbstractFactory, "Square");
        System.out.println(shapeFactory.drawShape());
    }
}
