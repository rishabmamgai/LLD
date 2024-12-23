package org.example.strategy.cars;

import org.example.strategy.driveStrategy.Drivable;


public class Coupe extends Car {
    public Coupe(Drivable drivable) {
        super(drivable);
    }

    @Override
    public String getCarType() {
        return "Coupe";
    }
}
