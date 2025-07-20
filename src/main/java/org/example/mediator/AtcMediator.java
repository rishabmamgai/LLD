package org.example.mediator;

import org.example.mediator.planes.Plane;

import java.util.ArrayList;
import java.util.List;


public class AtcMediator implements Mediator {
    private final List<Plane> planes = new ArrayList<>();

    @Override
    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    @Override
    public void requestTakeOff(Plane plane) {
        planes.stream()
                .filter(pl -> pl != plane)
                .forEach(pl -> pl.notifyPlane("Clear runway for : " + plane.getName()));

        plane.notifyPlane(plane.getName() + " : permission granted to TakeOff.");
    }

    @Override
    public void requestLanding(Plane plane) {
        planes.stream()
                .filter(pl -> pl != plane)
                .forEach(pl -> pl.notifyPlane("Clear runway for : " + plane.getName()));

        plane.notifyPlane(plane.getName() + " : permission granted to Land.");
    }
}
