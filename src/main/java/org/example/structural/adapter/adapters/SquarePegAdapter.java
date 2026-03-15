package org.example.structural.adapter.adapters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.structural.adapter.circular.CircularPeg;
import org.example.structural.adapter.square.SquarePeg;


@Getter
@AllArgsConstructor
public class SquarePegAdapter extends CircularPeg {
    private SquarePeg peg;

    public double getRadius() {
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}
