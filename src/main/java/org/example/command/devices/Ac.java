package org.example.command.devices;


public class Ac implements Device {
    public void turnOn() {
        System.out.println("Turning on Ac....");
    }

    public void turnOff() {
        System.out.println("Turning off Ac....");
    }
}
