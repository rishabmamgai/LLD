package org.example.structural.bridge.cars;

import org.example.structural.bridge.driveStrategy.Drivable;


public class Coupe extends Car {
    public Coupe(Drivable drivable) {
        super(drivable);
    }

    @Override
    public String getCarType() {
        return "Coupe";
    }
}
