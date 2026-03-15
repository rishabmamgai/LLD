package org.example.structural.bridge.cars;

import org.example.structural.bridge.driveStrategy.Drivable;


public class Sedan extends Car {
    public Sedan(Drivable drivable) {
        super(drivable);
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
