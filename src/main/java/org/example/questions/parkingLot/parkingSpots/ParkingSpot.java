package org.example.questions.parkingLot.parkingSpots;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@RequiredArgsConstructor
public class ParkingSpot {
    private final int slotNumber;
    private final ParkingSpotType parkingSpotType;

    @Setter
    private boolean isAvailable = true;
}
