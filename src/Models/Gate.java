package Models;

import Models.ENUMs.GateStatus;
import Models.ENUMs.GateType;
import Models.ENUMs.VehicleType;

public class Gate extends BaseModel{
    private int gateNumber;
    private Operator currentOperator;
    private GateType gateTypes;
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

    public GateType getGateTypes() {
        return gateTypes;
    }

    public void setGateTypes(GateType gateTypes) {
        this.gateTypes = gateTypes;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
