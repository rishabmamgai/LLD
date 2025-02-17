package org.example.abstractFactory.os;


public class Ubuntu implements OS {
    @Override
    public String getOSName() {
        return this.getClass().getSimpleName();
    }
}
