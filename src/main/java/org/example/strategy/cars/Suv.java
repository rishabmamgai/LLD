package org.example.strategy.cars;

import org.example.strategy.driveStrategy.Drivable;


public class Suv extends Car {
    public Suv(Drivable drivable) {
        super(drivable);
    }

    @Override
    public String getCarType() {
        return "Suv";
    }
}
