package org.example.bridge.cars;

import org.example.bridge.driveStrategy.Drivable;


public class Suv extends Car {
    public Suv(Drivable drivable) {
        super(drivable);
    }

    @Override
    public String getCarType() {
        return "Suv";
    }
}
