package Models;

import Models.ENUMs.VehicleType;

public class Vehicle extends BaseModel{
    private String vehicleNumber;
    private String ownerName;
    private VehicleType vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VehicleType getVehicleTypes() {
        return vehicleType;
    }

    public void setVehicleTypes(VehicleType vehicleTypes) {
        this.vehicleType = vehicleTypes;
    }
}
