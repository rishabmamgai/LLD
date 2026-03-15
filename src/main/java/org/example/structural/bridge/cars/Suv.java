package org.example.structural.bridge.cars;

import org.example.structural.bridge.driveStrategy.Drivable;


public class Suv extends Car {
    public Suv(Drivable drivable) {
        super(drivable);
    }

    @Override
    public String getCarType() {
        return "Suv";
    }
}
