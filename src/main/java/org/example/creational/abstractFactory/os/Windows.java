package org.example.creational.abstractFactory.os;


public class Windows implements OS {
    @Override
    public String getOSName() {
        return this.getClass().getSimpleName();
    }
}
