package Models;

import Models.ENUMs.GateStatus;
import Models.ENUMs.VehicleType;

public class Gate extends BaseModel{
    private int gateNumber;
    private Operator currentOperator;
    private VehicleType.GateTypes gateTypes;
    private GateStatus gateStatus;

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Operator getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(Operator currentOperator) {
        this.currentOperator = currentOperator;
    }

    public VehicleType.GateTypes getGateTypes() {
        return gateTypes;
    }

    public void setGateTypes(VehicleType.GateTypes gateTypes) {
        this.gateTypes = gateTypes;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
