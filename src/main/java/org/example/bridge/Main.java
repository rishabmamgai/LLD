package org.example.bridge;

import org.example.bridge.cars.Car;
import org.example.bridge.cars.Suv;
import org.example.bridge.driveStrategy.AwdDrivable;


public class Main {
    public static void main(String[] args) {
        Car suvCar = new Suv(new AwdDrivable());
        System.out.println(suvCar.getCarType());
        System.out.println(suvCar.driveType());
    }
}
