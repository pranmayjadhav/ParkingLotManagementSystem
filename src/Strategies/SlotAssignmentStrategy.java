package Strategies;

import Models.ENUMs.VehicleType;
import Models.Gate;
import Models.ParkingSlot;

public interface SlotAssignmentStrategy {
    public ParkingSlot getSlot(Gate gate , VehicleType vehicleType);
}
