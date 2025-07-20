package org.example.mediator.planes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.mediator.Mediator;


@Getter
@AllArgsConstructor
public abstract class Plane {
    public Mediator mediator;
    public String name;

    public abstract void requestTakeOff();
    public abstract void requestLanding();
    public abstract void notifyPlane(String message);
}
