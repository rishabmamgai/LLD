package org.example.questions.parkingLot.parkingSlots;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@RequiredArgsConstructor
public class ParkingSlot {
    private final int slotNumber;
    private final ParkingSlotType parkingSlotType;

    @Setter
    private boolean isAvailable = true;
}
