package org.example.mediator;

import org.example.mediator.planes.CargoPlane;
import org.example.mediator.planes.CommercialPlane;
import org.example.mediator.planes.Plane;


public class Main {
    public static void main(String[] args) {
        AtcMediator atcMediator = new AtcMediator();

        Plane plane1 = new CommercialPlane("Liner-1", atcMediator);
        Plane plane2 = new CommercialPlane("Liner-2", atcMediator);
        Plane plane3 = new CargoPlane("Cargo-1", atcMediator);
        Plane plane4 = new CargoPlane("Cargo-2", atcMediator);

        atcMediator.addPlane(plane1);
        atcMediator.addPlane(plane2);
        atcMediator.addPlane(plane3);
        atcMediator.addPlane(plane4);

        plane1.requestLanding();
        plane2.requestTakeOff();
        plane3.requestTakeOff();
    }
}
