package org.example.mediator;

import org.example.mediator.planes.Plane;


public interface Mediator {
    void addPlane(Plane plane);
    void requestTakeOff(Plane plane);
    void requestLanding(Plane plane);
}
