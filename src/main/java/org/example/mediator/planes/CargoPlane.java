package org.example.mediator.planes;

import org.example.mediator.Mediator;


public class CargoPlane extends Plane {
    public CargoPlane(String name, Mediator mediator) {
        super(mediator, name);
    }

    @Override
    public void requestTakeOff() {
        mediator.requestTakeOff(this);
    }

    @Override
    public void requestLanding() {
        mediator.requestLanding(this);
    }

    @Override
    public void notifyPlane(String message) {
        System.out.println(message);
    }
}
