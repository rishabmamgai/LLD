package org.example.creational.prototype;


public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(10, 12, "Original Shape");
        System.out.println(shape.getType());

        Shape clonedShape = shape.cloneShape();
        System.out.println(clonedShape.getType());
    }
}
