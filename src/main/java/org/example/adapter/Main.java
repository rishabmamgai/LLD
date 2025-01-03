package org.example.adapter;

import org.example.adapter.adapters.SquarePegAdapter;
import org.example.adapter.circular.CircularHole;
import org.example.adapter.circular.CircularPeg;
import org.example.adapter.square.SquarePeg;


public class Main {
    public static void main(String[] args) {
        CircularHole hole = new CircularHole(4);
        CircularPeg circularPeg = new CircularPeg(3);
        System.out.println(hole.willFit(circularPeg));

        SquarePeg squarePeg = new SquarePeg(6);
//        hole.willFit(squarePeg);  This will not compile since "willFit" requires CircularPeg.

//        This will adapt SquarePeg to CircularPeg for "willFit".
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(hole.willFit(squarePegAdapter));
    }
}
