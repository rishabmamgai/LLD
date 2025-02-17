package org.example.abstractFactory.os;


public class Windows implements OS {
    @Override
    public String getOSName() {
        return this.getClass().getSimpleName();
    }
}
