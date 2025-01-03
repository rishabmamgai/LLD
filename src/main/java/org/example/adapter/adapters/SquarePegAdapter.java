package org.example.adapter.adapters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.adapter.circular.CircularPeg;
import org.example.adapter.square.SquarePeg;


@Getter
@AllArgsConstructor
public class SquarePegAdapter extends CircularPeg {
    private SquarePeg peg;

    public double getRadius() {
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}
