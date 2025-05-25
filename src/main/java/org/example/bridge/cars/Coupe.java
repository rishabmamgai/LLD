package org.example.bridge.cars;

import org.example.bridge.driveStrategy.Drivable;


public class Coupe extends Car {
    public Coupe(Drivable drivable) {
        super(drivable);
    }

    @Override
    public String getCarType() {
        return "Coupe";
    }
}
