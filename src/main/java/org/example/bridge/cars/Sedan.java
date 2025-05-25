package org.example.bridge.cars;

import org.example.bridge.driveStrategy.Drivable;


public class Sedan extends Car {
    public Sedan(Drivable drivable) {
        super(drivable);
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
