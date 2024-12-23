package org.example.strategy;

import org.example.strategy.cars.Car;
import org.example.strategy.cars.Suv;
import org.example.strategy.driveStrategy.AwdDrivable;
import org.example.strategy.driveStrategy.Drivable;


public class Main {
    public static void main(String[] args) {
        Drivable awdDrive = new AwdDrivable();
        Car suvCar = new Suv(awdDrive);
        System.out.println(suvCar.getCarType());
        System.out.println(suvCar.driveType());
    }
}
