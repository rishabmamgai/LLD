package org.example.bridge.cars;

import org.example.bridge.driveStrategy.Drivable;


public abstract class Car {
    Drivable drivable;

    public Car(Drivable drivable) {
        this.drivable = drivable;
    }

    public String driveType() {
        return drivable.getDriveMode();
    }

    abstract public String getCarType();
}
