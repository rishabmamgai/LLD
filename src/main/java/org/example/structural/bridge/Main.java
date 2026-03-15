package org.example.structural.bridge;

import org.example.structural.bridge.cars.Car;
import org.example.structural.bridge.cars.Suv;
import org.example.structural.bridge.driveStrategy.AwdDrivable;


public class Main {
    public static void main(String[] args) {
        Car suvCar = new Suv(new AwdDrivable());
        System.out.println(suvCar.getCarType());
        System.out.println(suvCar.driveType());
    }
}
