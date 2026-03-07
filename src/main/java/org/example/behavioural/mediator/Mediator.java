package org.example.behavioural.mediator;

import org.example.behavioural.mediator.planes.Plane;


public interface Mediator {
    void addPlane(Plane plane);
    void requestTakeOff(Plane plane);
    void requestLanding(Plane plane);
}
