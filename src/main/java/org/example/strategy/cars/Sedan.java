package org.example.strategy.cars;

import org.example.strategy.driveStrategy.Drivable;


public class Sedan extends Car {
    public Sedan(Drivable drivable) {
        super(drivable);
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
