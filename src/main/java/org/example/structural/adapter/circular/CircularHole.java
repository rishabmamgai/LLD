package org.example.structural.adapter.circular;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class CircularHole {
    private double radius;

    public boolean willFit(CircularPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
