package org.example.factory.shapes;

public interface Shape {
    String getName();

    default String drawShape() {
        return "Drawing " + this.getName();
    }
}
