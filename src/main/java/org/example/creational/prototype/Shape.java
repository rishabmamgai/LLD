package org.example.creational.prototype;

import lombok.Getter;


public class Shape {
    private final int  x;
    private final int y;

    @Getter
    private final String type;

    public Shape(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public Shape cloneShape() {
        return new Shape(this.x, this.y, "Cloned Shape");
    }
}
