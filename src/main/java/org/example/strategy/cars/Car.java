package org.example.strategy.cars;

import org.example.strategy.driveStrategy.Drivable;


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
